package simplefactory0;

import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:08
 * @Description:
 */
public class OrderPizza {
    SimpleFactoryPizza factory;

    public OrderPizza(SimpleFactoryPizza factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = factory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;

    }

}

