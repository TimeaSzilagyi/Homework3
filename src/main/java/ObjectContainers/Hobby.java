package ObjectContainers;

import java.util.LinkedList;
import java.util.List;

public class Hobby {
    public String tip;
    public Integer frecventa;
    List<Adresa> adresa = new LinkedList<>();

    public Hobby (String tip, int frecventa, List<Adresa> adresa){
        this.tip = tip;
        this.frecventa = frecventa;
        this.adresa.addAll(adresa);
    }
    public String getTip(){
        return tip;
    }
    public Integer getFrecventa(){
        return frecventa;
    }

    @Override
    public String toString() {
        return "Hobby{" + '\'' +
                "tip='" + tip + '\'' +
                ", frecventa=" + frecventa + '\'' +
                ", adresa=" + adresa + '\'' +
                '}';
    }
}
