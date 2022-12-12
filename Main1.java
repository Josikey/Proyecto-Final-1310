
import java.util.HashMap;
import java.util.Map.Entry;

/**Un HashMap en Java es una tabla hash basado en una implementación de la 
interfaz Map de Java, el cual será una colección de Key-value (clave-valor). 
Un HashMap permite nulos y no se encuentra ordenada.*/

/**
 *
 * @author ilike
 */
public class Main1 {

    public static void main(String[] args) {

        //objeto HashMap con un entero y una cadena
        HashMap<Integer, String> hashMap = new HashMap<>();

        //.put = Integer , String
        /**En la parte de hash noo importa la cantidad de valores que se le desea agregar
         , ya que es infinita*/
        hashMap.put(1, "Daniel");
        hashMap.put(2, "Jose");
        hashMap.put(3, "Evelyn");
        hashMap.put(4, "Mariana");
        hashMap.put(5, "Paco");
        hashMap.put(7, "Mariana");
        hashMap.put(7, "Emiliano");
        hashMap.put(8, "Mitchell");
        hashMap.put(9, "Joahana");
        hashMap.put(10, "Julio");
        //Imprime tal y como estan los valores sin importar el orden
        //y si hay Una clave que repita se va por la ultima clave que sea igual y la imprime

        //El Entry pasa la llave al Integer y al String, para asi iterar el mapa
        for (Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - " + " valor : " + entry.getValue());
        }

    }

}
