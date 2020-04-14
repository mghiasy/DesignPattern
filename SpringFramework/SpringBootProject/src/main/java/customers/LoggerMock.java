package customers;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Profile("Two")
public class LoggerMock implements ILogger{

    public void log(String logstring) {
        System.out.println("Mock Logging "+ LocalDateTime.now()+" "+logstring);
    }
}
