package hibernetTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class SaveStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("..........");
		Configuration config = new Configuration().configure("configure.cfg.xml");
		SessionFactory sc= config.buildSessionFactory();
		Session session = sc.openSession();
		session.beginTransaction();
		StudentVO obj=new StudentVO();//lib files kuth age sir ni dilelya s-- sir ni dilelya nahi talkya//load kr te sir ni dilelya... tuzya machine var astil tr mazya desktop la peast krshil??ok
		obj.setId(1);
		obj.setSname("Neha");
		obj.setScity("Sangli");
		
		System.out.println("kkkkkkkkkkk");
		
		Integer sv =(Integer)session.save(obj);
		
		session.getTransaction().commit();
		
		System.out.println("done");
		sc.close();
		session.close();
	}

}
