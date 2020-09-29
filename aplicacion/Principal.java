package aplicacion;
import dominio.*; //También se puede hacer import dominio.Persona o dominio.Lugar


public class Principal {

  public static void inicio(){
    Lugar lugar1 = new Lugar(); //Se crea un objecto llamado lugar1
    //lugar1.nombre = "Madrid"; //Se le da un nombre a lugar1
    
    Persona persona1 = new Persona(); //Se crea un objeto llamado persona1
    /*persona1.annoNacimiento = 2000; //Dentro del int annoNacimiento se le da un valor de 2000
    persona1.nombre = "Lucas"; //Se le da un nombre a persona1
    persona1.ubicacion = lugar1; //Se iguala la ubicación de persona1 a la de lugar1*/
    
    System.out.println(persona1); //Aparecerá en la consola lo que pone en el toString de Persona
  }
}
