public class ServiceLocatorDesignPatternDemo {

    public static void main(String[] args) {
        ServiceLocator serviceLocator = new ServiceLocator();
        Service service = serviceLocator.getService("service1");
        service.execute();
        service = serviceLocator.getService("service2");
        service.execute();
        service = serviceLocator.getService("seRvice1");
        service.execute();
        service = serviceLocator.getService("SERVICE2");
        service.execute();
        service = serviceLocator.getService("se");


    }
}
