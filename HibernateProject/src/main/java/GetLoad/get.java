package GetLoad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codemind.HibernateProject.Entity.Employee;

public class get {
	public static void main(String[] args) {
		 Configuration cfg= new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory= cfg.buildSessionFactory();
	        System.out.println(factory);
	        Session session= factory.openSession();
	        Employee e= (Employee)session.get(Employee.class,7);
	        System.out.println(e);
	}

}
