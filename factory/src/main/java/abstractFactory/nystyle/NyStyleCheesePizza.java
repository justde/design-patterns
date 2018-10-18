package abstractFactory.nystyle;

import generally.pizza.Pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:57
 * @Description:
 */
public class NyStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setname("NyStyleCheesePizza");
    }
}
