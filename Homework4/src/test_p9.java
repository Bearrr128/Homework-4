
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
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCarp9(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����]��"+num);
		System.out.println("�T�o�q"+gas);
	}
}

class RacingCarp9 extends Carp9{
	private int course;
	
	public RacingCarp9() {
		course=0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCoursep9(int c) {
		course=c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void newShow() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}