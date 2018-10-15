package breakfast.decorator;

import breakfast.Food;

/**
 * @author: justd
 * @Date: 18-10-16 01:01
 * @Description:
 */
public class Egg extends Decorator {
    public Egg(Food food) {
        super(food);
        super.setDescription("鸡蛋");
        super.setPrice(1);
    }
}
