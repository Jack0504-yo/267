player.setInGameCurNodeEventEnd(true)
player.setInGameDirectionMode(true, false, false, false)
player.setLayerBlind(true, 255, 0, 0, 0, 0, 0)
player.setInGameCurNodeEventEnd(true)
player.showSpineScreen(0, "Effect/Direction20.img/bossKaring/2phase_spine/skeleton", "animation", "intro")
player.soundEffect("Sound/SoundEff.img/karing/2phase", 200, 0, 0)
npc.setDelay(8100)
player.offSpineScreen("intro", 100)
player.inGameDirection22(700)
player.setInGameDirectionMode(false, true, false, false)
player.changeMap(player.getMapId() + 20, 0)
