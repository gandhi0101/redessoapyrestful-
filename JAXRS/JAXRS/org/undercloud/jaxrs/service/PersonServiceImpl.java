import java.util.HashMap;

public class PersonServiceImpl implements PersonService {
    
    private static Map<Integer,Person> persons=new HashMap<~>();
    @Override
    @POST
    @Path("/add")
    public Response addPerson(Person p){
        Response response=new Response();

        if(persons.get(p.getId())!=null){
            reponse.setStatus(false);
            response.setMessage("Person Already Exists");
            return response;
        }

        persons.put(p.getId(),p);
        response.setStatus(true);
        response.setMessage("Person create succesfully");
        return response;
    }

    @Override
    @POST
    @Path("/update")
    public Response updatePerson(Person p){
        Response response=new Response();

        if(persons.get(p.getId())==null){
            reponse.setStatus(false);
            response.setMessage("Person doesn't exist");
            return response;
        }

        persons.put(p.getId(),p);
        response.setStatus(true);
        response.setMessage("Person update succesfully");
        return response;
    }


}
