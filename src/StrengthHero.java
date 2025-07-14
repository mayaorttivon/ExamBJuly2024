public class StrengthHero extends SuperHero{
    private int maxLift;

    public StrengthHero(double powerLevel, Person p ,int maxLift)
    {
        super(powerLevel, p);
        this.maxLift = maxLift;
    }
    @Override
    public void fight() {
        this.setPowerLevel(this.getPowerLevel()*0.9);
    }

    @Override
    public void train() {
        setPowerLevel(getPowerLevel()+ maxLift/4);
    }
}
