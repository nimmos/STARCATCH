package characters;

/**
 * STARCATCH!!
 * Idols, idols and more idols, what else would you want?
 * 
 * @author "Daniel Sánchez" <nisanvera23@gmail.com>
 */
public class Idol {
    
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

    /*
        SET METHODS
    */
    
    public void setName1 (String name1) { this.name1 = name1; }
    public void setName2 (String name2) { this.name2 = name2; }
    public void setAge (int age) { this.age = age; }

    public void setType (String type) { this.type = type; }
    public void setStatus (String status) { this.status = status; }
    
    public void setLevel (int level) { this.level = level; }
    
}