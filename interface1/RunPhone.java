package test.interface1;

public class RunPhone {

	public static void main(String[] args) {
		S21 s = new S21();
		s.sendCall("010-1234-5678");
		s.sendSMS("010-2323-1223");
		s.receiveSMS("010-3333-4444");
		
		String music  = s.searchMusic("XOXO");
		s.playMusic(music);
		s.stopMusic();
		
		s.installApp("Gdrive");
		s.runApp("Youtube");

	}

}
