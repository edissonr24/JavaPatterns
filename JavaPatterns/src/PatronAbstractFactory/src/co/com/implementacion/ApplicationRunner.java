package co.com.implementacion;

public class ApplicationRunner {
    public static void main(String[] args) {
        new Application(createOsSpecificFactory());
    }
 
    public static GUIFactory createOsSpecificFactory() {
//        int sys = readFromConfigFile("OS_TYPE");
        int sys = 1;
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }
}

