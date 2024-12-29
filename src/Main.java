import Models.Student;
import Models.Teacher;
import Models.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/students.txt");
        Scanner sc= new Scanner(file);
        School school = new School();

        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().split(" ");
            String name = line[0];
            String surname = line[1];
            int age = Integer.parseInt(line[2]);
            boolean gender = line[3].trim().equalsIgnoreCase("Male");

            Student student = new Student(name, surname, age, gender);
            for(int i=4;i<line.length;i++) {
                student.addGrade(Integer.parseInt(line[i]));
            }
            System.out.println(student.getAverageGrade()/25);

            school.addMember(student);

        }
        File file2 = new File("src/teachers.txt");
        Scanner sc2 = new Scanner(file2);
        while (sc2.hasNextLine()) {
            String[] line = sc2.nextLine().split(" ");
            String name = line[0];
            String surname = line[1];
            int age = Integer.parseInt(line[2]);
            boolean gender = Boolean.parseBoolean(line[3]);
            String subject = line[4];
            int yearsOFExperience= Integer.parseInt(line[5]);
            int salary= Integer.parseInt(line[6]);
            Teacher teacher = new Teacher(name, surname,age,gender,subject,yearsOFExperience,salary);
            if(teacher.getYearsOFExperience()>10) {
                teacher.giveRaise(30);
            }
            school.addMember(
                    teacher);
        }
        System.out.println(school);

    }
}