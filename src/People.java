//import java.util.Comparator;
//
//public class People implements Comparator<Person> {
//    protected int maxWordsNumber;
//
//    public People (int maxWordsNumber) {
//        this.maxWordsNumber = maxWordsNumber;
//    }
//
//    @Override
//    public int compare(Person o1, Person o2) {
//        if (o1.getSurname().split(" ").length < maxWordsNumber &
//                o2.getSurname().split(" ").length < maxWordsNumber) {
//            if (o1.getSurname().split(" ").length > o2.getSurname().split(" ").length &
//                    o1.getSurname().split(" ").length < maxWordsNumber) {
//                return 1;
//            } else if (o1.getSurname().split(" ").length < o2.getSurname().split(" ").length &
//                    o2.getSurname().split(" ").length < maxWordsNumber) {
//                return -1;
//            }
//        }
//
//        if (o1.getAge() > o2.getAge()) {
//            return 1;
//        } else if (o1.getAge() < o2.getAge()) {
//            return -1;
//        }
//
//        return 0;
//    }
//}