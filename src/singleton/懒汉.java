package singleton;

public class 懒汉 {

	private static volatile 懒汉 instance;
			
	private 懒汉() {};
	
	public static 懒汉 getInstance() {
		if(instance == null) {
			synchronized(懒汉.class) {
				if(instance == null) {
					instance = new 懒汉();
				}
			}
		}
		return instance;
	}
}
