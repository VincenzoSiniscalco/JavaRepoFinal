package com.azienda.springioc.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.azienda.springioc.config.SpringConfiguration;
import com.azienda.springioc.model.Persona;

public class TestSpringIoc {

	public static void main(String[] args) {
		ApplicationContext context= null;
		try {
			context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
			Persona p= context.getBean("persona1",Persona.class);
			System.out.println(p);
			
			Persona p2= (Persona)context.getBean("persona2");
			System.out.println(p2);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			((AnnotationConfigApplicationContext)context).close();
		}

	}

}
