package method;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		p1.sayHello();
		
		p1.name = "���";
		p2.name = "�浿";
		p3.name = "���̾�";				
//		p1.age = 7;
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		p1.sayHello();
		p2.sayHello();
		p3.sayHello();
	}
}
