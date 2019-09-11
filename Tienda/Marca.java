
import java.util.*;

public class Marca {

    public String Direccion;
    public String Nombre;
    
    public Marca() {
    }
    
    public void  setDireccion(String DireccionServicio){
        this.Direccion=DireccionServicio;
    }
     
    public String getDireccion(){
       return this.Direccion;
    }
    
    public void  setNombre(String Nombre){
        this.Nombre=Nombre;
    }
     
    public String getNombre(){
       return this.Nombre;
    }



}