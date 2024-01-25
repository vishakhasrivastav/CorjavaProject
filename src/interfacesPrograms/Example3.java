package interfacesPrograms;

interface MusicApp{
	
	public void playMusic();
}

interface Camera{
	public void clickPics();
}

class Phone implements Camera, MusicApp{

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickPics() {
		// TODO Auto-generated method stub
		
	}}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
