package pack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Roma on 18.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageConfigurator.class);
        MessagePrinter bean = context.getBean(MessagePrinter.class);

        bean.printMsg();
    }
}
