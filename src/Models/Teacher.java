package Models;

public class Teacher extends Person {
    private int yearsOFExperience;
    private int salary;
    private String subject;


    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOFExperience, int salary) {
        super(name, surname, age, gender);
        this.yearsOFExperience = yearsOFExperience;
        this.salary = salary;
        this.subject = subject;
    }

    public int getYearsOFExperience() {
        return yearsOFExperience;
    }
    public void giveRaise(double percentage) {
        this.salary = (int) (this.salary + (this.salary * percentage / 100));
    }
    @Override
    public String toString() {
        return "I teach "+subject;
    }

}
