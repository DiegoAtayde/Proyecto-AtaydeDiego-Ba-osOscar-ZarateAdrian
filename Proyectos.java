/**
*   Clase que contiene el nombre y cantidad de proyectos vigentes y proyectos historicos
*   @author Diego Atayde, Oscar Baños, Adrián Zárate
*/
public class Proyectos{

  private int historicos, vigentes;
  private String hist, vig;
/**
*   Constructor que recibe parametros
*   @param historicos cantidad de proyectos historicos
*   @param vigentes cantidad de proyectos vigentes
*/
  public Proyectos(int historicos, int vigentes){
    this.historicos=historicos;
    this.vigentes=vigentes;
  }
/**
*   Getter de la cantidad de proyectos historicos
*   @return historicos
*/
  public int getHistoricos(){
    return historicos;
  }
/**
*   Setter de la cantidad de proyectos historicos
*   @param historicos cantidad de proyectos historicos a asignar
*/
  public void setHistoricos(int historicos){
    this.historicos=historicos;
  }
/**
*   Getter de el nombre de proyecto historico
*   @return hist nombre del proyecto historico 
*/
  public String getHist(){
    return hist;
  }
/**
*   Setter de nombre de proyecto historico
*   @param hist nombre del proyecto histoico a asignar
*/
  public void setHist(String hist){
    this.hist=hist;
  }
/**
*   Getter de la cantidad de proyectos vigentes
*   @return vigentes 
*/   
  public int getVigentes(){
    return vigentes;
  }
/**
*   Setter de la cantidad de proyectos vigentes
*   @param vigentes cantidad de proyectos vigentes a asignar
*/
  public void setVigentes(int vigentes){
    this.vigentes=vigentes;
  }
/**
*   Getter de el nombre de proyecto vigente
*   @return vig
*/
  public String getVig(){
    return vig;
  }
/**
*   Setter de nombre del proyecto vigente
*   @param vig nombre del proyecto vigente a asignar
*/
  public void setVig(String vig){
    this.vig=vig;
  }
/**
* Sobreescritura del método para imprimir con formato los atributos que contiene la instancia de la clase creada.
*/
  @Override
  public String toString(){
    return historicos+", "+vigentes;
  }
}