package xhh.club.desgin.factory.method;

public class Main {

    private static final String Ali_PAY = "ALI_PAY_TYPE";
    private static final String WECHAT_PAY = "WECHAT_PAY_TYPE";

    public static void main(String[] args) {
        //支付宝支付
        AliPayFactory aliPay = new AliPayFactory();
        aliPay.createPay().unifiedOrder();

        //微信支付
        WechatPayFactory wechatPay = new WechatPayFactory();
        wechatPay.createPay().unifiedOrder();
    }
}
