/**
*   Clase heredada de Persona que contiene datos de empleado
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Empleado extends Persona{
  
  private int notrabajo, añosEmpleado;
  private Proyectos proy;
/**
*   Constructor que recibe parametros
*   @param nombre El nombre del empleado
*   @param apellido1 Primer apellido del empleado
*   @param apellido2 Segundo apellido del empleado
*   @param edad Edad del empleado
*   @param direccion Direccion del empleado
*   @param notrabajo Numero de trabajador
*   @param añosEmpleado Años de empleado
*   @param historicos Cantidad de proyectos historicos del empleado
*   @param vigentes Cantidad de proyectos vigentes del empleado
*/
  public Empleado(String nombre, String apellido1, String apellido2, int edad, String direccion, int notrabajo, int añosEmpleado, int historicos, int vigentes){
  super(nombre, apellido1, apellido2, edad, direccion);
  this.notrabajo=notrabajo;
  this.añosEmpleado=añosEmpleado;
  proy = new Proyectos(historicos, vigentes);
  }
/**
*   Getter del numero de trabajador del empleado
*   @return notrabajo
*/
  public int getNotrabajo(){
    return notrabajo;
  }
/**
*   Setter del numero de trabajador del empleado
*   @param notrabajo numero del trabajador asignado
*/
  public void setNotrabajo(int notrabajo){
    this.notrabajo=notrabajo;
  }
/**
*   Getter de años de empleado
*   @return añosEmpleado
*/
  public int getAñosEmpleado(){
    return añosEmpleado;
  }
/**
*   Setter de años de empleado
*   @param añosEmpleado 
*/
  public void setAñosEmpleado(int añosEmpleado){
    this.añosEmpleado=añosEmpleado;
  }
/**
* Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
*/  
  @Override
  public String toString(){
  return super.toString()+", "+notrabajo+", "+añosEmpleado+", "+proy;
  }
}