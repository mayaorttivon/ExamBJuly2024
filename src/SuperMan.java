public class SuperMan extends StrengthHero implements Fly{

    public static final String LANDING_LOCATION = "Fortress of Solitude";
    @Override
    public String landingLocation() {
        return LANDING_LOCATION;
    }
}
