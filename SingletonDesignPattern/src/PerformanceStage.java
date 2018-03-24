
public class PerformanceStage {
	
	private static PerformanceStage INSTANCE = null;
	private static int counter;
	// Private constructor for singleton
	private PerformanceStage( ) {
		counter++;
	}
	
	// avoiding multiple object creation in multi threading using synchronized
	public synchronized static PerformanceStage getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new PerformanceStage();
		}
		return INSTANCE;
	}

	public void turnOnLights() {
		System.out.println("turned on lights...");
	}
	
	public int getCounter() {
		return counter;
	}
}
