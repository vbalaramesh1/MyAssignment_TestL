package week1.day3;

public class Browser {

	public static void main(String[] args) {
		
		Browser obj = new Browser();
		obj.launchBrowser("Chrome" );
		obj.loadUrl();

	}

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
		//return loadUrl;

	}
}
