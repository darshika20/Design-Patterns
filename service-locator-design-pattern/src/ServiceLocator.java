public class ServiceLocator {

    private static Cache cache;
    private InitialContext initialContext = new InitialContext();

    static {
        cache = new Cache();
    }

    public Service getService(String serviceName) {
        Service service = cache.getService(serviceName);
        if (service != null) {
            return service;
        } else {
            try {
                service = (Service) initialContext.lookup(serviceName);
                cache.addService(service);
                return service;
            } catch (NotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}
