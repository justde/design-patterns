package generally.pizza;

/**
 * @author: justd
 * @Date: 18-10-19 00:41
 * @Description:
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        super.setname("GreekPizza");
        System.out.println("GreekPizza");
    }
}
