package xhh.club.desgin.factory.method;

public class WechatPayFactory implements PayFactory{
    @Override
    public Pay createPay() {
        return new WechatPay();
    }
}
