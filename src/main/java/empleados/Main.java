package empleados;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 2500.777);
        Gerente gerente = new Gerente("Ana", 4008, "Recursos Humanos");
        System.out.println(empleado.mostrarInformacion());
        System.out.println(gerente.mostrarInformacion());
    }
}

