public class WonderWoman extends StrengthHero implements Accessory{


    @Override
    public void useAccessory(String item) {
        setPowerLevel(getPowerLevel()+2);
    }
}
