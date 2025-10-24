package com.azienda.springioc.ui;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.azienda.springioc.config.SpringConfig;
import com.azienda.springioc.model.ContoCorrente;

public class Client {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			System.out.println("Lista di tutti i beans: ");
			Arrays.asList(context.getBeanDefinitionNames()).forEach(beanName ->System.out.println(beanName +" - " + context.getBean(beanName)));
			
			ContoCorrente conto=(ContoCorrente)context.getBean("contoCorrente");
			System.out.println(conto);
			
			ContoCorrente conto2= context.getBean("conto2",ContoCorrente.class);
			System.out.println(conto2);
			
//			ContoCorrente conto3= context.getBean("conto3",ContoCorrente.class);
//			System.out.println(conto3);
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
