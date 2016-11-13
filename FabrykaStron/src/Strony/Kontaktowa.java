package Strony;
import FabrykaMain.tworzStrony;
import java.util.Random;

public class Kontaktowa extends Strona implements tworzStrony {
    public Kontaktowa(){
        Random r = new Random();
        int x = 0;
        String a ="Adres: Katowice ul. Góreckiego 15 <br/>" + "Numer telefonu: 785-556-234 <br/>";
        String b ="Adres: Jaworzno ul.Budowalana 20 <>br/"+ "Numer telefonu: 985-664-789 <br/>";
        String c ="Adres: Kraków ul. Zaułek 12 <br/>" +  "Numer telefonu: 458-22-33 <br/>";
        
        x = r.nextInt(3);
        if (x == 1){
                zawartosc = a;
            }
        if (x == 2){
                zawartosc = b;
            }
        if (x == 3){
                zawartosc = c;
            }
    }
    @Override
    public void tworz(){
        
    }
}
