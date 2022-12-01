
public class test_p24 {

}

class Carp24{
	protected int num;
	protected double gas;
	
	public Carp24() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void setcarp24(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public String toString(){
		String str="車號："+num+"；汽油量:"+gas;
		return str;
	}
}