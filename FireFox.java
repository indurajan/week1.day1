package week1.day1;

public class FireFox {
	//type methodName->cTrl+space->Enter
	//access modifier returnType methodName arguments
	public void launchBrowser() {
		System.out.println("Launched the Browser successfully");
	}
	
	public void maximizeBrowser() {
		System.out.println("Maximized the Browser successfully");
	}
		public static void main(String[] args) {
			//ClassName objectName = new ClassName()
			FireFox obj = new FireFox();
			obj.launchBrowser();
			obj.maximizeBrowser();
		}
	}

