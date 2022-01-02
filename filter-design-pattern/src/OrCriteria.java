import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrCriteria implements Criteria{
    Criteria criteria;
    Criteria anotherCriteria;

    public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        Set<Person> firstSet = new HashSet<>(criteria.meetCriteria(personList));
        for (Person person : anotherCriteria.meetCriteria(personList)) {
            if (firstSet.contains(person) == false) {
                firstSet.add(person);
            }
        }
        return new ArrayList<>(firstSet);
    }
}
