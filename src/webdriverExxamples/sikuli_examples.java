package webdriverExxamples;

import org.sikuli.script.Screen;

public class sikuli_examples {

	public static void main(String[] args)throws Exception {
		Screen sc = new Screen();
		Thread.sleep(3000);
		sc.click("C:\\Users\\Lenovo\\eclipse-workspace\\sikuli\\minimize.PNG");
		Thread.sleep(3000);
		sc.doubleClick("C:\\Users\\Lenovo\\eclipse-workspace\\sikuli\\double.PNG");
		Thread.sleep(3000);
         sc.click("C:\\Users\\Lenovo\\eclipse-workspace\\sikuli\\close.new.PNG");
		
	}
	}


