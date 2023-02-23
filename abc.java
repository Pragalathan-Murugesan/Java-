import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class abc {
        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Usage: java ReadFile <filename>");
                System.exit(1);
            }
            String fileName = args[0];
            String inputname = args[1];
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                Scanner sc =new Scanner(reader);

               
                int count=0;
                while (sc.hasNext()) {
                       String word =sc.next();
                        if (word.equalsIgnoreCase(inputname)) {
                            count++;
                        }
                    }
                    System.out.println("Number Of Times"+" "+inputname+" "+count);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                System.exit(1);
            }
        }
}