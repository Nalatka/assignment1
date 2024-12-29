package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Student extends Person {
    private int id;
    List<Integer> grades= new ArrayList<>();
    private static int id_gen=1;

    private void createId(){id=id_gen++;}

    public Student(){createId();}

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.grades = new ArrayList<>();
    }

    public int getId(){return id;}
    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getAverageGrade(){
        return grades.stream().mapToInt(grade->grade).average().getAsDouble();
    }
    @Override
    public String toString() {
        return "Hi, my Id is" + id;
    }
}
