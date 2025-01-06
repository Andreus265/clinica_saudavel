import desmoj.core.simulator.*;
import java.util.concurrent.TimeUnit;



import desmoj.core.dist.*;
import desmoj.core.statistic.*;
//import java.util.Queue;



public class Consultorios extends Entity {

    
    private boolean disponivel = true;
        //instanciando construtor
    public Consultorios(Model owner, String name, Boolean showInTrace){
        super(owner, name, showInTrace); 
        
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void ocupar(){
        disponivel = false;
    }

    public void liberar(){
        disponivel = true;
    }

    
}