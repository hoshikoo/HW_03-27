package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/27/15.
 */
public class VotingSimulator {


    public static void main(String[] args) {
        //Create an Election object, and given the Election a name
       Election elec = new Election("name of election");

        //Create a few Contender objects. Add these to the Election object. Make sure that the contender names are distinct!
        Contender a = new Contender("Hoshiko");
        Contender b = new Contender("Rieko");
        Contender c = new Contender("Taeko");

        //add to the listOfContenders.
        elec.add(a);
        elec.add(b);
        elec.add(c);


        //Create a ElectionManager object.
        ElectionManager elecManager = new ElectionManager();

        //Ask it to manage the Election object created above.
        elecManager.manage(elec);

        //Ask the ElectionManager to initiatePolling
        elecManager.initiatePolling();

        //Ask the ElectionManager to displayResults
        elecManager.displayResults();

    }
}
