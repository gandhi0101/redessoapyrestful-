import javax.jws.WebService;

@WebService(endpointInterface = "org.undercloud.jaxws.service.PersoneService")
public class PersonServiceImpl implements PersonService{

    private static Map<Integer,Person> persons=new HashMap<~>();

    @Override
    public boolean addPerson(Person p){
        if(persons.get(p.getId())!=null)return false;
        persons.put(p.getId(),p);
        return true;
    }

    @Override 
    public boolean deletePerson(int id){
        if(persons.get(id) == null) return false;
        persons.remove(id);
        return true;
    }

    @Override public Person getPerson(int id){
        return persons.get(id);
    }
}