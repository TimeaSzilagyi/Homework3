package ObjectContainers;

public class Adresa {
    public String Tara;

    public Adresa (String Tara){
        this.Tara = Tara;
    }
    public String getTara(){
        return Tara;
    }

    @Override
    public String toString() {
        return "Adresa{" + '\'' +
                "Tara='" + Tara + '\'' +
                '}';
    }
}
