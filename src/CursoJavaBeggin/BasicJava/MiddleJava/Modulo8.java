package CursoJavaBeggin.BasicJava.MiddleJava;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Properties;

public class Modulo8 //Using System
{
    public static void main(String[] args)
    {
        //SystemProperties();
        //SetPropertiesSystem();
        //VarEnvironment();
        //varEnvironment();
        ProgramSoRunTime();
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
            System.err.println("file do not exist" + e);
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

    public static void ProgramSoRunTime() {

        Runtime rt = Runtime.getRuntime();
        Process process;
        try{
            if(System.getProperty("os.name").startsWith("Windows")){
                process = rt.exec("notepad");
            }else{
                process = rt.exec("gedit");
            }
            process.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }

}
