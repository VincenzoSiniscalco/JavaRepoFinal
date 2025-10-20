package com.azienda.springioc.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.azienda.springioc.config.SpringConfig;
import com.azienda.springioc.model.ContoCorrente;

public class Client {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			ContoCorrente conto=(ContoCorrente)context.getBean("contoCorrente");
			System.out.println(conto);
			
			ContoCorrente conto2= context.getBean("conto2",ContoCorrente.class);
			System.out.println(conto2);
			
			ContoCorrente conto3= context.getBean("conto3",ContoCorrente.class);
			System.out.println(conto3);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
