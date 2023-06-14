package xhh.club.desgin.factory.abstraction.wechat;

import xhh.club.desgin.factory.abstraction.OrderFactory;
import xhh.club.desgin.factory.abstraction.PayFactory;
import xhh.club.desgin.factory.abstraction.RefundFactory;

public class WechatOrderFactory implements OrderFactory {
    /**
     * 创建支付
     * @return {@link PayFactory}
     */
    @Override
    public PayFactory createPay() {
        return new WechatPay();
    }
    /**
     * 退款
     * @return {@link RefundFactory}
     */
    @Override
    public RefundFactory refund() {
        return new WechatRefund();
    }
}
