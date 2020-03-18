package singleton;

public class 饿汉 {

	private static 饿汉 instance = new 饿汉();
			
	private 饿汉() {};
	
	public static 饿汉 getSingleTon() {
		return instance;
	}
}
