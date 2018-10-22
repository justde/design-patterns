package simplefactory1;

import simplefactory1.nystyle.NyStyleCheesePizza;
import simplefactory1.nystyle.NyStyleVeggiePizza;
import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:55
 * @Description:
 */
public class NyStyleOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NyStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NyStyleVeggiePizza();
        }
        return pizza;
    }
}
