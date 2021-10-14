package method;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		p1.sayHello();
		
		p1.name = "펭수";
		p2.name = "길동";
		p3.name = "라이언";				
//		p1.age = 7;
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		p1.sayHello();
		p2.sayHello();
		p3.sayHello();
	}
}
