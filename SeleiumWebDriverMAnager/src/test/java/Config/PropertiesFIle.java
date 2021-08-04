package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNg_Demo;

public class PropertiesFIle {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) throws Exception {

		getProperties();
		setProperties();
		getProperties();

	}

	public static void getProperties() throws Exception {

		InputStream input = new FileInputStream(projectpath + "/src/test/java/Config/config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		TestNg_Demo.browserName = browser;
	}

	public static void setProperties() throws Exception {
		OutputStream output = new FileOutputStream(projectpath + "/src/test/java/Config/config.properties");
		prop.setProperty("Result", "Pass");
		prop.store(output, null);
	}

}
