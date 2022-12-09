package com.codemind.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codemind.HibernateProject.Entity.Employee;



public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!project started" );
      //  SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
  
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory= cfg.buildSessionFactory();
        System.out.println(factory);
        
       System.out.println(factory.isClosed()); 
       
       Employee e= new Employee();
      // e.setId(2);
       e.setEmpfname("ksjshh");
       e.setEmplname("potdar");
       e.setEmpemail("swapnilpotdar46@gmail.com");
       e.setMobileno("98858966");
       e.setSalary("369369");
       System.out.println("-------------------------------");
       Session s=factory.getCurrentSession();
       s.beginTransaction();
       s.save(e);
       
       //end the transaction
       s.getTransaction().commit();
       
s.close();
       System.out.println(factory.isClosed()); 
    }
}
