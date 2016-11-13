package Strony;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public abstract class Strona{
        public String zawartosc;
    public void Zapis() throws IOException{
        BufferedWriter bw;
        try{
            bw = new BufferedWriter( new FileWriter ("strona.html"));
            bw.write(zawartosc);
            bw.close();
        }
        catch(Exception e){
            
        }
    }
}
