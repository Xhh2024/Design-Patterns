package xhh.club.desgin.factory.single;

/**
 * 测试简单/静态工厂
 */
public class Main {
    private static final String Ali_PAY = "ALI_PAY_TYPE";
    private static final String WECHAT_PAY = "WECHAT_PAY_TYPE";
    public static void main(String[] args) {
        //调用支付宝支付
        PayFactory.createPay(Ali_PAY).unifiedOrder();
        //调用微信支付
        PayFactory.createPay(WECHAT_PAY).unifiedOrder();
    }
}
