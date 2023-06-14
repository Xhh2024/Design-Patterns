package xhh.club.desgin.factory.method;

public class AliPay implements Pay{
    @Override
    public void unifiedOrder() {
        System.out.println("支付 -> 支付类型 -> 支付宝支付");
    }
}
