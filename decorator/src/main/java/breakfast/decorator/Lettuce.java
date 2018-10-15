package breakfast.decorator;

import breakfast.Food;

/**
 * @author: justd
 * @Date: 18-10-16 01:04
 * @Description:
 */
public class Lettuce extends Decorator {
    public Lettuce(Food food) {
        super(food);
        super.setDescription("生菜");
        super.setPrice(1);
    }
}
