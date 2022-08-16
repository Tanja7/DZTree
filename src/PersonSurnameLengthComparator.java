import java.util.Comparator;

public class PersonSurnameLengthComparator implements Comparator<Person> {
    private int wordsMax;

    public PersonSurnameLengthComparator(int wordsMax) {
        this.wordsMax = wordsMax;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] words1 = o1.getSurname().split(" ");
        String[] words2 = o2.getSurname().split(" ");
        int numWords1 = words1.length;
        int numWords2 = words2.length;
        if (numWords1 > wordsMax) {
            numWords1 = wordsMax;
        }
        if (numWords2 > wordsMax) {
            numWords2 = wordsMax;
        }
        if (numWords1 != numWords2) {
            return Integer.compare(numWords2, numWords1);
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}
