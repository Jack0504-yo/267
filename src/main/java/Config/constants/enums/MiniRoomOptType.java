/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Config.constants.enums;

public enum MiniRoomOptType {
    TRP_PutItem(0),
    TRP_PutItem_2(1),
    TRP_PutItem_3(2),
    TRP_PutItem_MAX(3),
    TRP_PutMoney(4),
    TRP_PutMoney_2(5),
    TRP_PutMoney_3(6),
    TRP_PutMoney_MAX(7),
    TRP_Trade(8),
    TRP_Trade_2(9),
    TRP_Trade_3(10),
    TRP_Trade_MAX(11),
    TRP_UnTrade(12),
    TRP_MoveItemToInventory(13),
    TRP_ItemCRC(14),
    TRP_TradeRestraintItem(15),
    MRP_Create(16),
    MRP_CreateCancel(17),
    MRP_CreateResult(18),
    MRP_Enter(19),
    MRP_EnterResult(20),
    MRP_Invite(21),
    MRP_InviteResult(22),
    MRP_GameMessage(23),
    MRP_Chat(24),
    MRP_UserChat(25),
    MRP_Balloon(26),
    MRP_Avatar(27),
    MRP_Leave(28),
    MRP_NotAvailableField(29),
    MRP_CheckSSN2(30),
    ESP_PutItem(31),
    ESP_PutItem_2(32),
    ESP_PutItem_3(33),
    ESP_PutItem_MAX(34),
    ESP_BuyItem(35),//僱傭商店
    ESP_BuyItem_2(36),
    ESP_BuyItem_3(37),
    ESP_BuyItem_MAX(38),
    ESP_PutPurchaseItem(39),
    ESP_SellItem(40),
    ESP_SellItem_2(41),
    ESP_SellItem_3(42),
    ESP_SellItem_MAX(43),
    ESP_BuyResult(44),
    ESP_Refresh(45),
    ESP_AddSoldItem(46),
    ESP_MoveItemToInventory(47),
    ESP_GoOut(48),
    ESP_ArrangeItem(49),
    ESP_WithdrawAll(50),
    ESP_WithdrawAllResult(51),
    ESP_WithdrawMoney(52),
    ESP_WithdrawMoneyResult(53),
    ESP_AdminChangeTitle(54),
    ESP_DeliverVisitList(55),
    ESP_DeliverBlackList(56),
    ESP_AddBlackList(57),
    ESP_DeleteBlackList(58),
    ESP_SetTitle(59),
    ESP_ForcedClosed(60),
    PSP_PutItem(61),//玩家商店
    PSP_PutItem_2(62),
    PSP_PutItem_3(63),
    PSP_PutItem_MAX(64),
    PSP_BuyItem(65),
    PSP_BuyItem_2(66),
    PSP_BuyItem_3(67),
    PSP_BuyItem_MAX(68),
    PSP_PutPurchaseItem(69),
    PSP_BuyResult(70),
    PSP_SellItem(71),
    PSP_SellItem_2(72),
    PSP_SellItem_3(73),
    PSP_SellItem_MAX(74),
    PSP_SellResult(75),
    PSP_Refresh(76),
    PSP_AddSoldItem(77),
    PSP_MoveItemToInventory(78),
    PSP_Ban(79),//移除玩家
    PSP_KickedTimeOver(80),
    PSP_RegisterBlackList(81),
    PSP_AddBlackList(82),
    PSP_DeleteBlackList(83),
    PSP_SetTitle(84),
    PSP_TradeRestraintItem(-1),
    MGRP_TieRequest(85),
    MGRP_TieResult(86),
    MGRP_GiveUpRequest(87),
    MGRP_GiveUpResult(88),
    MGRP_RetreatRequest(89),
    MGRP_RetreatResult(90),
    MGRP_LeaveEngage(91),
    MGRP_LeaveEngageCancel(92),
    MGRP_Ready(93),
    MGRP_CancelReady(94),
    MGRP_Ban(95),
    MGRP_Start(96),
    MGRP_GameResult(97),
    MGRP_TimeOver(98),
    ORP_PutStoneChecker(99),
    ORP_InvalidStonePosition(100),
    ORP_InvalidStonePosition_Normal(101),
    ORP_InvalidStonePosition_By33(102),
    MGP_TurnUpCard(103),
    MGP_MatchCard(104),
    WRP_PrepareWedding(106),
    WRP_StartWedding(107),
    WRP_EndWedding(108),
    WRP_Finale(109),
    WRP_FinaleResult(110),
    WRP_Ban(111),
    WRP_CenterResult(112),
    RPS_Invite(113),
    RPS_Result(114),
    CTRP_Gift(115),
    CTRP_Reply(116),
    BG_Init_Req(117),
    BG_Init_Ack(118),
    BG_Start_Req(119),
    BG_Start_Ack(120),
    BG_Invite_Req(121),
    BG_Dice_Req(122),
    BG_Dice_Ack(123),
    BG_Result_Ack(124),
    BG_Leave_Ack(125),
    BG_Error_Ack(126),
    BG_YourTurn_Ack(127),
    BG_TimeOver_Ack(128),
    BG_OppUserAI_Ack(129),
    MYG_Select_Piece_Req(130),
    MYG_Select_Piece_Ack(131),
    MYG_Choose_Position_Req(132),
    MYG_Choose_Position_Ack(133),
    MYG_Opp_Choose_Position_Ack(134),
    MYG_Finish_Piece_Req(135),
    MYG_Finish_Piece_Ack(136),
    MYG_Finish_Dice_Req(137),
    MYG_Finish_Dice_Not_Auto_Req(138),
    MYG_ReSelect_Req(139),
    MYG_ReSelect_Ack(140),
    MYG_Use_Skill_Req(141),
    MYG_Use_Skill_Ack(142),
    MYG_Opp_Use_Skill_Ack(143),
    MYG_History_Ack(144),
    MYG_Set_Position_Ack(145),
    MYG_Select_Other_Piece_Req(146),
    MYG_Select_Other_Piece_Ack(147),
    MYG_Select_Piece_Skill_Ack(148),
    MYG_Choose_Position_Skill_Req(149),
    MYG_Choose_Put_Item_Ack(150),
    MYG_Restart_Piece_Ack(151),
    MYG_Reset_Skill_Req(152),
    MYG_Reset_Skill_Ack(153),
    MYG_Put_Piece_Ack(154),
    MYG_Reset_Block_Ack(155),
    MYG_Change_Piece_State_Ack(156),
    MYG_Reset_Time_Ack(157),
    ONECARD_Request(189),
    ONECARD_EmotionRequest(190),
    ONECARD_PutCardResult(191),
    ONECARD_GetCardResult(192),
    ONECARD_ChangeColorResult(193),
    ONECARD_UserPossibleActionResult(194),
    ONECARD_ScreenEffect(195),
    ONECARD_EffectResult(196),
    ONECARD_EmotionResult(197),
    ONECARD_UIOpenAck(198),
    ONECARD_ScreenMessage(199);

    private int code = -2;

    MiniRoomOptType(int code) {
        this.code = code;
    }

    public static MiniRoomOptType getByAction(int packetId) {
        MiniRoomOptType[] values = MiniRoomOptType.values();
        for (int i = 0, valuesLength = values.length; i < valuesLength; i++) {
            MiniRoomOptType interaction = values[i];
            if (interaction.getValue() == packetId) {
                return interaction;
            }
        }
        return null;
    }

    public short getValue() {
        return (short) code;
    }

}
