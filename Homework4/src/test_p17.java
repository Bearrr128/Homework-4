
public class test_p17 {
	public static void main(String[] args) {
		Carp17 cars[];
		cars=new Carp17[2];
		
		cars[0]=new Carp17();
		cars[0].setCarp17(1234,20.5);
		
		cars[1]=new Carp17();
		cars[1].setCarp17(4567, 30.5);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	}
}
class Carp17{
	protected int num;
	protected double gas;
	
	public Carp17() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setCarp17(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class RacingCarp17 extends Carp17{
	private int course;
	
	public RacingCarp17() {
		course=0;
		System.out.println("生產了賽車");
	}
	
	public void setCoursep17(int c) {
		course=c;
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號為"+course);
	}
}