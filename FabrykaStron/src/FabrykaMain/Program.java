package FabrykaMain;

import Strony.Strona;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException{
        Fabryka fab = new Fabryka();
        Scanner scan = new Scanner(System.in);
        int opt;
        System.out.println("Witam. Prosze wybrać jaką stronę chcesz stworzyć:\n1#Informacyjna.\n2#Aktualności.\n3#Kontaktowa.\n4#Galeria Zdjęć.\n5#Wyjście.\n");
        do{
            opt = scan.nextInt();
            if(opt == 1 ){
                Strona s = (Strona) fab.tworzStrone("Informacyjna");
                s.Zapis(); 
                System.out.println("Strona informacyjna utworzona w folderze projektu");
            }
            if(opt == 2){
                Strona s = (Strona) fab.tworzStrone("Aktualnosci");
                s.Zapis();
                System.out.println("Strona z aktualnościami utworzona w folderze projektu");
            }
            if(opt == 3){
                Strona s = (Strona) fab.tworzStrone("Kontaktowa");
                s.Zapis(); 
                System.out.println("Strona kontaktowa utworzona w folderze projektu");
            }
            if(opt == 4){
                Strona s = (Strona) fab.tworzStrone("GaleriaZdjec");
                s.Zapis(); 
                System.out.println("Strona ze zdjęciem utworzona w folderze projektu");
            }
         
        }
        while(opt != 5);
        
        
        
    }
}
        