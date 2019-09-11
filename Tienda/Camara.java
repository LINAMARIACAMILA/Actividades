
import java.util.*;

public class Camara {

    public String Modelo;
    public String Marca;
    public Boolean Flash;
    
    public Camara() {
    }

    public void  setModelo(String Modelo){
        this.Modelo=Modelo;
    }
     
    public String getModelo(){
       return this.Modelo;
    }
    
    public void  setMarca(String Marca){
        this.Marca=Marca;
    }
     
    public String getMarca(){
       return this.Marca;
    }
    
    public void  setFlash(Boolean Flash){
        this.Flash=Flash;
    }
     
    public Boolean getFlash(){
       return this.Flash;
    }
    
    
    


}