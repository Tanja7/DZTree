import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Василий", "Потапов", 34));
        people.add(new Person("Елена", "Соколова Архипова Маликова", 53));
        people.add(new Person("Александр", "Панкратов Черный", 12));
        people.add(new Person("Ольга", "Воробьева", 25));
        people.add(new Person("Николай", "Ефремов Задунайский", 65));
        people.add(new Person("Татьяна", "Николаева Потехина", 37));
        people.add(new Person("Сергей", "Патрикеев Ерохин Тапков", 42));

        Collections.sort(people, new PersonSurnameLengthComparator(2));

        System.out.println(people);
    }

}
