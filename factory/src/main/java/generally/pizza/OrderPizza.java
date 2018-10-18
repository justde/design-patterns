package generally.pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: justd
 * @Date: 18-10-19 00:42
 * @Description:
 */
public class OrderPizza {
    public OrderPizza() {
        String type = null;
        Pizza pizza = null;
        do {
            type = getType();
            if ("greek".equals(type)){
                pizza = new GreekPizza();
            }else if ("cheese".equals(type)){
                pizza = new CheesePizza();
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }


    private String getType(){
        String type = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:  ");
            type = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return type;
    }
}
