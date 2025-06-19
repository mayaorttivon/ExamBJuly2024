public abstract class SuperHero {

    private double powerLevel;

    private Person person;
    public abstract void fight() throws NegativeNumberException;

    public abstract void train();

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }
}
