package Bridge;

public class Test {
	
	public static void main(String [] args) {
		
		TV lgtv = new LGTV();
		TV sonytv = new SonyTV();
		
		new RemoteControllerImp(lgtv).on();
		new RemoteControllerImp(sonytv).off();
		new RemoteControllerImp(lgtv).tune(20);
		
	}

}
