package simplefactory;

import generally.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: justd
 * @Date: 18-10-19 01:08
 * @Description:
 */
public class OrderPizza {
    OrderPizza(SimpleFactoryPizza factory){
        String type=null;
        Pizza pizza=null;
        do {
            type=getType();
            pizza=factory.createPizza(type);
            if (pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        } while (true);
    }

    private String getType(){
        String type=null;
        BufferedReader br=null;
        try {
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            type= br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
        return type;
    }
}

