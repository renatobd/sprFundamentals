import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]){
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SepakerService service = new SepakerServiceImpl();

        SpeakerService service = appContext.getBean("SpeakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName()  + " " +  service.findAll().get(0).getLastName());


    }
}