package characters;

/**
 * STARCATCH!! - Idol
 * Main class for a girly idol wannabe.
 *  May contain: a lot of unused characteristics
 * 
 * @author "Daniel Sánchez" <nisanvera23@gmail.com>
 */
public class Idol {
    
    /*
        CLASS CONSTANTS
    */
    private final static double CHAR_MAX = 100.0;
    
    /*
        PRIVATE ATTRIBUTES
    */
    
    // First, last name and age
    private String name1;
    private String name2;
    private int age;
    
    // Type and status
    private String type;
    private String status;
    
    // Characteristics
    private int level;
    // SMART-ASS characteristics
    private double SMA;
    private double sin;
    private double dan;
    private double shp;
    // CHARISMA characteristics
    private double CHA;
    private double lov;
    private double atr;
    private double ero;
    // PURRRITY characteristics
    private double PUR;
    private double aur;
    private double hrt;
    private double spk;
    
    /*
        CONSTRUCTORS
    */
    
    /*
        GET METHODS
    */
    
    public String getName1 () { return this.name1; }
    public String getName2 () { return this.name2; }
    public int getAge () { return this.age; }
    
    public String getType () { return this.type; }
    public String getStatus () { return this.status; }
    
    public int getLevel () { return this.level; }
    
    public double getSMA () { return SMA; }
    public double getSin () { return sin; }
    public double getDan () { return dan; }
    public double getShp () { return shp; }

    public double getCHA () { return CHA; }
    public double getLov () { return lov; }
    public double getAtr () { return atr; }
    public double getEro () { return ero; }

    public double getPUR () { return PUR; }
    public double getAur () { return aur; }
    public double getHrt () { return hrt; }
    public double getSpk () { return spk; }

    /*
        SET METHODS
    */
    
    public void setName1 (String name1) { this.name1 = name1; }
    public void setName2 (String name2) { this.name2 = name2; }
    public void setAge (int age) { this.age = age; }

    public void setType (String type) { this.type = type; }
    public void setStatus (String status) { this.status = status; }
    
    public void setLevel (int level) { this.level = level; }

    public void setSMA (double SMA) { this.SMA = SMA; }
    public void setSin (double sin) { this.sin = sin; }
    public void setDan (double dan) { this.dan = dan; }
    public void setShp (double shp) { this.shp = shp; }

    public void setCHA (double CHA) { this.CHA = CHA; }
    public void setLov (double lov) { this.lov = lov; }
    public void setAtr (double atr) { this.atr = atr; }
    public void setEro (double ero) { this.ero = ero; }

    public void setPUR (double PUR) { this.PUR = PUR; }
    public void setAur (double aur) { this.aur = aur; }
    public void setHrt (double hrt) { this.hrt = hrt; }
    public void setSpk (double spk) { this.spk = spk; }

}