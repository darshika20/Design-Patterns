/**
 * Filter design pattern (structural pattern) is used to filter a list of objects based
 * on different kinds of criteria using decoupling and in a logical way
 * */

import java.util.ArrayList;
import java.util.List;

public class FilterDesignPatternDemo {
    public static void main(String [] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert","Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Criteria criteria = new MaleCriteria();

        System.out.println("Males: ");
        printPersonList(criteria.meetCriteria(personList));

        criteria = new FemaleCriteria();

        System.out.println("Females: ");
        printPersonList(criteria.meetCriteria(personList));

        criteria = new AndCriteria(new MaleCriteria(), new SingleCriteria());

        System.out.println("Single males: ");
        printPersonList(criteria.meetCriteria(personList));

        criteria = new OrCriteria(new FemaleCriteria(), new SingleCriteria());

        System.out.println("Single or female: ");
        printPersonList(criteria.meetCriteria(personList));

    }

    private static void printPersonList(List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
