package breakfast.decorator;

import breakfast.Food;

public class Decorator extends Food {

    Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    @Override
    public int cost() {
        return super.getPrice()+this.food.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" 配料： \n"+this.food.getDescription();
    }
}
