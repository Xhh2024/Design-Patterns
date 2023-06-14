package xhh.club.desgin.factory.single;

public class PayFactory{
    /**
     * 通过传递的参数类型, 去判断支付方式
     * @param type 支付类型
     * @return
     */
    public static Pay createPay(String type){
        if (type.equals("ALI_PAY_TYPE")){
            //支付宝支付
            return new AliPay();
        }else if (type.equals("WECHAT_PAY_TYPE")){
            //微信支付
            return new WechatPay();
        }else if(type.equals("OTHER")){
            //TODO 其他支付方式
        }
        return null;
    }

}
