package ObjectContainers;

import java.util.Objects;

public class Persoana {
    public String nume;
    public int varsta;
    public  Hobby hobby;

    public Persoana(String nume, Integer varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana(String nume){
        this(nume, 22);
    }

    public String getNume(){
        return nume;
    }

    public Integer getVarsta(){
        return varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return varsta == persoana.varsta &&
                Objects.equals(nume, persoana.nume);
    }
}
