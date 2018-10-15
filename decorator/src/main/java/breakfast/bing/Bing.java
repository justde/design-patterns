package breakfast.bing;

import breakfast.Food;

public class Bing extends Food {

    @Override
    public int cost() {
        return super.getPrice();
    }
}
