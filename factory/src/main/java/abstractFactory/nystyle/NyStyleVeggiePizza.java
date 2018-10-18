package abstractFactory.nystyle;

import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:59
 * @Description:
 */
public class NyStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        super.setname("NyStyleVeggiePizza");
    }
}
