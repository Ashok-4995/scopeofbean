package com.singleton.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;


@Configuration
public class UseEmployee implements CommandLineRunner{
	
	@Autowired
	ApplicationContext Ac;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e1=Ac.getBean(Employee.class);
		System.out.println(e1);
		Employee e2=Ac.getBean(Employee.class);
		e2.setName("arun");
		System.out.println(e2);
		Employee e3=Ac.getBean(Employee.class);
		System.out.println(e3);
		
	}

	
	@Bean
	@Scope("prototype")
	public Employee get() {
		return new Employee();
	}
	
	

}
