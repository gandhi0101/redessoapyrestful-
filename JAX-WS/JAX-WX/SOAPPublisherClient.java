
public static void main(String[] args) throws MalformedURLException{
    URL wsdlURL= new URL("http://localhost:8888/ws/person?wsdl");

    QName qname = new QName("http://service.jaxws.undercloud.org/","PersonService");

    Service service= Service.create(wsdlURL,qname);

    PersonService ps=service.getPort(PersonService.class);

    Person p1=new Person(); p1.setName("Luis"); p1.setId(1); p1.setAge(30);
    Person p2=new Person(); p2.setName("Eduardo"); p2.setId(1); p2.setAge(25);

    System.out.println("Add Person Status="+ps.addPerson(p1));
    System.out.println("Add Person Status="+ps.addPerson(p2));
}
