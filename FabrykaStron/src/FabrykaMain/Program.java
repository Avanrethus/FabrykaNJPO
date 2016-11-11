package FabrykaMain;

public class Program {
    public static void main(String[] args){
        Fabryka fab = new Fabryka();
        
        tworzStrony galeriaZdjec = fab.getRodzaj("GaleriaZdjec");
        galeriaZdjec.tworz();
        
        tworzStrony info = fab.getRodzaj("Informacyjna");
        info.tworz();
        
        tworzStrony kontaktowa = fab.getRodzaj("Kontaktowa");
        kontaktowa.tworz();
        
        tworzStrony aktualnosci = fab.getRodzaj("Aktualnosci");
        aktualnosci.tworz();
        
    }
}
        