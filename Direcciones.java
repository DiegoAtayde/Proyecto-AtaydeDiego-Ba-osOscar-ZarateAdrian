import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
*   Clase que desde un archivo de direcciones estas las almacena en un ArrayList
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Direcciones{
/**
*   Constructor predeterminado
*/
  public Direcciones(){}
/**
*   Lee y almacena linea por linea del archivo en el ArrayList
*   @param ArrayList<String> item Array donde se almacenaran las direcciones
*   @param String arch Archivo de donde se obtienen las direcciones
*/
  public void leerDirecciones(ArrayList<String> item, String arch){
    try{
      //saca permisos para conectarse con el archivo
      FileReader fr = new FileReader(arch);
            
      //buffer para conectar desde el archivio hacia el programa, saca de archivo y lo mete en br
      BufferedReader br = new BufferedReader(fr);

      String linea = br.readLine();

      while(linea != null){
        linea = br.readLine();
        item.add(linea); 
      }
      br.close();

    }catch(FileNotFoundException e){
      System.out.println("Error: "+ e.getMessage());

    }catch(IOException e){ 
      System.out.println("Error: "+ e.getMessage());
    }
  }
}