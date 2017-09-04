package factory;

import api.Api;
import api.ImplA;
import api.ImplB;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.Context;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.io.InputStream;
import java.util.Properties;

/**
 * @author xianghuzhou
 * @version 1.0
 * @Description : 类说明
 * @date 2017/9/4 上午11:45
 */
public class Factory {

    /**
     * 具体的api实现方法
     * @param condition 外部传入的对象
     * @return
     */
    public static Api creatApi(int condition){

         switch (condition){
             case 1:{
                 return new ImplA();
             }
             case 2:
                 return new ImplB();
             default:
                 return null;
         }
    }


    public static Api creatApiByPro(){
        //读取配置文件
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in =Context.Factory.class.getResourceAsStream("/ImplClass.properties");

            properties.load(in);

        }catch (Exception e){
            System.out.println("配置文件信息出错");
        }finally {
            try {
                in.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        //反射创建api
        Api api = null;
        try {
            api = (Api) Class.forName(properties.get("ImplClass").toString()).newInstance();
        }catch (Exception e){

        }

        return api;
    }
}
