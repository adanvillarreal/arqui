import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContainerList {
    List<String> rotations;

    public ContainerList() {
        rotations = new ArrayList<>();
    }

    public void addRotation(String rotation) {
        rotations.add(rotation);
    }

    public List<String> getOrderedRotations() {
        rotations.sort(Atom.cmp);
        return rotations;
    }
}
