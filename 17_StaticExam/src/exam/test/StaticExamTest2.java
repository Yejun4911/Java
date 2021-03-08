package exam.test;

class Car {
	
	int serialNumber;
	static int counter;
	
	Car() {
		counter++;
		serialNumber = counter;
	}
	
}

public class StaticExamTest2 {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.counter);
		Car c2 = new Car();
		System.out.println(c1.counter);
		Car c3 = new Car();
		
		System.out.println("============field============");
		System.out.println(c1.serialNumber);
		System.out.println(c2.serialNumber);
		System.out.println(c3.serialNumber);
		System.out.println("============static============");
		System.out.println(c1.counter);
		System.out.println(c2.counter);
		System.out.println(c3.counter);
		
	}

}
