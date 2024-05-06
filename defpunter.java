import java.util.*;


public class defpunter {
    public static void main(String[] args) {
        // Creamos un nuevo objeto de la clase Point
        Point point1 = new Point(10, 20);

        // Creamos una nueva referencia a point1
        Point point2 = point1;

        // Modificamos las coordenadas de point2
        point2.x = 30;
        point2.y = 40;

        // Imprimimos las coordenadas de point1
        System.out.println("point1.x = " + point1.x);
        System.out.println("point1.y = " + point1.y);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}