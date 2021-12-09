//import java.io.File;
import java.util.ArrayList;

//Para escribir archivo
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
*   Clase que actualiza el archivo de registro una vez modificados por el usuario.
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Actualizador{
/**
* Constructor predeterminado.
*/
  public Actualizador(){}

/**
*   Recibe registros y los guarda en su respectivo archivo.
*   @param ArrayList<Empleado> emp Datos generales del empleado a modificar.
*   @param ArrayList<String> proyV Nombre de los proyectos vigentes a modificar. 
*   @param ArrayList<String> proyH Nombre de los proyectos historicos a modificar.
*   @param ArrayList<Integer> sizeV Numero de proyectos vigentes a modificar.
*   @param ArrayList<Integer> sizeH Numero de proyectos historicos a modificar.
*   @param String arch Nombre del archivo donde se guardaran los cambios.
*/
  public void actualizarBD(ArrayList<Empleado> emp, ArrayList<String> proyV, ArrayList<String> proyH, ArrayList<Integer> sizeV, ArrayList<Integer> sizeH, String arch){
    try{                
      //apuntador al archivo de texto
      FileWriter fw = new FileWriter(arch); //crea un nuevo archivo o sobreescibe
            
      //se conecta del programa al archivo
      BufferedWriter bw = new BufferedWriter(fw);
            
      //del lado del archivo, voy a imprimir en él las cadenas. Saca del ArrayList y lo pasa al archivo
      PrintWriter impresora = new PrintWriter(bw);
            
      //for(Empleado i:emp){
      //  impresora.println(i);
      //}
      impresora.println("Persona, , , , Direccion, , , , Datos de empleado, , Proyectos");
      impresora.println("Nombre, Apellido, Apellido, Edad, Numero, Calle, Ciudad, CP, Trabajador, Anios de empleado, Proyectos historicos, Proyectos Vigentes");

      for (int i = 0; i < 100; i++) {
        impresora.println(emp.get(i));

        for (int j = 0; j < sizeV.get(i); j++) {
          impresora.println(proyV.get(j));
        }

        for (int k = 0; k < sizeH.get(i); k++){
          impresora.println(proyH.get(k));
        }

      }
      impresora.close();

    }catch(IOException e){ 
      System.out.println("Error: "+ e.getMessage());
    }
  } 
}