
import java.util.LinkedHashMap;
import java.util.Map;

/**Un LinkedHashMap contiene valores basados ​​en la clave. 
 Implementa la interfaz Map y extiende la clase HashMap . 
 Contiene solo elementos únicos. Puede tener una clave nula y varios valores nulos.
 */

/**
 *
 * @author ilike
 */
public class Main3 {

    public static void main(String[] args) {
        
        //objeto LinkedHashMap con un entero y una cadena
        LinkedHashMap<Integer, String> linkedHMap = new LinkedHashMap<>();

        //.put = Integer , String
        /**En la parte de hash noo importa la cantidad de valores que se le desea agregar
         , ya que es infinita*/
        linkedHMap.put(1, "Daniel");
        linkedHMap.put(1, "Jose");
        linkedHMap.put(3, "Evelyn");
        linkedHMap.put(2, "Pedro");
        linkedHMap.put(4, "Diana");
        linkedHMap.put(2, "Mariana");
        linkedHMap.put(5, "Paco");
        linkedHMap.put(7, "Ilikey");
        linkedHMap.put(8, "Mitchell");
        linkedHMap.put(2, "Joahana");
        //Imprime tal y como estan los valores sin importar el orden
        //y si hay Una clave que repita se va por la ultima clave que sea igual y la imprime
        
         //El Entry pasa la llave al Integer y al String, para asi iterar el mapa
        for (Map.Entry<Integer, String> entry : linkedHMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " - " + " valor : " + entry.getValue());
        }
    }

}
