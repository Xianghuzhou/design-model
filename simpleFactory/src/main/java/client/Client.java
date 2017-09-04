package client;

import api.Api;
import factory.Factory;

/**
 * @author xianghuzhou
 * @version 1.0
 * @Description : 类说明
 * @date 2017/9/4 上午11:48
 */
public class Client {

    public static void main(String[] args) {
        Api api = Factory.creatApi(1);
        api.operation("调用工厂");

        api = Factory.creatApiByPro();
        api.operation("调用工厂");
    }
}
