import java.io.File;
import java.io.IOException;

public class puntero {
    public static void main(String[] args) {
        File file = new File("archivo.txt");
        try {
            if(file.createNewFile()) {
                System.out.println("El archivo se ha creado con éxito");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        }
    }
}
