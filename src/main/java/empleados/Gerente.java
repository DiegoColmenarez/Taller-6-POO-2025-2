package empleados;

public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Departamento: " + departamento;
    }
}
