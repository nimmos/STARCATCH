package console;

import java.util.Scanner;

/**
 * console.Logger
 * Methods that deal with the console runtime log
 * 
 * @author "Daniel Sánchez" <nisanvera23@gmail.com>
 */
public class Logger
{
    /*
        OPERATIONS WITH SCREEN
    */
    
    public static void cls () {
        System.out.printf("\f"); }
    
    /*
        OPERATIONS WITH OUTPUT LOG FORMAT
    */
    
    public static void log (String text) {
        System.out.printf(text); }
    
    public static void logn (String text) {
        System.out.printf(text + "%n"); }
    
    public static void nlog (String text) {
        System.out.printf("%n" + text); }
    
    public static void nlogn (String text) {
        System.out.printf("%n" + text + "%n"); }
    
    /*
        VERSION DISPLAY
    */
    
    public static void logver (int ver) {
        log("Ver.: ");
        switch(ver) {
            case 0: log("pre-alpha"); break;
            case 1: log("alpha"); break;
            case 2: log("beta"); break;
            case 3: log("demo"); break;
            case 4: log("release"); break;
        }
    }
    
    public static void logver (String ver) {
        log("Ver.: " + ver);
    }
    
    /*
        EXCEPTION HANDLING OUTPUT LOG FORMAT
    */
    
    public static void logerr (int what) {
        nlog("STATUS: ");
        switch(what) {
            default: logn("General exception, non classifiable");
        }
    }
    
    /*
        AUXILIAR OPTION GETTER
    */
    
    public static int getOpt (String title) {
        nlog("Elige " + title);
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }
    
    /*
        GENERIC PAUSE BREAK
    */
    
    public static void pause () { 
        nlog("Pulsa ENTER para continuar. ");
        try { System.in.read();
        } catch(Exception e) { logerr(1); }
    }
}
