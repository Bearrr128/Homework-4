
public class test_p29 {
	public static void main(String[] args) {
		Vehicle[] vc=new Vehicle[2];
		
		vc[0]=new Carp29(1234,20.5);
		vc[0].setSpeed(60);
		
		vc[1]=new Plane(232);
		vc[1].setSpeed(500);
		
		for(int i=0;i<vc.length;i++) {
			vc[i].show();
		}
	}
}
abstract class Vehicle{
	protected int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.print("�N�t�׳]��"+speed+"�F");
	}
	abstract void show();
}
class Carp29 extends Vehicle{
	private int num;
	private double gas;
	
	public Carp29(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}

class Plane extends Vehicle{
	private int flight;
	
	public Plane(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	
	public void show() {
		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}
}