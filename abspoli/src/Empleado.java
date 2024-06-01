 abstract public class Empleado {

    private String nombre;
    private String numid;

    public Empleado (String nombre, String numid){
        this.nombre=nombre;
        this.numid=numid;


    }

    public String getNombre() {
        return nombre;
    }
    public String getNumid() {
        return numid;
    }

    abstract  double calcularsalario();
    
}
