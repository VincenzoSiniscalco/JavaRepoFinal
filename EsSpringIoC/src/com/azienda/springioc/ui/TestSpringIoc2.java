package com.azienda.springioc.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.azienda.springioc.config.SpringConfiguration;
import com.azienda.springioc.model.Macchina;
import com.azienda.springioc.model.Persona;

public class TestSpringIoc2 {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);) {
			
			Persona p= context.getBean("persona1",Persona.class);
			System.out.println(p);
			
			Persona p2= (Persona)context.getBean("persona2");
			System.out.println(p2);
			
			Macchina m1=context.getBean("macchina1",Macchina.class);
			System.out.println(m1);
			
			Macchina m2=context.getBean("macchina2",Macchina.class);
			System.out.println(m2);
			
			Persona pComponent= context.getBean("persona",Persona.class);
			System.out.println(pComponent);
			
			Macchina mComponent=context.getBean("macchina",Macchina.class);
			System.out.println(mComponent);
			
//			String [] beanNames= context.getBeanDefinitionNames();
//			for(String s:beanNames) {
//				System.out.println(s);
//			}
//			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
