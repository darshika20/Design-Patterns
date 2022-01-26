public class NullCustomer extends AbstractCustomer{

    @Override
    public void getName() {
        System.out.println("Customer not found!!");
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
