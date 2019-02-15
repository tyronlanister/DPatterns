package Bridge;

public class RemoteControllerImp implements RemoteController {

	TV tv;
	
	public RemoteControllerImp(TV tv) {
		this.tv = tv;
	}
	
	public void on() {
		tv.on();
		
	}


	public void off() {
		tv.off();
		
	}


	public void tune(int chanel) {
		tv.tune(chanel);
		
	}

}
