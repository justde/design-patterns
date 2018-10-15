package cofferbar.coffer;

import cofferbar.Drink;

public class Coffer extends Drink {

    @Override
    public int cost() {
        return super.getPrice();
    }
}
