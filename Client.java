package yuanxingdanli;
//原型模式
public class Client {
	public static void main(String args[]) {
		Myfruit fruit1 = new Apple();
		Myfruit fruit2 = (Apple)fruit1.clone();
		fruit1.display();
		fruit2.display();
		System.out.println(fruit1 == fruit2);
		System.out.println("fruit1:" + fruit1.hashCode());
		System.out.println("fruit2:" + fruit2.hashCode());
	}
}
