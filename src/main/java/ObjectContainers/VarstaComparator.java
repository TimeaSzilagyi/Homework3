package ObjectContainers;

import java.util.Comparator;

public class VarstaComparator implements Comparator<Persoana> {

    @Override
    public int compare(Persoana o1, Persoana o2){
        return o1.getVarsta() - o2.getVarsta();
    }
}
