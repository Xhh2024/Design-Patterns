package xhh.club.desgin.factory.abstraction.wechat;

import xhh.club.desgin.factory.abstraction.PayFactory;

public class WechatPay implements PayFactory {
    @Override
    public void unifiedOrder() {
        System.out.println("支付 -> 支付类型 -> 微信支付");
    }
}
