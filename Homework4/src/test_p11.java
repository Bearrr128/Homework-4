
public class test_p11 {
	public static void main(String[] args) {
		RacingCarp11 rccar1;
		rccar1=new RacingCarp11();
		
		rccar1.setCarp11(1234,20.5);
		rccar1.setCoursep11(5);
		
		rccar1.show();
	}
}
class Carp11{
	protected int num;
	protected double gas;
	
	public Carp11() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCarp11(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}

class RacingCarp11 extends Carp11{
	private int course;
	
	public RacingCarp11() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCoursep11(int c) {
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void show() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q��"+gas);
		System.out.println("�ɨ��s��"+course);
	}
}
