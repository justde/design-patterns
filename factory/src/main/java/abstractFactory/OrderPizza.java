package abstractFactory;

import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:45
 * @Description:
 */
public abstract class OrderPizza {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
