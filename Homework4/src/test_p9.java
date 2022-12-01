
public class test_p9 {
	public static void main(String[] args) {
		RacingCarp9 rccar1;
		rccar1=new RacingCarp9();
		rccar1.newShow();
	}
}
class Carp9{
	protected int num;
	protected double gas;
	
	public Carp9() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setCarp9(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號設為"+num);
		System.out.println("汽油量"+gas);
	}
}

class RacingCarp9 extends Carp9{
	private int course;
	
	public RacingCarp9() {
		course=0;
		System.out.println("生產了賽車");
	}
	
	public void setCoursep9(int c) {
		course=c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void newShow() {
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}