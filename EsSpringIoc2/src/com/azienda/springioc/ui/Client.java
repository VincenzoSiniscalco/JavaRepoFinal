package com.azienda.springioc.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.azienda.springioc.config.SpringConfig;
import com.azienda.springioc.model.ContoCorrente;

public class Client {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class)){
			
			ContoCorrente conto1= context.getBean("conto1",ContoCorrente.class);
			System.out.println(conto1);
			
			ContoCorrente conto2= context.getBean("conto2",ContoCorrente.class);
			System.out.println(conto2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
