import java.util.Vector;

//  indice basico
// usando vectores entre estos

public class indices {
    public static void main(String[] args) {
        // Crear un ejemplo de índices en Java
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Contenido del indice: " + i + " : " + array[i]);
        }
        
        // con vector como libreria de java
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Contenido de mi indice: " + i + " : " + vector.get(i));
        }
    }
}
    
