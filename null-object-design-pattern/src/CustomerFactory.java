public class CustomerFactory {

    private static String[] names = {"Robert","Julia","Alex","Elena"};

    public static AbstractCustomer getCustomerByName(String name) {
        for(String customer : names){
            if(customer.equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
