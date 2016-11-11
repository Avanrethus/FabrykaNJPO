package FabrykaMain;
import Strony.*;

public class Fabryka {
    public tworzStrony getRodzaj(String rodzajStrony){
        if(rodzajStrony == null){
            return null;
        }
        if(rodzajStrony.equalsIgnoreCase("GaleriaZdjec")){
            return new GaleriaZdjec();
        }
        if(rodzajStrony.equalsIgnoreCase("Informacyjna")){
            return new Informacyjna();
        }
        if(rodzajStrony.equalsIgnoreCase("Kontaktowa")){
            return new Kontaktowa();
        }
        else if(rodzajStrony.equalsIgnoreCase("Aktualnosci")){
            return new Aktualnosci();
        }
        return null;
    }
    public void tworzStrone(){
            
    }
}
