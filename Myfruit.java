package yuanxingdanli;

public class Myfruit implements Cloneable {
	protected String kind;
	public void display() {
		System.out.println(kind);
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
