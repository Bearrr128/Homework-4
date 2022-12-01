
public class test_p38 {
	public static void main(String[] args) {
		iVehicle[] ivc;
		ivc=new iVehicle[2];
		
		ivc[0]=new Carp38(1234,20.5);
		ivc[1]=new Planep38(232);
		
		for(int i=0;i<ivc.length;i++) {
			ivc[i].show();
		}
	}
}
interface iVehicle{
	int weight=1000;
	void show();
}

class Carp38 implements iVehicle{
	private int num;
	private double gas;
	
	public Carp38(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void show() {
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
	}
}

class Planep38 implements iVehicle{
	private int flight;
	
	public Planep38(int f) {
		flight=f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
		
	}
	
	public void show() {
		System.out.println("�������Z���O"+flight);
	}
}