package xhh.club.desgin.factory.abstraction;

/**
 * 订单工厂 -> 超级工厂
 */
public interface OrderFactory {

    //下单支付
    PayFactory createPay();

    //退款操作
    RefundFactory refund();
}
