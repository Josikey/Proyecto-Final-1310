
import java.util.Map.Entry;
import java.util.TreeMap;

/** Un TreeMap es una estructura de datos TreeMap es una colección que 
 almacena pares clave-valor en un orden ordenado de forma natural.
 De forma predeterminada, los elementos de TreeMap están en orden ascendente de forma predeterminada.
 */

/**
 *
 * @author ilike
 */
public class Main2 {

    public static void main(String[] args) {
        
        //objeto TreeMap con un entero y una cadena
        TreeMap<Integer, String> treeMap = new TreeMap<>();

         //.put = Integer , String
        /**En la parte de hash noo importa la cantidad de valores que se le desea agregar
         , ya que es infinita*/
        treeMap.put(1, "Daniel");
        treeMap.put(8, "Jose");
        treeMap.put(2, "Evelyn");
        treeMap.put(2, "Pedro");
        treeMap.put(4, "Diana");
        treeMap.put(6, "Mariana");
        treeMap.put(5, "Paco");
        treeMap.put(7, "Ilikey");
        treeMap.put(10, "Mariana");
        treeMap.put(9, "Emiliano");
        //ordena Los claves Integerde forma ascendente
        //y si hay Una clave que repita se va por la ultima clave que sea igual y la imprime
        
         //El Entry pasa la llave al Integer y al String, para asi iterar el mapa
        for (Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - " + " valor : " + entry.getValue());
        }

    }

}
