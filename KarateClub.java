/**
 * main
 */
public class KarateClub {

    public static void main(String[] args)
    {
        Karateka s = new Karateka("Saya",50,"noire");

        System.out.println(s.getName());
        s.setName("Sike"); 
        System.out.println(s.getName()); 

    }
}