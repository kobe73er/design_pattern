package singleton;

public class SingleTon {
	private SingleTon() {
	}

	private static SingleTon singleton = null;

	public static SingleTon getInstance() {
		if (singleton == null) {
			singleton = new SingleTon();
		}
		return singleton;
	}
}
