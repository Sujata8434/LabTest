/*Create a maven project to implement student management system to implement the CRUD using hibernate 
 * @ Author: Sujata kumri
* @ Date: 05/01/2023
*/

package HibernateCRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.studentEntity.StudentEntity;

/**
 * Hello world!
 *
 */
public class App 
{
 
    public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		System.out.println("CFG is Ready " + cfg);
		SessionFactory sf = cfg.buildSessionFactory();
		System.out.println("Session Factory is ready"+sf);
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		
		
//		StudentEntity s1 = new StudentEntity(1, "Sujata", "MCA");
//		StudentEntity s2 = new StudentEntity(2, "Sneha", "IT");
//		StudentEntity s3 = new StudentEntity(3, "Sami", "COM");
//		StudentEntity s4 = new StudentEntity(4, "Ashok", "CS");
//		s.save(s1);
//		s.save(s2);
//		s.save(s3);
//		s.save(s4);


		
		//update operation
//		StudentEntity stu = s.get(StudentEntity.class, 2);
//		stu.setStudent_dept("BIO");
//		s.save(student);

		//delete operation
//		StudentEntity stu = s.get(StudentEntity.class, 3);
//		s.delete(stu);

		//read opertaion
		StudentEntity stu = s.get(StudentEntity.class, 4);
		System.out.println(stu);
		tr.commit();

		System.out.println("Object Saved !!!!!!");
	}
}
