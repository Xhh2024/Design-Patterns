package xhh.club.desgin.factory.abstraction;

import xhh.club.desgin.factory.abstraction.ali.AliOrderFactory;
import xhh.club.desgin.factory.abstraction.wechat.WechatOrderFactory;

/**
 * 超级工厂创造器, 简单工厂模式
 *
 * @author 谢环环
 * @date 2023/06/14
 */
public class FactoryProducer {

    private static final String Ali_PAY = "ALI_PAY_TYPE";
    private static final String WECHAT_PAY = "WECHAT_PAY_TYPE";

    public static OrderFactory getFactory(String type){
        if (type.equals(Ali_PAY)){
            //支付宝支付
            return new AliOrderFactory();
        }else if (type.equals(WECHAT_PAY)){
            //微信支付
            return new WechatOrderFactory();
        }else if (type.equals("OTHER")){
            //TODO 其他支付方式
        }
        return null;
    }
}
