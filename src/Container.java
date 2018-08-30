import java.util.*;

public class Container {
    private Deque<Atom> dataSet = new LinkedList<>();

    public Container(List<Atom> set) {
        for(Atom atom : set) {
            dataSet.addLast(atom);
        }
    }

    public String rotate() {
        dataSet.addFirst(dataSet.removeLast());
        return printCollection();
    }

    private String printCollection() {
        String result = "";
        for(Atom atom : dataSet) {
            result = result.concat(" ".concat(atom.print()));
        }
        return result.substring(1);
    }
}
