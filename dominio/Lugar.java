package dominio;

public class Lugar {
 private int numeroHabitantes = 100; //A numero de habitantes le das el valor de 100
 private String nombre; 
 
private void pruebaPrivado(){
 numeroHabitantes = numeroHabitantes +1;
}
 
public String toString(){
 return  nombre + "\nNumero de habitantes: " + numeroHabitantes;
}

public String getNombre(){    //metodo que recoge el nombre
 return nombre;   //le devuelve el nombre que esta en el atributo de tipo String y se llama nombre
} 

//Le da un nombre que dentro es de tipo string y lo llama lugar.
public void setNombre(String lugar){ // Asi se le da un nuevo nombre lugar1.setNombre("Mexico");
 //cambia el nombre que esta puesto por default por uno nuevo seteado con el setNombre
 nombre = lugar; //para comprobar si el nombre esta bien puesto es system.out.println(lugar1.getNombre());
}    

public int getNumeroHabitantes(){
 return numeroHabitantes;   
}  

public void setNumeroHabitantes(int nuevoNumeroHabitantes){
 numeroHabitantes = nuevoNumeroHabitantes; 
}

}