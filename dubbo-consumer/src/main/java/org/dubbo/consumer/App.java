package org.dubbo.consumer;

import org.dubbo.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
 
        HelloService helloService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
        String hello = helloService.sayHello("大兄弟"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
    }
}
