package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.JuiceMaker;
import pojo.Source;

public class TestSpring {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );

        Source source = (Source) context.getBean("source1");
        System.out.println(source.getFruit());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        JuiceMaker juiceMaker = (JuiceMaker) context.getBean("juiceMaker");
        System.out.println(juiceMaker.makeJuice());


        // bean scope
        // 前两个 是同一个对象，通过thread生成了新的对象
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        for (String scopeKey :
                applicationContext.getBeanFactory().getRegisteredScopeNames()) {
            System.out.println(scopeKey);
        }
        Source source1 = (Source) applicationContext.getBean("myThreadBean");
        System.out.println(source1.toString() + ":" + source1.getFruit());
        Source source2 = (Source) applicationContext.getBean("myThreadBean");
        System.out.println(source2.toString() + ":" + source2.getFruit());

        new Thread(() -> {
            Source source3 = (Source) applicationContext.getBean("myThreadBean");
            System.out.println(source3.toString() + ":" + source3.getFruit());
        }
        ).start();

    }
}
