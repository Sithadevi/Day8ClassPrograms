package day8;

abstract class Operation
{
	public Operation() {
		System.out.println("This is constructor");
	}
	abstract void numbers(int a,int b);
	void display()
	{
		System.out.println("This is the normal method");
	}
	
}
class Sachin extends Operation
{

	@Override
	void numbers(int a, int b) {
		System.out.println(a+b);
		
	}
	
}
class Rahul extends Operation
{

	@Override
	void numbers(int a, int b) {
		System.out.println(a-b);
	}
	
}
class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sachin s = new Sachin();
		s.numbers(4, 3);
		s.display();
		
		Rahul r = new Rahul();
		r.numbers(3,2);
		r.display();
	}

}
