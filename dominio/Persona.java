package dominio;

public class Persona {
    int annoNacimiento; /*Para crear un objecto es ºnew "nombre del objecto"()º y se podrá ver el objecto visualmente. 
                        También sirve ºPersona persona1 = new Persona();º, solo que no aparecerá el objecto visualmente.
                        Para decir que el int annoNacimiento tiene que ser ese número es *persona1.annoNacimiento = 1990* */
    Lugar ubicacion;    //Para dentro de persona usar el lugar es ºpersona1.ubicacion = lugar1º
    String nombre;  //A esto se le llama atributo
    public int calcularEdad(){
     return 2020 - annoNacimiento;
    }
    
    public int calcularEdad(int annoActual){  //El int tiene que tener un valor de retorno que se llama Return, sino no funciona.
     return annoActual - annoNacimiento;      //Para que te de el valor de calcular la edad es *persona1.calcularEdad("numero")*
    }
   
    public void mostrarAnnoNacimiento(){
     System.out.println(annoNacimiento);    
    }
    
    public void imprimirNombreUbicacion(){
     System.out.println(ubicacion.getNombre());  //A esto se le llama metodo. Si lleva parentesis es un metodo
    }    
    
    public String toString(){            //Lo que se hace aquí es que al poner en principal.inicio(); se ejecute en principal un System.out.println donde saldrá esta info
     return "Año de nacimiento: " + annoNacimiento + "\nNombre: " + nombre + "\nLugar: " + ubicacion;  //Para hacer un salto de linea es \n
    }
} 