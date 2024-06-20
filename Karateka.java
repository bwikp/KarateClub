public class Karateka {

    private String name;
    private int age; 
    private String ceinture; 

    public Karateka(String name, int age, String ceinture) {
        this.name = name;
        this.age  = age;
        this.ceinture = ceinture;
    }
    
    public String getName(){
        
        return name;
    }

    public void setName(String nameValue){
        this.name = nameValue;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int ageValue){
        this.age = ageValue ; 
    }

    public String getceinture(){
        
        return ceinture;
    }

    public void setCeinture( String ceintureValue){
        this.ceinture = ceintureValue;
    }
}
