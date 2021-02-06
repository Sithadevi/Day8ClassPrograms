package day8;

interface Manager1
{
	void Salary();
}
interface Employee1
{
	void Salary();
}
class Demo implements Manager1,Employee1
{

	@Override
	public void Salary() {
		System.out.println("Manger");
		System.out.println("Employee");
		
	}
	
}

class InterfaceDemo2 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.Salary();

	}

}
