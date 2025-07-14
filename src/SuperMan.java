public class SuperMan extends StrengthHero implements Fly{

    public static final String LANDING_LOCATION = "Fortress of Solitude";
    private static final int MAX_LIFT = 1;

    public SuperMan(double powerLevel, Person p)
    {
        super(powerLevel, p, MAX_LIFT);
    }
    @Override
    public String landingLocation() {
        return LANDING_LOCATION;
    }
}
