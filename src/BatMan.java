public class BatMan extends AnimalHero implements Fly,Accessory{

    public final String LANDING_LOCATION = "Cave";
    @Override
    public String landingLocation() {
        return LANDING_LOCATION;
    }

    @Override
    public void useAccessory(String item) {
        System.out.println("BatMan is now using his: " + item);
    }
}
