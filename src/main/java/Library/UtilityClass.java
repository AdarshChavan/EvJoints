package Library;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
	

	//public Properties prop;
	

public static String getDatafromPropertyFile(String key) throws IOException {
        
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/Config/Config.properties" + "");

        Properties prop = new Properties();
        prop.load(file);
        String value = prop.getProperty(key);
        return value;
    }
	
		
					
					
				}
			
				


