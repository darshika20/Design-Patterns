public class Service2 implements Service{

    private String name;

    public String getName() {
        return "Service2";
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Executing service2 ");
    }
}
