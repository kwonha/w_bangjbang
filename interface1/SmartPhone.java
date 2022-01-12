package test.interface1;

public interface SmartPhone extends MobilPhone, MP3 {

	void installApp(String appName);
	void runApp(String appName);
}
