package car.example.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationBeanContext.xml") ;
        MyBeans myBeans = (MyBeans) applicationContext.getBean("myBeans") ;
        myBeans.setMessage("this is the last message i'm sending");
        System.out.println(myBeans);
    }
}
