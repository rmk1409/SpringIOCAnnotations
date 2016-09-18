package pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Roma on 18.09.2016.
 */
@Configuration
@ComponentScan
public class MessageConfigurator {
    @Bean
    MessageService getService(){
        return () -> "Hi";
    }
}
