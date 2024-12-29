package Models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Person> members;
    public School() {
        this.members = new ArrayList<>();
    }
    public void addMember(Person person) {
        this.members.add(person);
    }
    @Override
    public String toString() {
        members.sort(Comparator.comparing(Person::toString));
        return members.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }
}
