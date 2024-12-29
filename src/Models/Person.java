package Models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person () {}

    public Person(String name, String surname, int age, boolean gender) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(gender);
    }
    public String getName() {return name;}
    public void setName(String name) {}
    public String getSurname() {return surname;}
    public void setSurname(String surname) {}
    public int getAge() {return age;}
    public void setAge(int age) {}
    public boolean isGender() {return gender;}
    public void setGender(boolean gender) {}
    @Override

    public String toString() {
        String strGender = gender ? "male" : "female";
        return "Hi, I am "+name+surname+" and I am "+age+" years old."+ "I am "+strGender;}
}


