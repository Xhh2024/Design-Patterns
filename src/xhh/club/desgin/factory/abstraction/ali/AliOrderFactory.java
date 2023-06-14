package xhh.club.desgin.factory.abstraction.ali;

import xhh.club.desgin.factory.abstraction.OrderFactory;
import xhh.club.desgin.factory.abstraction.PayFactory;
import xhh.club.desgin.factory.abstraction.RefundFactory;

public class AliOrderFactory implements OrderFactory {
    /**
     * 创建支付
     * @return {@link PayFactory}
     */
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    /**
     * 退款
     * @return {@link RefundFactory}
     */
    @Override
    public RefundFactory refund() {
        return new AliRefund();
    }
}
