package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Roma on 18.09.2016.
 */
@Component
public class MessagePrinter {
    @Autowired
    private MessageService service;

    public void printMsg(){
        System.out.println(this.service.getMessage());
    }
}
