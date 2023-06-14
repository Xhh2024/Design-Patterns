package xhh.club.desgin.factory.abstraction;

public class Main {

    public static void main(String[] args) {
        //支付宝类型
        OrderFactory aliPayType = FactoryProducer.getFactory("ALI_PAY_TYPE");
        //支付操作
        PayFactory aliPay = aliPayType.createPay();
        aliPay.unifiedOrder();
        //退款操作
        RefundFactory aliRefund = aliPayType.refund();
        aliRefund.refund();

        //微信类型
        OrderFactory wechatPayType = FactoryProducer.getFactory("WECHAT_PAY_TYPE");
        //支付操作
        PayFactory wechatPay = wechatPayType.createPay();
        wechatPay.unifiedOrder();
        //退款操作
        RefundFactory wechatRefund = wechatPayType.refund();
        wechatRefund.refund();

    }
}
