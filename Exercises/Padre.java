package Exercises;

public class Padre {
    String apellido;

    public Padre(String apellido){
        this.apellido = apellido;
    }

    public Boolean test(){
        Hijo hijo=new Hijo("Juan", apellido);
        EspirituSanto es = new EspirituSanto(hijo.getNombre(),hijo.getApellido(),"Lopez");
        return es.pruebaParternidad();
    }
    
}

