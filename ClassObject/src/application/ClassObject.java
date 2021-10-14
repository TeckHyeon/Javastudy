package application;

class Person {
	String name;
}
public class ClassObject {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "Æë¼ö";
		
		Person p2 = new Person();
		p2.name = "±æµ¿";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
