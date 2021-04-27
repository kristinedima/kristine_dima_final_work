package lv.lu.finalwork;

import lv.lu.finalwork.config.AppConfiguration;
import lv.lu.finalwork.ui.ConsulUi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductAccountingApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        context.getBean(ConsulUi.class).run();
    }

}
