
public class test_p41 {
	public static void main(String[] args) {
		Carp41 car1=new Carp41(1234,20.5);
		car1.vShow();
		car1.mShow();
	}
}
interface iVehiclep41{
	void vShow();
}

interface iMaterial{
	void mShow();
}

class Carp41 implements iVehiclep41,iMaterial{
	private int num;
	private double gas;
	
	public Carp41(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	
	public void vShow() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
	public void mShow() {
		System.out.println("���l������O�K");
	}
}