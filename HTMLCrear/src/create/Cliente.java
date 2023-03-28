package create;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cliente {
    private Map<Integer, Runnable> opciones;

    public Cliente() {
        opciones = new HashMap<>();
        opciones.put(1, this::opcion1);
        opciones.put(2, this::opcion2);
        opciones.put(3, this::opcion3);
        opciones.put(4, this::opcion4);
        opciones.put(5, this::opcion5);
    }

    public void mostrar() {
        Scanner scanner = new Scanner(System.in);

        int opcionSeleccionada = 0;

        while (opcionSeleccionada != 6) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear HTML");
            System.out.println("2. Insertar Texto");
            System.out.println("3. Insertar body");
            System.out.println("4. Insertar imagenes");
            System.out.println("5. Opción 5");
            System.out.println("6. Salir");

            try {
                opcionSeleccionada = Integer.parseInt(scanner.nextLine());

                if (opciones.containsKey(opcionSeleccionada)) {
                    opciones.get(opcionSeleccionada).run();
                } else {
                    System.out.println("Opción inválida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        System.out.println("Saliendo...");
    }

    private void opcion1() {
        System.out.println("Opción 1 seleccionada.");
    }

    private void opcion2() {
        System.out.println("Opción 2 seleccionada.");
    }

    private void opcion3() {
        System.out.println("Opción 3 seleccionada.");
    }

    private void opcion4() {
        System.out.println("Opción 4 seleccionada.");
    }

    private void opcion5() {
        System.out.println("Opción 5 seleccionada.");
    }

}

