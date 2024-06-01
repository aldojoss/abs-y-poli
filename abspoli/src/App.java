public class App {
    public static void main(String[] args) throws Exception {

        
        Empleado []emple= new Empleado[2];

        emple[0]= new Empleadomediotiempo("Juanito", "283AH", 35, 25);
        emple[1]= new Empleadotiempocompleto("Carlos", "2893AS", 300000);

        for (int i = 0; i<emple.length;i++){

            System.out.println("Empleado "+ emple[i].getNombre()+" Salario "+emple[i].calcularsalario());


        }


    }
}
