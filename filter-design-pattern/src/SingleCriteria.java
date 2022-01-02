import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> resultantPersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase(Constants.SINGLE.toString())) {
                resultantPersonList.add(person);
            }
        }
        return resultantPersonList;
    }
}
