package simplefactory1.test;

import generally.pizza.Pizza;
import simplefactory1.NyStyleOrderPizza;
import simplefactory1.nystyle.NyStyleCheesePizza;

/**
 * @author: justd
 * @Date: 18-10-22 22:44
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        NyStyleOrderPizza order = new NyStyleOrderPizza();
        order.orderPizza("cheese");
        System.out.println("-------");
        order.orderPizza("veggie");
    }
}
