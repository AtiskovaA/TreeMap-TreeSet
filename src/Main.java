import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person("Анна", "Мырсакат Уллу", 30));
        listPeople.add(new Person("Адриан", "Танги Мио Ти", 25));
        listPeople.add(new Person("Лоди", "Юдин Мыс", 28));
        listPeople.add(new Person("Мадин", "Фролов", 28));
        System.out.println(listPeople);

        Collections.sort(listPeople, new PersonComparator());
        System.out.println(listPeople);
    }

}
