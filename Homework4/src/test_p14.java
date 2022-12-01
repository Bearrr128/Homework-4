
public class test_p14 {
	public static void msin(String[] args) {
		Carp14 car1;
		car1=new RacingCarp14();
		car1.setCarp14(1234,20.5);
		car1.show();
	}
}
class Carp14 {
	
	protected int num;
	protected double gas;
	
	public Carp14() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setCarp14(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油良設為"+gas);
		
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class RacingCarp14 extends Carp14{
	private int course;
	
	public RacingCarp14() {
		course=0;
		System.out.println("生產了賽車");
	}
	
	public void setCoursep14(int c) {
		course =c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void show() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
