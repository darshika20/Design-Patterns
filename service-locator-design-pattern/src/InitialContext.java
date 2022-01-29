public class InitialContext {

    public Object lookup(String serviceName) throws NotFoundException {
        if(serviceName.equalsIgnoreCase(ServiceNames.SERVICE1.toString())){
            System.out.println("Service : " + serviceName + " is returned from JNDI Lookup");
            return new Service1();
        } else if (serviceName.equalsIgnoreCase(ServiceNames.SERVICE2.toString())){
            System.out.println("Service : " + serviceName + " is returned from JNDI Lookup");
            return new Service2();
        } else{
            throw new NotFoundException("Service Not Found!!");
        }
    }
}
