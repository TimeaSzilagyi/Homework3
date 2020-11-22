package ObjectContainers;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        VarstaComparator ageComparator = new VarstaComparator();
        Set<Persoana> ageSortedPersons = new TreeSet<>(ageComparator);
        ageSortedPersons.add(new Persoana("Ioana", 34));
        ageSortedPersons.add(new Persoana("Andrei"));
        ageSortedPersons.add(new Persoana("Vasile", 32));
        ageSortedPersons.add(new Persoana("Ema",20));
        ageSortedPersons.add(new Persoana("Alexandra", 25));

        System.out.println("Sortare persoane dupa varsta: ");
        for (Persoana persoana : ageSortedPersons) {
            System.out.println(persoana);
        }

        NumeComparator nameComparator = new NumeComparator();
        Set<Persoana> sortedPersons = new TreeSet<>(nameComparator);
        sortedPersons.addAll(ageSortedPersons);

        System.out.println("Sortare persoane dupa nume: ");
        for (Persoana persoana : sortedPersons) {
            System.out.println(persoana);
        }

        Adresa tara1 = new Adresa("Romania");
        Adresa tara2 = new Adresa("Anglia");
        Adresa tara3 = new Adresa("Polonia");
        Adresa tara4 = new Adresa("Germania");

        List<Adresa> adrese1 = new LinkedList<>();
        adrese1.add(tara1);
        adrese1.add(tara2);
        List<Adresa> adrese2 = new LinkedList<>();
        adrese2.add(tara1);
        adrese2.add(tara3);
        adrese2.add(tara2);
        List<Adresa> adrese3 = new LinkedList<>();
        adrese3.add(tara1);
        adrese3.add(tara2);
        adrese3.add(tara3);
        adrese3.add(tara4);

        System.out.println("Lista adrese3 : ");
        for (Adresa adresa: adrese3) {
            System.out.println(adresa);
        }

        Hobby hobby1 = new Hobby("Alergare",3,adrese1);
        Hobby hobby2 = new Hobby("Adventura",1,adrese2);
        Hobby hobby3 = new Hobby("Peisaje",2,adrese3);
        Hobby hobby4 = new Hobby("Inot",4,adrese1);

        List<Hobby> hobbies1 = new LinkedList<>();
        hobbies1.add(hobby1);
        hobbies1.add(hobby2);
        List<Hobby> hobbies2 = new LinkedList<>();
        hobbies2.add(hobby1);
        hobbies2.add(hobby2);
        hobbies2.add(hobby4);
        List<Hobby> hobbies3 = new LinkedList<>();
        hobbies3.add(hobby3);
        hobbies3.add(hobby4);
        System.out.println("Lista hobby : ");
        for (Hobby hobby: hobbies1) {
            System.out.println(hobby);
        }

        Persoana pers1 = new Persoana("Alin",17);
        Map<Persoana, List<Hobby>> persoaneHob = new HashMap<>();
        persoaneHob.put(pers1, hobbies3);
        persoaneHob.put(new Persoana("Carelia", 40), hobbies2);

        for (Persoana pers: persoaneHob.keySet()) {
            System.out.println(persoaneHob.get(pers));
        }

        System.out.println("Listam persoane cu hobby-urile lor..");

        for( Map.Entry<Persoana,List<Hobby>> entry: persoaneHob.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
