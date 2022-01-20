/**
 * In Composite Design Pattern , Objects of the same class are used within it , here Employee Class uses its own
 * objects to represent its subordinates
 * */

public class CompositeDesignPatternDemo {

    public static void main (String [] args) {

        Employee ceo = new Employee("John","CEO",30000000);

        Employee marketingHead = new Employee("Maria","Marketing Head", 1000000);
        Employee salesHead = new Employee("Armaan","Sales Head", 1000000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        ceo.addSubOrdinates(marketingHead);
        ceo.addSubOrdinates(salesHead);

        marketingHead.addSubOrdinates(clerk1);
        marketingHead.addSubOrdinates(clerk2);

        salesHead.addSubOrdinates(salesExecutive1);
        salesHead.addSubOrdinates(salesExecutive2);

        System.out.println(ceo);
        System.out.println("Subordinates of " + ceo.getName() + "are: ");
        for (Employee headEmployee : ceo.getSubOrdinates()) {

            System.out.println("Subordinates of " + headEmployee.getName() + "are: ");
            for (Employee employee : headEmployee.getSubOrdinates()) {
                System.out.println(employee);
            }

        }
    }
}
