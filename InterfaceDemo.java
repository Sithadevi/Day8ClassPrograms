package day8;

interface Employee
{
	int loginHours=8;
	void designation();
}
class Manager implements Employee
{

	@Override
	public void designation() {
		System.out.println("I manage the team for 4 clents:");
		System.out.println("I work for"+loginHours+"Hours");
		
	}
	
}

class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.designation();
	}

}
