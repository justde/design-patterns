package generally.pizza;

/**
 * @author: justd
 * @Date: 18-10-19 00:40
 * @Description:
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setname("CheesePizza");
        System.out.println("CheesePizza");
    }
}
