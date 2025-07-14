public class WonderWoman extends StrengthHero implements Accessory{

    private static final int MAX_LIFT = 2;

    public WonderWoman(double powerLevel, Person p)
    {
        super(powerLevel, p, MAX_LIFT);
    }
    @Override
    public void useAccessory(String item) {
        setPowerLevel(getPowerLevel()+2);
    }
}
