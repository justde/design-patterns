package breakfast.decorator;

import breakfast.Food;

/**
 * @author: justd
 * @Date: 18-10-16 01:05
 * @Description:
 */
public class Sausage extends Decorator {
    public Sausage(Food food) {
        super(food);
        super.setDescription("香肠");
        super.setPrice(2);
    }
}
