package Beverages;

public class PikesPlace extends Beverage {
    public PikesPlace() {
        description = "Pike's Place";
    }

    @Override
    public double cost() {
        return 1.40;
    }
}
