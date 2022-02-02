import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("input.txt");
        HashSet<Coords> set = new HashSet<>();
        Scanner sc = new Scanner(input);
        int x = 0, y = 0;
        String in = sc.nextLine();
        String[] splitter = in.split("");
        for (String a : splitter) {
            switch (a) {
                case ">" -> x += 1;
                case "<" -> x -= 1;
                case "^" -> y += 1;
                case "v" -> y -= 1; }
            Coords coords = new Coords(x, y);
            set.add(coords); }
        System.out.println(set.size()+1);
    }
}
