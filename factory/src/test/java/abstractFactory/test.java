package abstractFactory;

import com.sun.org.apache.xpath.internal.operations.Or;
import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 02:04
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        OrderPizza orderPizza = new NyStyleOrderPizza();
        Pizza pi = orderPizza.orderPizza("cheese");
        Pizza pizza = orderPizza.orderPizza("veggie");
    }
}
