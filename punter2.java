
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class punter2 {
    public static void main(String[] args) {
        String filePath = "archivo.txt"; // Reemplaza "archivo.txt" con la ruta de tu archivo

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
    
