import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BatMan batman = new BatMan(4,new Person("Bruce Wain", "Rich"), new ArrayList<>());
        MindHero mindHero = new MindHero(9, new Person("gemini", "LLM"), 2000);
        File planToApprove = new File("D:\\secretPlans\\planB.txt");
        try {
            File approvedPlan = mindHero.confirmPlan(planToApprove);
        }
        catch (IOException ioe)
        {
            try {
                FileWriter fw = new FileWriter(planToApprove);
                fw.write("Not Approved");
                fw.close();
            }
            catch (IOException ioe2)
            {
                System.out.println("Error");
            }

        }
    }
}