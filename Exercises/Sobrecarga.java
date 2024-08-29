package Exercises;

public class Sobrecarga {

    String nombre;
    String materia;
    int calificacion;

    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }
    public String reprobar(){
        if (this.calificacion > 5)
            return "true";
        else
            return "false";
            
    }

    /**
     * Profesor
     */
    class Profesor extends Sobrecarga{
        public Profesor(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }
        public String reprobar(){
            if(this.calificacion > 5)
                return ">:) Sacaste "+this.calificacion+" en " + this.materia;
            else
                return ":(";
        }
    }
 
    /*
     * Alumno
     */
 


}

