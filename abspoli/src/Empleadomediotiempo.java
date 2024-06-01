public class Empleadomediotiempo extends Empleado {

    private double salarioporhora;
    private double horastrabajadasporsemana;

    public Empleadomediotiempo (String nombre, String numid, double salarioporhora,double horastrabajadasporsemana){
        super(nombre, numid);
        this.salarioporhora=salarioporhora;
        this.horastrabajadasporsemana=horastrabajadasporsemana;



    }

    public double getHorastrabajadasporsemana() {
        return horastrabajadasporsemana;
    }

    public double getSalarioporhora() {
        return salarioporhora;
    }

    @Override
    double calcularsalario() {
        double result = salarioporhora*horastrabajadasporsemana;
       
        return result;
       
    }


    
}
