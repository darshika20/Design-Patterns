public class Client {

    private FilterManager filterManager;

    public void setFilterManager (FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendMessage(String request){
        filterManager.filterRequest(request);
    }

}
