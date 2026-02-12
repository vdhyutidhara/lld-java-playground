import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main( String[] args ) {
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService speakerService = new SpeakerServiceImpl();

        SpeakerService service = appcontext.getBean("speakerService", SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service2 = appcontext.getBean("speakerService", SpeakerService.class);

        System.out.println(service2);
    }
}
