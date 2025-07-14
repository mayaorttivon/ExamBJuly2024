import java.util.ArrayList;

public class AnimalHero extends SuperHero{
    private ArrayList<String> animalCharacteristics;

    public AnimalHero(double powerLevel, Person p, ArrayList<String> animalCharacteristics)
    {
        super(powerLevel, p);
        //this is the better way. but this.animalCharacteristics = animalcharacteristic
        //will also be accepted at the exam
        this.animalCharacteristics = new ArrayList<String>(animalCharacteristics);
    }
    public ArrayList<String> getAnimalCharacteristics() {
        return animalCharacteristics;
    }

    public void setAnimalCharacteristics(ArrayList<String> animalCharacteristics) {
        this.animalCharacteristics = animalCharacteristics;
    }

    @Override
    public void fight() {
      /* if( animal.charAt(0) =='B' )
       {
           setPowerLevel(getPowerLevel() -getPowerLevel()/3);
       }
       else
       {
           setPowerLevel(0);
       }*/

    }

    @Override
    public void train() {
        setPowerLevel(getPowerLevel()*2);
    }
}
