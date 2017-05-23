package org.dubbo.service.provider;

import org.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService{
	
	public String sayHello(String name) {
		System.out.println("Hello : "+name);
		return name+" from server";
	}

}
