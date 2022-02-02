package rainbow.lang;

import java.util.Properties;
 /*
 * This class maintains the application-wide properties 
 * which are queried and modified by using the getProp() 
 * and addProp() methods. Some of the predefined properties and what they contain are :
 * help - the help message which describes the purpose of the program and 
 *        important command line options
 * version - the version of the program 
 */

public class Props {
    private static Properties props = new Properties();
    private static final String helpString =  
            "Available options include :\n"+
            "-help                     Print this help menu\n"+
            "-version                  Print version information\n" +
            "-input (mandatory option) Specify the file to be parsed\n";

    /* This class cannot be initialized */
    private Props() {}

    /* 
    * Initialize the system-wide properties and set them to their values
    * It is called only once by main()
    */
    public static void initProps(){
        props.setProperty("version","0.0.6");
        props.setProperty("help","Rainbow " + props.getProperty("version") + "\n" + helpString);
    }

    /* 
    * Add a property to the system-wide properties list
    * If a property of this name already exist then it is overriden
    */

    public static void addProp(String key,String val){
        props.setProperty(key,val);
    }

    /*
    * Get a property from the system-wide properties list
    * If key does not exist then null is returned
    */

    public static String getProp(String key){
        return props.getProperty(key);
    }
}
