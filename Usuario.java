package reto_4;

import java.util.Set;
import java.util.TreeSet;

public class Usuario {
    public Set <String> Lista;
    
public Usuario (){
    Lista = new TreeSet <String> ();
}

public void addTelefono (String telefono) {
    Lista.add(telefono);
}

public void mostrarTelefonos (){
    System.out.println(Lista);
} 
    
    /*String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Usuario() {
    }
     
public Usuario (String telefono){
    this.telefono=telefono;
}    

public void addTelefono(String telefono){
    
}
public void mostrarTelefonos (){
    System.out.println("telefono" + telefono);
}*/
}
