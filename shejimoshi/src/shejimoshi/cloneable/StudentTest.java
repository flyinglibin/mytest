package shejimoshi.cloneable;

import java.io.IOException;

public class StudentTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		Professor p = new Professor("jiaoshou",55);
		Student student = new Student("libin",22,p);
		//Student student2 = (Student) student.clone();
		Student student2 = (Student) student.deepClone();
		student2.getP().setAge(44);
		student2.getP().setName("lalala");
		System.out.println(student.getP().getName()+student.getP().getAge());
	}
}
