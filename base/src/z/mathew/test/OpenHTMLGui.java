package z.mathew.test;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenHTMLGui {

	public static void main(String[] args) {
		// using this in real life, you'd probably want to check that the desktop
		// methods are supported using isDesktopSupported()...

		String htmlFilePath = "index.html"; // path to your new file
		File htmlFile = new File(htmlFilePath);

		// open the default web browser for the HTML page
		try {
			Desktop.getDesktop().browse(htmlFile.toURI());
			Desktop.getDesktop().open(htmlFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// if a web browser is the default HTML handler, this might work too
		

	}

}
