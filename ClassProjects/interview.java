package ClassProjects;
import Classes.Person;

//interview project for lecture

public class interview {
    public static void main(String[] args) {
        int pplNum = 5; //number of applicants to be interviewed
        int lowApp = pplNum + 1;//index for person with lowest score
        int highApp = pplNum + 1;//index for person with highest score
        double low = 101;//value of lowest score (set to ceiling)
        double high = 0;//value of highest score (set to floor)
        Person[] ppl = new Person[pplNum]; //array of applicants


        //populate new ppl in array, display their stats and rating, store lowest rated
        for (int i = 0; i < pplNum; i++) {

            //display intro and applicant rating
            ppl[i] = new Person("Applicant-" + (i+1));
            System.out.println(ppl[i].intro() + "\n--Rating: " + ppl[i].getRating() + "/100" 
            + "\n--------------------------------------------------");

            //track who has the lowest rating
            if (ppl[i].getRating() < low) {low = ppl[i].getRating(); lowApp = i;}
        }

        //make lowest rated person take a quiz for more possible points
        System.out.println("\n" + ppl[lowApp].getName() + " has the lowest rating at " 
        + ppl[lowApp].getRating() + " Please take this quiz for a better rating.");

        //run quiz and add to rating
        ppl[lowApp].takeQuiz(20);
        System.out.println(ppl[lowApp].getName() + " got " + ppl[lowApp].getPoints() 
        + " questions right. Their new rating is: " + ppl[lowApp].getRating());

        //check for highest rated person and store
        for (int i = 0; i < pplNum; i++) {
            if (ppl[i].getRating() > high) {high = ppl[i].getRating(); highApp = i;}
        }

        //set job status to highest rated
        ppl[highApp].setJob(true);
        System.out.println("\n" + ppl[highApp].getName() + " has the highest rating at " 
        + ppl[highApp].getRating() + " and is offered the position. Congrats!\n");

        //display all applicant job status
        for (int i = 0; i < pplNum; i++) {
            System.out.println(ppl[i].getName() + " accepted? --> " + ppl[i].getJob());
        }

        System.out.println("winner: " + ppl[highApp].getName() + " " + ppl[highApp].getRating());
    }    
}
