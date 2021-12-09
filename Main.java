import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

class Main {
  public static void main(String[] args){
    int x, y, edad, cp, b, v, h, menu=0;

    ArrayList<Empleado> Empleado = new ArrayList<Empleado>();
    ArrayList<String> ProyectosV = new ArrayList<String>();
    ArrayList<String> ProyectosH = new ArrayList<String>();
    ArrayList<Integer> V = new ArrayList<Integer>();
    ArrayList<Integer> H = new ArrayList<Integer>();

    //en este arreglo se guardarán las direcciones
    ArrayList<String> item = new ArrayList<String>();
    //Archivo .csv con 300 direcciones
    File file = new File("direcciones.csv");
    System.out.println(file.exists());
    //clase con la que agregaré las direcciones como elementos del ArrayList<String>
    Direcciones dirs = new Direcciones();
    dirs.leerDirecciones(item,"direcciones.csv");

    //Con esta clase se actualizarán los registros en la BD
    Actualizador bd = new Actualizador();

    //Crear registros
    for(int i=0;i<100;i++){
      
      //nombre y primer apellido
      x=(int)(Math.random()*(20));
      //segundo apellido
      y=(int)(Math.random()*(20));
      //edad
      edad=(18)+(int)(Math.random()*(60));
      //direcciones
      b=(int)(Math.random()*(6));
      //proyectos vigentes
      v=(1)+(int)(Math.random()*(3));
      //proyectos históricos
      h=(int)(Math.random()*(45));

      Empleado a = new Empleado(Datos.NOMBRES_NOMBRES[x], Datos.NOMBRES_APELLIDOS[x], Datos.NOMBRES_APELLIDOS[y], edad, item.get(b), i+1, x, h, v);
      
      Empleado.add(a);
      V.add(v);
      H.add(h);

      for (int j = 0; j < v; j++){
        b=(int)(Math.random()*(6));
        ProyectosV.add(" , , , , , , , , , , , "+Datos.PROYECTOS[b]);
      }
      
      for (int k = 0; k < h; k++){
        b=(int)(Math.random()*(6));
        ProyectosH.add(" , , , , , , , , , , "+Datos.PROYECTOS[b]);
      }
    }

    //Crear csv
    try{
    
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      FileWriter registro = new FileWriter("Registro.csv"); 
      BufferedWriter tor = new BufferedWriter(registro); 
      PrintWriter salida = new PrintWriter(tor); 
    
      salida.println("Persona, , , , Direccion, , , , Datos de empleado, , Proyectos");
      salida.println("Nombre, Apellido, Apellido, Edad, Numero, Calle, Ciudad, CP, Trabajador, Anios de empleado, Proyectos historicos, Proyectos Vigentes");

      for (int i = 0; i < 100; i++) {
        salida.println(Empleado.get(i));

        for (int j = 0; j < V.get(i); j++) {
          salida.println(ProyectosV.get(j));
        }

        for (int k = 0; k < H.get(i); k++){
          salida.println(ProyectosH.get(k));
        }

      }

        
      salida.close();
    }catch(IOException e){
      System.out.println(e.getMessage());
    }

    //Menu
    do{
      System.out.println("Bienvenido");
      System.out.println("¿Que desea hecer?");

      System.out.println("a) Imprimir en pantalla el registro de los trabajadores");
      System.out.println("b) Modificar la informacion");
      System.out.println("c) Salir del programa");

      Scanner op = new Scanner(System.in);
      char o = op.next().charAt(0);

      switch(o){
        case 'a':
    
          try{
            FileReader fr = new FileReader("Registro.csv");
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea!=null){
              System.out.println(linea);
              linea=br.readLine();
            }

          }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
          }catch(IOException ex ){
            System.out.println(ex.getMessage());
          }
          break;

        case 'b':
          int j;
          do{
            System.out.println("¿Que numero de trabajador quiere modificar?");
            Scanner mod = new Scanner(System.in);
            int m = op.nextInt();
            if(m>100 || m<=0){
              System.out.println("Error, no existe ese trabajador");
              j=0;
            }else{

              System.out.println("Nombre, Apellido, Apellido, Edad, Numero, Calle, Ciudad, CP, Trabajador, Anios de empleado, Proyectos historicos, Proyectos Vigentes");
              System.out.println(Empleado.get(m-1));
        
              System.out.println("¿Que dato quiere modificar");
              System.out.println("a) Nombre");
              System.out.println("b) Apellido 1");
              System.out.println("c) Apellido 2");
              System.out.println("d) Edad");

              Scanner dato = new Scanner(System.in);
              char dat = op.next().charAt(0);

              switch (dat){
                case 'a':
                  System.out.println("Ingrese el nombre");
                  Scanner nombre = new Scanner(System.in);
                  String nom = op.next();

                  Empleado.get(m-1).setNombre(nom);

                  System.out.println(Empleado.get(m-1));
                  break;

                case 'b':

                  System.out.println("Ingrese el apellido");
                  Scanner apellido = new Scanner(System.in);
                  String ape = op.next();

                  Empleado.get(m-1).setApellido1(ape);

                  System.out.println(Empleado.get(m-1));
                  break;

                case 'c':

                  System.out.println("Ingrese el apellido");
                  Scanner apellido2 = new Scanner(System.in);
                  String ape2 = op.next();

                  Empleado.get(m-1).setApellido2(ape2);
                  System.out.println(Empleado.get(m-1));
                  break;

                case 'd':
                  int i;
                  do{
                    System.out.println("Ingrese la edad");
                    Scanner Edad = new Scanner(System.in);
                    int ed = op.nextInt();
                    if(ed<18 || ed>60){
                      System.out.println("Error, edad no válida");
                      i=0;
                    }else{
                      Empleado.get(m-1).setEdad(ed);
                      System.out.println(Empleado.get(m-1));
                      i=1;
                    }
                  }while(i==0);
                  break;
              
                default:
                  System.out.println("Opción no válida");
                  break;
              }
              j=1;
            }
          }while(j==0);
          //Sobreesccritura de la Base de Datos
          bd.actualizarBD(Empleado, ProyectosV, ProyectosH, V, H, "Registro.csv");
          break;
        case 'c':
          menu=1;
          break;
        default:
          System.out.println("Opción no válida");
          break;
      }  
    }while(menu==0); 
  }
}