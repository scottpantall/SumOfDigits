/**
 *
 * @author Scott Pantall
 */
import java.io.*;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Path file = Paths.get(args[0]);
        BufferedReader buffer = Files.newBufferedReader(file);
        String line;
        
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            sumOfDigits(line);
        }
    }
    
    public static void sumOfDigits(String line) {
        int sum = 0;
        
        for(int i = 0; i < line.length(); i++) {
            sum += Character.getNumericValue(line.charAt(i));
        }
        
        System.out.println(sum);
    }
}
