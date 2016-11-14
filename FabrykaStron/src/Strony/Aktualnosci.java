package Strony;
import FabrykaMain.tworzStrony;
import java.util.Random;

public class Aktualnosci extends Strona implements tworzStrony {
        String d = "";
        String e = "";
        String f = "";
    public Aktualnosci(){
        Random r = new Random();
        int x = 0;
        int z = 4;
        String a ="&nbsp Duży może więcej.\"Najwięksi producenci mogą wykorzystywać swoją pozycję w rozmowach z drobnym handlem\" <br/>" + "Rynek produkcji spożywczej w Polsce opanowali globalni gracze, którzy mogą wykorzystywać swoją pozycję w rozmowach z drobnym handlem – piszą eksperci Fundacji Republikańskiej. Sami handlowcy chcą zmian w prawie, które lepiej chroniłyby ich interesy w kontaktach z dużymi dostawcami. Projektowane przepisy są na ostatniej prostej, ale nie podobają się nikomu. <br/>";
        String b ="&nbsp Kenzo Takada: jestem szczęśliwy, że nie mam już na swoich barkach tej ciągłej presji  <br/>"+ "Gdy ponad 50 lat temu przyjechał do Francji, nie wróżono mu wielkiego sukcesu. A jednak udało mu się spełnić nie tylko marzenie o projektowaniu ubioru, ale i stworzyć markę Kenzo, która jest rozpoznawalna na całym świecie. <br/>";
        String c ="&nbsp Liczba więźniów w Polsce i na świecie. <br/>" +  "Choć liczba więźniów w Polsce spada, to cele nadal są przepełnione. Państwo na utrzymanie skazanych wydaje miliony złotych. Mimo to więźniowie skarżą się na warunki i często pozywają więzienia. Jak wielu więźniów jest w Polsce i na świecie?<br/>";
        for (int i = 0; i < 2; i++){
            do{
                x = r.nextInt(3)+1;
            }
            while(x == z);
            if (x == 1){
                d = ("1# <br/>"+a);
            }
            if (x == 2){
                e = ("2# <br/>"+ b);
            }
            if (x == 3){
                f = ("3# <br/>"+c);
            }
            zawartosc = d + e + f;
        }
    }
    
    @Override
    public void tworz(){
        
    }
}
