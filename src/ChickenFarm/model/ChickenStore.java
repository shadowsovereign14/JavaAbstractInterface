package ChickenFarm.model;

public abstract class ChickenStore {
    private int cockCost = 5;
    private int henCost = 3;
    private int chickenCost = 1;

    public abstract int getMaxCock();

    public abstract int getMaxHen();

    public abstract int getMaxChicken();

    public int getCockCost() {
        return cockCost;
    }

    public int getHenCost() {
        return henCost;
    }

    public int getChickenCost() {
        return chickenCost;
    }
}
