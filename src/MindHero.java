public class MindHero extends SuperHero {
    int iq;

    @Override
    public void fight() throws NegativeNumberException{
        setPowerLevel(getPowerLevel()-10);
        if( getPowerLevel()<0 )
        {
            setPowerLevel(0);
            throw new NegativeNumberException("This hero is dead (only inside the game)");
        }
    }

    @Override
    public void train() {
        setPowerLevel(getPowerLevel()+iq*0.05);
    }
}
