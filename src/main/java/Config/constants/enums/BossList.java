package Config.constants.enums;

public enum BossList {
    巴洛古(0, new int[]{105100100}, 80001535, new int[]{65}, new int[]{0}),
    炎魔(1, new int[]{211042300, 211042300, 211042300}, 80001536, new int[]{50, 90, 90}, new int[]{0, 0, 0}),
    烏勒斯(2, new int[]{970072200, 970072200, 970072200}, 0, new int[]{100, 100, 100}, new int[]{0, 0, 0}),
    梅格耐斯(3, new int[]{401060399, 401060000, 401060000}, 80001541, new int[]{115, 155, 175}, new int[]{31851, 31833, 31833}),
    希拉(4, new int[]{262030000, 262030000, 262030000}, 80001538, new int[]{120, 120, 170}, new int[]{0, 0, 0}),
    卡翁(5, new int[]{221030900, 221030900, 221030900}, 0, new int[]{180, 180, 180}, new int[]{3496, 3496, 3496}),
    拉圖斯(6, new int[]{220080000, 220080000, 220080000}, 0, new int[]{115, 155, 190}, new int[]{3470, 3470, 3470}),
    比艾樂(7, new int[]{105200000, 105200000, 105200000}, 80001544, new int[]{125, 125, 180}, new int[]{30007, 30007, 30007}),
    斑斑(8, new int[]{105200000, 105200000, 105200000}, 80001545, new int[]{125, 125, 180}, new int[]{30007, 30007, 30007}),
    血腥皇后(9, new int[]{105200000, 105200000, 105200000}, 80001546, new int[]{125, 125, 180}, new int[]{30007, 30007, 30007}),
    貝倫(10, new int[]{105200000, 105200000, 105200000}, 80001547, new int[]{125, 125, 180}, new int[]{30007, 30007, 30007}),
    凡雷恩(11, new int[]{211070000, 211070000, 211070000}, 80001539, new int[]{125, 125, 125}, new int[]{3170, 3170, 3170}),
    闇黑龍王(12, new int[]{240040700, 240040700, 240040700}, 80001537, new int[]{130, 130, 135}, new int[]{0, 0, 0}),
    阿卡伊農(13, new int[]{272000000, 272000000, 272000000}, 80001540, new int[]{140, 140, 140}, new int[]{0, 0, 0}),
    皮卡啾(14, new int[]{270040000, 270040000, 270040000}, 80001542, new int[]{160, 160, 170}, new int[]{3521, 3521, 3521}),
    西格諾斯(15, new int[]{271030600, 271030600, 271030600}, 80001543, new int[]{140, 170, 170}, new int[]{31152, 31152, 31152}),
    史烏(16, new int[]{350060300, 350060300, 350060300}, 0, new int[]{190, 190, 190}, new int[]{33294, 33294, 33294}),
    戴米安(17, new int[]{105300303, 105300303, 105300303}, 80001979, new int[]{190, 190, 190}, new int[]{34015, 34015, 34015}),
    守護天使綠水靈(18, new int[]{160000000, 160000000, 160000000}, 0, new int[]{210, 210, 210}, new int[]{36013, 36013, 36013}),
    露希妲(19, new int[]{450003600, 450003600, 450003600}, 0, new int[]{220, 220, 220}, new int[]{34330, 34330, 34330}),
    威爾(20, new int[]{450007240, 450007240, 450007240}, 0, new int[]{235, 235, 235}, new int[]{34585, 34585, 34585}),
    戴斯克(21, new int[]{450009301, 450009301, 450009301}, 80002645, new int[]{245, 245, 245}, new int[]{35632, 35632, 35632}),
    真希拉(22, new int[]{450011990, 450011990, 450011990}, 80002642, new int[]{250, 250, 250}, new int[]{35731, 35731, 35731}),
    凱爾頓(23, new int[]{450012200, 450012200, 450012200}, 80002646, new int[]{255, 255, 255}, new int[]{35815, 35815, 35815}),
    黑魔法師(24, new int[]{450012500, 450012500, 450012500}, 80002643, new int[]{255, 255, 255}, new int[]{35815, 35815, 35815}),
    受選的賽蓮(25, new int[]{410000670, 410000670, 410000670}, 0, new int[]{265, 265, 265}, new int[]{39921, 39921, 39921}),
    濃姬(26, new int[]{811000999, 811000999, 811000999}, 800011126, new int[]{140, 140, 140}, new int[]{58913, 58913, 58913}), // 還有任務58955
    培羅德(27, new int[]{863010000, 863010000, 863010000}, 800011124, new int[]{140, 140, 140}, new int[]{17523, 17523, 17523}),
    森蘭丸(28, new int[]{807300100, 807300100, 807300200}, 800011125, new int[]{120, 120, 180}, new int[]{65851, 65851, 65851}),
    ;
    private final int value, skillId;
    private final int[] mapid, minLevel, questId;

    BossList(int value, int[] mapid, int skillId, int[] minLevel, int[] questId) {
        this.value = value;
        this.mapid = mapid;
        this.skillId = skillId;
        this.minLevel = minLevel;
        this.questId = questId;
    }

    public static BossList getType(int type) {
        for (BossList bl : values()) {
            if (bl.getValue() == type) {
                return bl;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public int getMapId(int index) {
        return mapid[index];
    }

    public int getSkillId() {
        return skillId;
    }

    public int getMinLevel(int index) {
        return minLevel[index];
    }

    public int getQuestId(int index) {
        return questId[index];
    }
}
