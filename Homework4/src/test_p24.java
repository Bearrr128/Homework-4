
public class test_p24 {

}

class Carp24{
	protected int num;
	protected double gas;
	
	public Carp24() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setcarp24(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public String toString(){
		String str="�����G"+num+"�F�T�o�q:"+gas;
		return str;
	}
}