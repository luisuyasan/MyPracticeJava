import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Modulo8 //Using System
{
    public static void main(String[] args)
    {
        //SystemProperties();
        SetPropertiesSystem();
    }

    public static void SystemProperties() {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String Home = System.getProperty("user.home");
        System.out.println("Home = " + Home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "After line separator");

        Properties p = System.getProperties();
        p.list(System.out);

    }

    public static void SetPropertiesSystem(){
        try {
            FileInputStream file = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("my.properties.customize","my value save in the object properties");
            System.setProperties(p);
            System.getProperties().list(System.out);
        }catch (Exception e){
            System.out.println("file do not exist" + e);

        }
    }

}
