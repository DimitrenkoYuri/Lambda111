import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Том", "Елов Джесиков", 35));
        people.add(new Person("Роза", "Ростова Дубова Булгакова", 28));
        people.add(new Person("Егор", "Листов", 45));
        people.add(new Person("Радион", "Всеволоченко", 25));
        people.add(new Person("Эдуардт", "Балабуйкин", 15));
        people.add(new Person("Николай", "Постников Полченко", 10));

        people.sort((o1,o2) -> {
            if (o1.surnameLenght() > o2.surnameLenght() & o2.surnameLenght() < 3) return 1;
            if (o1.surnameLenght() < o2.surnameLenght() & o1.surnameLenght() < 3) return -1;
            if (o1.surnameLenght() == o2.surnameLenght()
                    | (o1.surnameLenght() >= 3 & o2.surnameLenght() >= 3)) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else return -1;
            }
            return 0;
        });

        //Collections.sort(people, new People(4));
        System.out.println(people.toString());

    }
}