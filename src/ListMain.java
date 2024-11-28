import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
// Los Array list nos permiten trabajar con muchos datos de una forma dinamica
        List<String> nombre = new ArrayList<>();
        //agregar datos
         nombre.add("Nombre1");
         nombre.add("Nombre2");
         nombre.add("Nombre3");
         nombre.add("Nombre4");
         nombre.add("Nombre5");

        System.out.println(nombre);

        //iretar con un bucle
        for (String nombres: nombre) {
            System.out.println(nombres);
        }


    }
}
