import java.util.HashMap;
import java.util.Map;

public class Cache {

    private Map<String, Service> services;

    public Cache(){
        services = new HashMap<>();
    }

    public void addService(Service service){
        if(!services.containsKey(service.getName())){
            System.out.println("Adding service " + service.getName() + " to cache");
            services.put(service.getName(), service);
        } else {
            System.out.println("Service " + service.getName() + " already exists in cache");
        }
    }

    public Service getService(String serviceName) {
        if(!services.containsKey(serviceName)){
            System.out.println("Service " + serviceName + " is not present in cache!!");
            return null;
        } else {
            System.out.println("Returning service " + serviceName + " from cache");
            return services.get(serviceName);
        }
    }
}
