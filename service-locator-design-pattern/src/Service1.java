public class Service1 implements Service{

    private String name;

    public String getName() {
        return "Service1";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Executing service1 ");
    }
}
