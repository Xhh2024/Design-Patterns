package xhh.club.desgin.factory.abstraction.wechat;

import xhh.club.desgin.factory.abstraction.RefundFactory;

public class WechatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("退款 -> 退款路径 -> 微信");
    }
}
