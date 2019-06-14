package z.mathew.test;

/// file OpenPageInDefaultBrowser.java
public class OpenPageInDefaultBrowser {
	public static void main(String[] args) {
		try {
			// Set your page url in this string. For eg, I m using URL for
			// Google Search engine
			String url = "http://www.google.com";
			java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		} catch (java.io.IOException e) {
			System.out.println(e.getMessage());
		}
	}
}