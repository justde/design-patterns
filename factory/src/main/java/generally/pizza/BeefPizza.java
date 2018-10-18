package generally.pizza;

/**
 * @author: justd
 * @Date: 18-10-19 01:11
 * @Description:
 */
public class BeefPizza extends Pizza{
    @Override
    public void prepare() {
        super.setname("CheesePizza");
        System.out.println("CheesePizza");
    }
}
