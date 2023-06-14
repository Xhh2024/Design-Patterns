package xhh.club.desgin.factory.abstraction.ali;

import xhh.club.desgin.factory.abstraction.PayFactory;

public class AliPay implements PayFactory {
    @Override
    public void unifiedOrder() {
        System.out.println("支付 -> 支付类型 -> 支付宝支付");
    }
}
