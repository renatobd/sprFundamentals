import com.pluralsight.service.SepakerService;
import com.pluralsight.service.SepakerServiceImpl;

public class Application {
    public static void main(String args[]){
        SepakerService service = new SepakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName()  + " " +  service.findAll().get(0).getLastName());
    }
}
