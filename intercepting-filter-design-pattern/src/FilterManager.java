public class FilterManager {

    private FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilters(filter);
    }
}
