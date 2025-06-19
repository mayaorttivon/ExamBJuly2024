public class StrengthHero extends SuperHero{
    private int maxLift;

    @Override
    public void fight() {
        this.setPowerLevel(this.getPowerLevel()*0.9);
    }

    @Override
    public void train() {
        setPowerLevel(getPowerLevel()+ maxLift/4);
    }
}
