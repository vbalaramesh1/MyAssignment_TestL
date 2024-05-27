package week1.day3;

public class EdgeBrowser {
	public static void main(String[] args) {
		
		Browser obj=new Browser();
		obj.launchBrowser("Chrome");
		obj.loadUrl();
		System.out.println("Browser class methods are called from EdgeBrowser class");
		
		
	}
	
	

}

