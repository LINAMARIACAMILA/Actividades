
import java.util.*;

public class Cliente {
    
    private String Nombre;
    private String Documento;
  
    public Cliente() {
    }
    
    private void  setNombre(String Nombre){
        this.Nombre=Nombre;
    }
     
    private String getNombre(){
       return this.Nombre;
    }
    
    private void  setDocumento(String Documento){
        this.Documento=Documento;
    }
     
    private String getDocumento(){
       return this.Documento;
    }


}