package xhh.club.desgin.factory.abstraction.ali;

import xhh.club.desgin.factory.abstraction.RefundFactory;

public class AliRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("退款 -> 退款路径 -> 支付宝");
    }
}
