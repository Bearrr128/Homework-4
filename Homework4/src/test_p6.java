
public class test_p6 {
	public static void main(String[] args) {
		RacingCarp6 rccar1=new RacingCarp6(1234,20.5,5);
	}
}
class Carp6{
	private int num;
	private double gas;
	
	public Carp6() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Carp6(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
class RacingCarp6 extends Carp6{
	private int course;
	
	public RacingCarp6() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public RacingCarp6(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("�Ͳ��F�s����"+course+"���ɨ�");
	}
	public void setCourse(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}