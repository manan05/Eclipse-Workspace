package Module1;

public class ShutdownHook {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread()
		{
			public void run() {
				 System.out.println("Shutdown Hook 1 is running");
			}
		});
		System.out.println("Application is terminating..");
	}

}
