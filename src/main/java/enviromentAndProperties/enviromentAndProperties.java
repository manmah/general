package enviromentAndProperties;

import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.StringJoiner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class enviromentAndProperties {

    public static void main(String[] args) {

        Properties properties = new Properties();
        String name = System.getProperty("user.name");
        String name2 = System.getenv("JAVA_HOME");
        System.out.println(name + " , " + name2);

        Properties probs = new Properties();
        probs.setProperty("password2", "new pass3");

        try(Writer writer = Files.newBufferedWriter(Paths.get("abc.properties"))){
            probs.store(writer ,"Second update");
        }catch (Exception e){        }

        try(OutputStream out = Files.newOutputStream(Paths.get("abc.xml"))){
            probs.storeToXML(out ,"Second update");
        }catch (Exception e){

        }

        Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.info("Hiiiiiiiiii" );
    }

}
