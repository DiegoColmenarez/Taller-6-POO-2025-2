package empleados;

import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Pruebas {
    public static void main(String[] args) {
        var empleado = new Empleado("Carlos", 2500.777);
        Gerente gerente = new Gerente("Ana", 4008, "Recursos Humanos");
        System.out.println(empleado.mostrarInformacion());
        System.out.println(gerente.mostrarInformacion());

        // Ejercicio 2
        var vehiculo = new Vehiculo("Carro", "Toyota");
        var moto = new Moto("Deportiva", "Honda", 16.4);
        /**
        System.out.println(moto.cilindrada);
        System.out.println(vehiculo.tipo + vehiculo.marca);
         **/
    }
}

