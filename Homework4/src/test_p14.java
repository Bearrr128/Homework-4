
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
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCarp14(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�}�]��"+gas);
		
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}

class RacingCarp14 extends Carp14{
	private int course;
	
	public RacingCarp14() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCoursep14(int c) {
		course =c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void show() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}
