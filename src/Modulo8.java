import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Properties;

public class Modulo8 //Using System
{
    public static void main(String[] args)
    {
        //SystemProperties();
        //SetPropertiesSystem();
        //VarEnvironment();
        varEnvironment();
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

    public static void VarEnvironment(){
        Map<String,String> varEnv = System.getenv();
        System.out.println("variables of Environment = " + varEnv);

        //different routs of environment we can use
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        
        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        String path = System.getenv("PATH");
        System.out.println("path = " + path);
    }

    public static void varEnvironment(){
        Map<String,String>varEnv = System.getenv();
        System.out.println("Print variables of Environment");
        for (String key: varEnv.keySet()){
            System.out.println(key +" => " + varEnv.get(key));
        }

    }

}
