import java.util.Comparator;

public class Atom {
    private String stringValue;
    public static Comparator<String> cmp = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };
    public Atom(String value) {
        this.stringValue = value;
    }

    public String print() {
        return stringValue;
    }
}
