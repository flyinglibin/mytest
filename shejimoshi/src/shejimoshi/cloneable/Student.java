package shejimoshi.cloneable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Cloneable,Serializable  {
	private String name;
	private int age;
	private Professor p;
	public Student(){}
	public Student(String name,int age,Professor p){
		this.name = name;
		this.age = age;
		this.p = p;
	}
	
	public Object clone(){
		Object o = null;
		try {
			o =(Student) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}
	     public Object deepClone() throws IOException, ClassNotFoundException{
		         //将对象写到流中
		         ByteArrayOutputStream bo=new ByteArrayOutputStream();
		         ObjectOutputStream oo=new ObjectOutputStream(bo);
		         oo.writeObject(this);
		         //从流中读出来
		         ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
		         ObjectInputStream oi=new ObjectInputStream(bi);
		         return oi.readObject();
		     }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Professor getP() {
		return p;
	}
	public void setP(Professor p) {
		this.p = p;
	}
}

class Professor implements Cloneable,Serializable{
	private String name;
	private int age;
	public Professor(){}
	public Professor(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Object clone(){
		Object o = null;
		try {
			o =(Professor)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}