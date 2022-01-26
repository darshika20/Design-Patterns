public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
