package Strony;
import FabrykaMain.tworzStrony;
import java.util.Random;

public class GaleriaZdjec extends Strona implements tworzStrony {
    public GaleriaZdjec(){
        Random r = new Random();
        int x = 0;
        String a ="&nbsp Kotel :) <br/> <img src =\"http://image.prntscr.com/image/63e125b363b848138ca3916b09191d02.png\" alt=\"Kot\"><br/>";
        String b ="&nbsp Ikonografika <br/><img src =\"http://image.prntscr.com/image/6642621dc341446f966090fdce1c0939.png\" alt=\"Wiezniowie\"><br/>";
        String c ="&nbsp Krakow O.o <br/><img src =\"http://image.prntscr.com/image/ab91cc5472d24feab611ba9770fc139a.png\" alt=\"Krakow\"><br/>";
        
        zawartosc = a + b + c;
    }
    @Override
    public void tworz(){
        
    }
}
