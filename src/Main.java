import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] words1 = o1.getSurname().split(" ");
            String[] words2 = o2.getSurname().split(" ");
            int numWords1 = words1.length;
            int numWords2 = words2.length;
            if (numWords1 > 2) {
                numWords1 = 2;
            }
            if (numWords2 > 2) {
                numWords2 = 2;
            }
            if (numWords1 != numWords2) {
                return Integer.compare(numWords2, numWords1);
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}
