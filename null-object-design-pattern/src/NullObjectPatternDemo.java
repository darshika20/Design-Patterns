public class NullObjectPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomerByName("Robert");
        AbstractCustomer customer2 = CustomerFactory.getCustomerByName("Elena Gilbert");
        AbstractCustomer customer3 = CustomerFactory.getCustomerByName("Alex");
        AbstractCustomer customer4 = CustomerFactory.getCustomerByName("Julian");
        System.out.println("Customers:");
        customer1.getName();
        customer2.getName();
        customer3.getName();
        customer4.getName();
    }
}
