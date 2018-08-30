import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ContainerList containerList = new ContainerList();
        while(n-- > 0) {
            List<Atom> atoms = new ArrayList<>();
            List<String> strings = IOUtils.receiveStringInput(in.nextLine());
            for(String string : strings) {
                atoms.add(new Atom(string));
            }
            Container container = new Container(atoms);
            for(int i = 0; i < atoms.size(); i++) {
                containerList.addRotation(container.rotate());
            }
        }
        List<String> results = containerList.getOrderedRotations();
        for(String result : results) {
            System.out.println(result);
        }
    }
}
