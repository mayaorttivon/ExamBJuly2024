import java.io.*;
import java.util.Scanner;

public class MindHero extends SuperHero {
    int iq;

    public MindHero(double powerLevel, Person p, int iq)
    {
        super(powerLevel, p);
        this.iq = iq;
    }
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

    public File confirmPlan(File plan) throws IOException
    {
        FileReader fr = new FileReader(plan);
        Scanner sc = new Scanner(fr);
        while( sc.hasNext() )
        {
            sc.next();
        }
        FileWriter fw = new FileWriter(plan);
        fw.write("confirmed by" + this.getPerson().getName() );
        fr.close();
        fw.close();
        return plan;
    }
}
