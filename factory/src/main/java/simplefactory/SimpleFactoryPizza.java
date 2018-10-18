package simplefactory;

import generally.pizza.BeefPizza;
import generally.pizza.CheesePizza;
import generally.pizza.GreekPizza;
import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:09
 * @Description:
 */
public class SimpleFactoryPizza {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("greek".equals(type)) {
            pizza=new GreekPizza();
        }else if ("cheese".equals(type)) {
            pizza=new CheesePizza();
        }else if ("beef".equals(type)) {
            pizza=new BeefPizza();
        }
        return pizza;
    }
}
