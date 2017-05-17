package scriptsSQL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Kepa I. González Romero
 */
public class CorrerScript {

    public static void lanza(String script) {
        BufferedReader entrada = null;
        try {     // script a ejecutar
            File archivo = new File(script);
            // convierto el archivo en una cadena

            entrada = new BufferedReader(new FileReader(archivo));
        } catch (IOException ex) {
            System.out.println("Error  " + ex.getMessage());
        }
        String linea = null;
        StringBuilder stringBuilder = new StringBuilder();
        String salto = System.getProperty("line.separator");

       
        try {
            while ((linea = entrada.readLine()) != null) {

                stringBuilder.append(linea);
                stringBuilder.append(salto);
            }
        } catch (IOException e) {
            System.out.println("ERROR de E/S, al operar con el fichero: " + e.getMessage());
            e.printStackTrace();
        }
        String consulta = stringBuilder.toString();
		// descomentar para ver en consola el resultado
//        System.out.println(consulta);
    
    }

}
