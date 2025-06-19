public class AnimalHero extends SuperHero{
    private String animal;

    @Override
    public void fight() {
       if( animal.charAt(0) =='B' )
       {
           setPowerLevel(getPowerLevel() -getPowerLevel()/3);
       }
       else
       {
           setPowerLevel(0);
       }
    }

    @Override
    public void train() {
        setPowerLevel(getPowerLevel()*2);
    }
}
