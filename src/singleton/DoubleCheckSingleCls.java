package singleton;

public class DoubleCheckSingleCls {

	public static volatile DoubleCheckSingleCls _instance = null;

	private DoubleCheckSingleCls() {

	}

	public static DoubleCheckSingleCls getInstance() {
		if (_instance == null) { // 1st check..

			synchronized (DoubleCheckSingleCls.class) {
				if (_instance == null) { // 2st check
					_instance = new DoubleCheckSingleCls();
				}
			}

		}
		return _instance;
	}

}
