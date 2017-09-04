package api;

/**
 * @author xianghuzhou
 * @version 1.0
 * @Description : 抽象工厂接口
 * @date 2017/9/4 下午1:38
 */
public interface AbstractFactory {

    /**
     * 实例方法,创建产品A的抽象对象
     * @return
     */
    public AbstractProductA creatProductA();

    /**
     * 示例方法,创建产品B的抽象对象
     * @return
     */
    public AbstractProductB creatProductB();
}
