import java.util.ArrayList;

public class OOPLeague {
    ArrayList<SuperHero> heroes;

    public double train()
    {
        int sum=0;
        double currentPower;
        for (SuperHero hero:
             heroes) {
            currentPower = hero.getPowerLevel();
            hero.train();
            sum += hero.getPowerLevel()-currentPower;
        }
        return sum;
    }
}
