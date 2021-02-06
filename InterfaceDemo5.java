package day8;

interface Bank
{
	int rateOfInrerest(int percent);
	double minimumBalance(double amount);
}
class kotak implements Bank
{

	@Override
	public int rateOfInrerest(int percent) {
		System.out.println("rateOfInterest"+percent);
		return percent;
	}
	@Override
	public double minimumBalance(double amount) {
		System.out.println("minimumBalance of kotak"+amount);;
		return 0;
	}
	
}
class Sbi implements Bank
{
	public int rateOfInrerest(int percent) {
		System.out.println("rateOfInterest of Sbi"+percent);
		return percent;
	}
	public double minimumBalance(double amount) {
		System.out.println("minimumBalance of Sbi"+amount);;
		return 0;
	}
	
}

public class InterfaceDemo5 {

	public static void main(String[] args) {
	System.out.println();
	Bank b=new kotak();
	Bank b1=new Sbi();
	b1.minimumBalance(200.00);
	b1.rateOfInrerest(20);
	b.minimumBalance(500.00);
	b.rateOfInrerest(30);
	}

}
