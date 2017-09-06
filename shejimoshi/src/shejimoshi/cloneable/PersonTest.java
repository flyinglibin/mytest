package shejimoshi.cloneable;

public class PersonTest {
	public static void main(String[] args){
		Person p1 = new Person("zhangSan",18);
		System.out.println("person.name= "+p1.getName()+"and age is:"+p1.getAge());
		Person p2 = (Person) p1.clone();
		p2.setName("liSi");
		p2.setAge(20);
		System.out.println("person.name= "+p1.getName()+"and age is:"+p1.getAge());
	}
}
