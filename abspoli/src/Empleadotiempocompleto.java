public class Empleadotiempocompleto extends Empleado {

    private double salarioanual;

    public Empleadotiempocompleto(String nombre, String numid, double salarioanual){
        super(nombre, numid);
        this.salarioanual=salarioanual;


    }

    public double getSalarioanual() {
        return salarioanual;
    }

    @Override
    double calcularsalario() {
        
        double result= salarioanual/12;
        return result;
    }


    
}
