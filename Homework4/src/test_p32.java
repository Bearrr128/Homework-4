
public class test_p32 {
	public static void main(String[] args) {
		Vehiclep32[] vc;
		vc=new Vehiclep32[2];
		
		vc[0]=new Carp32(1234,20.5);
		vc[1]=new Planep32(233);
		
		for(int i=0;i<vc.length;i++) {
			if(vc[i]instanceof Carp32)
				System.out.println("��"+(i+1)+"�Ӫ���OCar���O");
			else
				System.out.println("��"+(i+1)+"�Ӫ��󤣬OCar���O");
		}
	}
}
abstract class Vehiclep32{
	protected int speed;
	
	public void setSpeed(int s) {
		speed=s;
		System.out.println("�N�t�׳]��"+speed+"�F");
	}
	abstract void show();
}
class Carp32 extends Vehiclep32{
	private int num;
	private double gas;
	
	public Carp32(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}
class Planep32 extends Vehiclep32{
	private int flight;
	
	public Planep32(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	public void show() {
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}