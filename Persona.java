/**
*   Clase que contiene los datos basicos de las personas
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Persona {

  private String nombre, apellido1, apellido2, direccion;
  private int edad;
/**
*   Constructor que recibe parametros
*   @param nombre El nombre de la persona
*   @param apellido1 Primer apellido de la persona
*   @param apellido2 Segundo apellido de la persona
*   @param edad Edad de la persona
*   @param direccion Direccion de la persona
*/
  public Persona(String nombre, String apellido1, String apellido2, int edad, String direccion){
    this.nombre=nombre;
    this.apellido1=apellido1;
    this.apellido2=apellido2;
    this.edad=edad;
    this.direccion=direccion;
  }
/**
*   Getter del nombre de la persona 
*   @return nombre
*/
  public String getNombre(){
    return nombre;
  }
/**
*   Setter del nombre de la persona
*   @param nombre 
*/
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
/**
*   Getter del primer apellido de la persona
*   @return apellido1
*/
  public String getApellido1(){
    return apellido1;
  }
/**
*   Setter del primer apellido de la persona
*   @param apellido1
*/
  public void setApellido1(String apellido1){
    this.apellido1=apellido1;
  }
/**
*   Getter del segundo apellido de la persona
*   @return apellido2
*/
  public String getApellido2(){
    return apellido2;
  }
/**
*   Setter del segundo apellido de la persona
*   @param apellido2
*/
  public void setApellido2(String apellido2){
    this.apellido2=apellido2;
  }
/**
*   Getter de la edad de la persona
*   @return edad
*/
  public int getEdad(){
    return edad;
  }
/**
*   Setter de la edad de la persona
*   @param edad
*/
  public void setEdad(int edad){
    this.edad=edad;
  }
/**
* Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
*/
  @Override
  public String toString(){
    return nombre+", "+apellido1+", "+apellido2+", "+edad+", "+direccion;
  }
}