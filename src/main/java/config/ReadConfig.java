package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties prop;
    FileInputStream fis;
    File src;

     public ReadConfig(){
         src = new File("/Users/punitmishra/eclipse-workspace/DemoApp/src/main/resources/config.properties");
        try{
            fis = new FileInputStream(src);
            prop = new Properties();
            prop.load(fis);
       }
        catch (FileNotFoundException e) {
//            System.out.println("File Not Found");
            e.printStackTrace();
        }
        catch (IOException e){
//            System.out.println(" ReadConfig error "+e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e) {
//        	System.out.println("Generic readConfig error");
        	e.printStackTrace();
        }
     }
     
     public String getValue(String text){
        return prop.getProperty(text);
     }
}
