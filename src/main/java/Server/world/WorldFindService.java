/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.world;

import Client.MapleCharacter;
import Server.channel.ChannelServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author PlayDK
 */
public class WorldFindService {

    private static final Logger log = LoggerFactory.getLogger(WorldFindService.class);
    private final ReentrantReadWriteLock lock;
    private final HashMap<Integer, Integer> idToChannel;
    private final HashMap<String, Integer> nameToChannel;

    private WorldFindService() {
        //log.info("正在啟動[WorldFindService]");
        lock = new ReentrantReadWriteLock();
        idToChannel = new HashMap<>();
        nameToChannel = new HashMap<>();
    }

    public static WorldFindService getInstance() {
        return SingletonHolder.instance;
    }

    public void register(int chrId, String chrName, int channel) {
        lock.writeLock().lock();
        try {
            idToChannel.put(chrId, channel);
            nameToChannel.put(chrName.toLowerCase(), channel);
        } finally {
            lock.writeLock().unlock();
        }
        if (channel == -10) {
            System.out.println("玩家連接 - 角色ID: " + chrId + " 名字: " + chrName + " 進入購物商場");
        } else if (channel == -20) {
            System.out.println("玩家連接 - 角色ID: " + chrId + " 名字: " + chrName + " 進入拍賣場");
        } else if (channel > -1) {
            System.out.println("玩家連接 - 角色ID: " + chrId + " 名字: " + chrName + " 頻道: " + channel);
        } else {
            System.out.println("玩家連接 - 角色ID: " + chrId + " 未處理的頻道...");
        }
    }

    public void forceDeregister(int chrId) {
        lock.writeLock().lock();
        try {
            idToChannel.remove(chrId);
        } finally {
            lock.writeLock().unlock();
        }
        System.out.println("玩家離開 - 角色ID: " + chrId);
    }

    public void forceDeregister(String chrName) {
        lock.writeLock().lock();
        try {
            if (chrName != null) {
                nameToChannel.remove(chrName.toLowerCase());
            }
        } finally {
            lock.writeLock().unlock();
        }
        System.out.println("玩家離開 - 角色名字: " + chrName);
    }

    public void forceDeregister(int chrId, String chrName) {
        lock.writeLock().lock();
        try {
            idToChannel.remove(chrId);
            if (chrName != null) {
                nameToChannel.remove(chrName.toLowerCase());
            }
        } finally {
            lock.writeLock().unlock();
        }
        System.out.println("玩家離開 - 角色ID: " + chrId + " 名字: " + chrName);
    }

    public void forceDeregisterEx(int chrId, String chrName) {
        lock.writeLock().lock();
        try {
            idToChannel.remove(chrId);
            if (chrName != null) {
                nameToChannel.remove(chrName.toLowerCase());
            }
        } finally {
            lock.writeLock().unlock();
        }
        System.out.println("清理卡號玩家 - 角色ID: " + chrId + " 名字: " + chrName);
    }

    /*
     * 通過角色的ID 找到角色的頻道
     */
    public int findChannel(int chrId) {
        Integer ret;
        lock.readLock().lock();
        try {
            ret = idToChannel.get(chrId);
        } finally {
            lock.readLock().unlock();
        }
        if (ret != null) {
            if (ret != -10 && ret != -20 && ChannelServer.getInstance(ret) == null) { //wha
                forceDeregister(chrId);
                return -1;
            }
            return ret;
        }
        return -1;
    }

    /*
     * 通過角色的名字 找到角色的頻道
     */
    public int findChannel(String chrName) {
        Integer ret;
        lock.readLock().lock();
        try {
            ret = chrName == null ? null : nameToChannel.get(chrName.toLowerCase());
        } finally {
            lock.readLock().unlock();
        }
        if (ret != null) {
            /*
             * 如果找到了這個角色 但是這個頻道是空的 就刪除這個角色註冊到服務端的信息 返回 -1
             */
            if (ret != -10 && ret != -20 && ChannelServer.getInstance(ret) == null) {
                forceDeregister(chrName);
                return -1;
            }
            return ret;
        }
        return -1;
    }

    /*
     * 好友列表獲取 好友的在線信息
     */
    public CharacterIdChannelPair[] multiBuddyFind(int charIdFrom, int[] characterIds) {
        List<CharacterIdChannelPair> foundsChars = new ArrayList<>(characterIds.length);
        for (int i : characterIds) {
            int channel = findChannel(i);
            if (channel > 0) {
                foundsChars.add(new CharacterIdChannelPair(i, channel));
            }
        }
        Collections.sort(foundsChars);
        return foundsChars.toArray(new CharacterIdChannelPair[foundsChars.size()]);
    }

    /*
     * 通過角色名字 找到角色信息
     */
    public MapleCharacter findCharacterByName(String name) {
        int ch = findChannel(name);
        if (ch > 0) {
            return ChannelServer.getInstance(ch).getPlayerStorage().getCharacterByName(name);
        }
        return null;
    }

    /*
     * 通過角色ID 找到角色信息
     */
    public MapleCharacter findCharacterById(int id) {
        int ch = findChannel(id);
        if (ch > 0) {
            return ChannelServer.getInstance(ch).getPlayerStorage().getCharacterById(id);
        }
        return null;
    }

    private static class SingletonHolder {

        protected static final WorldFindService instance = new WorldFindService();
    }
}
