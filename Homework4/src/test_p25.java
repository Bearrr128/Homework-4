
public class test_p25 {
	public static void main(String[] args) {
		Carp24 car1=new Carp24();
		Carp24 car2=new Carp24();
		
		Carp24 car3;
		car3=car1;
		
		System.out.println("car1�Pcar2�ۦP"+car1.equals(car2));
		System.out.println("car1�Pcar3�ۦP"+car1.equals(car3));
	}
}
class Carp25{
	protected int num;
	protected double gas;
	
	public Carp25() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
}