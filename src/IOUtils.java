import java.util.Arrays;
import java.util.List;

public class IOUtils {
    public static List<String> receiveStringInput(String string) {
        return Arrays.asList(string.split(" "));
    }
}
