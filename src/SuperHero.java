public abstract class SuperHero {

    private double powerLevel;
    private Person person;

    public SuperHero(double powerLevel, Person p)
    {
        this.powerLevel = powerLevel;
        this.person = p;
    }

    public abstract void fight() throws NegativeNumberException;

    public abstract void train();

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
