
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
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCarp17(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}

class RacingCarp17 extends Carp17{
	private int course;
	
	public RacingCarp17() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCoursep17(int c) {
		course=c;
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s����"+course);
	}
}