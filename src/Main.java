import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Leader> leaders = new ArrayList<>();
        //add different dictators
        MilitaryDictator generalZod = new MilitaryDictator("General Zod", "Krypton", 15, "General");
        PoliticalDictator chancellorPalpatine = new PoliticalDictator("Chancellor Palpatine", "Galactic Empire", 20, "Galactic Party");
        //add leaders to arraylist
        leaders.add(generalZod);
        leaders.add(chancellorPalpatine);

        //prints speech and details for each leader in the arraylist

        for (Leader leader : leaders) {
            leader.printDetails();
            System.out.println(leader.giveSpeech());

            // Check if leader is an instance of PowerActions before calling the methods
            if (leader instanceof PowerActions) {
                PowerActions actions = (PowerActions) leader;
                actions.implementPolicy("New Policy");
                actions.repressOpposition();
                actions.holdParade();
            }

            System.out.println();
        }
    }
}