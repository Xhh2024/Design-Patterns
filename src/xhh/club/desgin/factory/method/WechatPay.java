package xhh.club.desgin.factory.method;


public class WechatPay implements Pay{
    @Override
    public void unifiedOrder() {
        System.out.println("支付 -> 支付类型 -> 微信支付");
    }
}
