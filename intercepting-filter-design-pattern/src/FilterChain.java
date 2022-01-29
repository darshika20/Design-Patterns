import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<Filter> filters;
    private Target target;

    public FilterChain() {
        this.filters = new ArrayList<>();
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void addFilters(Filter filters) {
        this.filters.add(filters);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request){
        for(Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }
}
