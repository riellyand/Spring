package test;

import bean.CollectionBean;
import bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void fun1(){
        //创建容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)ac.getBean("user");
       // User user1 = (User)ac.getBean("user");
      //  user.setName("张三");
        //user.setAge(12);
        System.out.println(user);
CollectionBean cb =(CollectionBean) ac.getBean("cb");
        System.out.println(cb);
       /* System.out.println(user == user1);
        //关闭容器，执行销毁方法
        ((ClassPathXmlApplicationContext) ac).close();*/

    }
}
