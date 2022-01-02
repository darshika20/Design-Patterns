import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> resultantPersonList = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase(Constants.FEMALE.toString())) {
                resultantPersonList.add(person);
            }
        }
        return resultantPersonList;
    }
}
