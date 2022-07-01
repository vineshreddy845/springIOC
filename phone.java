package com.vinesh.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.apache.commons.math4.linear.*;
public class phone {
	 public static void main(String[] args)
	 {
		 /*jio obj= new jio(); // with class jio we are calling methods overriding sim interface methods.
		 obj.calling();
		 obj.data();*/
		 
		/*Airtel obj= new Airtel();// with class Airtel we are calling methods overriding sim interface methods.
		obj.calling();
		obj.data();*/
		
/* in above we want jio service we create jio object and calls methods.
 * In futuer we want airtel service .we have to change code from jio to airtel.
 * but always changing is not good.so that we use interface to call services.
 * because sim interface implemented by jio,Airtel classes.
 */
	/*sim sim1= new jio();// we want airtel service changing code to sim sim1= new Airtel().
	sim1.calling();
	sim1.data();*/
		 
/* From above we sloved some sort of problem.
 * but still we have to change code from jio to airtel . if we want airtel serivce.
 * -----To slove these we using Spring framework IOC container . which means IOC container-----.
 * TO talk about that go to IOCspring file(IOCspring.txt).		 
 */
		 ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		 sim obj= context.getBean("sim1",sim.class);
		 obj.calling();
		 obj.data();
	 }

}
