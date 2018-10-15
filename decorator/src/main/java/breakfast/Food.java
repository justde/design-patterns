package breakfast;

public abstract class Food {
    public String description = "";
    private int price = 0;

    public abstract int cost();

    public String getDescription() {
        return description + "---" + this.getPrice();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
