public class InterceptingFilterPatternDemo {

    public static void main(String[] args) {
        Filter authenticate = new Authentication();
        Filter debug = new Debug();
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(authenticate);
        filterManager.setFilter(debug);
        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendMessage("HOME");
    }
}
