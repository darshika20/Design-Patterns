import java.util.List;

public class AndCriteria implements Criteria{

    Criteria criteria;
    Criteria anotherCriteria;

    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstPersonList = criteria.meetCriteria(personList);
        return anotherCriteria.meetCriteria(firstPersonList);
    }
}
