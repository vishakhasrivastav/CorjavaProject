package interfacesPrograms;

class PhoneCalls{
	public void connectingCall() {
		System.out.println("Connecting the call...");
	}
	
	public void diconnectingCall() {
		System.out.println("Diconnecting the call....");
	}
}
/*
 * Below we can see that we have extended a class PhoneCalls and also
 * implemented interfaces MusicApp and Camera
 */
class Vivo extends PhoneCalls  implements MusicApp, Camera {

	@Override
	public void clickPics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}

	
}
public class Example4 {

	public static void main(String[] args) {
		

	}

}
