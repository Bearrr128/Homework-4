
public class test_p26 {
	public static void main(String[] args) {
		
		Carp26[] cars;
		cars=new Carp26[2];
		
		cars[0]=new Carp26();
		cars[1]=new RacingCarp26();
		
		for(int i=0;i<cars.length;i++) {
			Class cl=cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
	}
}
class Carp26{
	protected int num;
	protected double gas;
	
	public Carp26() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
}

class RacingCarp26 extends Carp26{
	public RacingCarp26() {
		System.out.println("�Ͳ��F�ɨ�");
	}
}