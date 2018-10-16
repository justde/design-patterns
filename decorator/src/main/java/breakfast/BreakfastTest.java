package breakfast;

import breakfast.bing.Bing;
import breakfast.bing.JianBingGuoZi;
import breakfast.bing.ShouZhuoBing;
import breakfast.decorator.Egg;
import breakfast.decorator.Sausage;

/**
 * @author: justd
 * @Date: 18-10-16 01:07
 * @Description:
 */
public class BreakfastTest {
    public static void main(String[] args) {
        Food jianBingGuoZi = new JianBingGuoZi();
        System.out.println("order1 desc: "+jianBingGuoZi.getDescription());
        System.out.println("order1 price "+jianBingGuoZi.cost());

        System.out.println("``````````````````````````````");
        Food food = new ShouZhuoBing();
        food = new Egg(food);
        food = new Sausage(food);
        System.out.println("order2 desc: "+food.getDescription());
        System.out.println("order2 price "+food.cost());
    }
}
