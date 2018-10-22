package simplefactory0;

/**
 * @author: justd
 * @Date: 18-10-22 22:56
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactoryPizza factoryPizza = new SimpleFactoryPizza();
        OrderPizza orderPizza = new OrderPizza(factoryPizza);
        orderPizza.orderPizza("greek");
    }
}
