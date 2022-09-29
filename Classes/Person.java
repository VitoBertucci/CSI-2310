package Classes;
import java.util.Random;

public class Person {
    private Random r = new Random();
    private String name;//name of applicant
    private boolean job;//status of acceptance
    private double rating;//rating/100 of overall applicant quality 
    private double gpa;//GPA of applicant 
    private int age;//age of applicant
    private int exp;//years of experience applicant has
    private int skills;//number of skills applicant has
    private int points;//points earned from quiz

    
    //methods
    //introduce applicant name and age
    public String intro() {
        return ("\nHello, my name is " + name + " and I am " + age + " years old." 
        + displayResume());
    }

    //display applicant stats
    public String displayResume() {
        return ("\nHere's my resume:\nGPA: " + gpa + "\nYears of experience: " 
        + exp + "\nNumber of Skills: " + skills);
    }

    //method to actually simulate a person guessing on a quiz for 10 points
    public void takeQuiz(int num) {
        int points = 0;
        int q,a;
        for (int i = 0; i < num; i++) {
            q = r.nextInt(2);
            a = r.nextInt(2);
            if (q == a) {
                points++;
            }
        }
        this.points = points;//set number of points earned
        this.rating += points;//update rating
    }

    //gets
    public String getName() {return name;}
    public double getGpa() {return gpa;}
    public int getSkills() {return skills;}
    public int getExp() {return exp;}
    public double getRating() {return rating;}
    public boolean getJob() {return job;}
    public int getPoints() {return points;}

    //sets
    public void setJob(boolean job) {this.job = job;}

    //constructor
    public Person(String name) {
        age = (20 + r.nextInt(10));//random 20-29
        exp = r.nextInt(8);//random 0-7
        skills = r.nextInt(5);;//random 0-4
        this.name = name;//set name for applicant

        //random gpa 2.00 - 4.00
        gpa = Math.round(((2 + r.nextInt(2)) + r.nextDouble()) * 100.0) / 100.0;

        //caclulate rating
        rating = Math.round(((gpa + exp + skills) / 15) * 1000.0)/10.0;
    }
}