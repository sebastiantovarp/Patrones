

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import  create.Facade;

public class Cliente {

    private Facade facade;

    private Map<Integer, Runnable> opciones;
    Scanner scanner = new Scanner(System.in)

    public Cliente() {
        opciones = new HashMap<>();
        opciones.put(1, this::opcion1);
        opciones.put(2, this::opcion2);
        opciones.put(3, this::opcion3);
        opciones.put(4, this::opcion4);
        opciones.put(5, this::opcion5);
    }

    public void mostrar() {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcionSeleccionada = 0;

            while (opcionSeleccionada != 6) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Crear HTML");
                System.out.println("2. Insertar body");
                System.out.println("3. Insertar Texto");
                System.out.println("4. Insertar imagén");
                System.out.println("5. Salir");

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
        }

        System.out.println("Saliendo...");
    }

    private void opcion1() {
        System.out.println("Opción 1 seleccionada.");
        System.out.println("Ingrese el nombre del archivo");
        String s = scanner.nextLine();
        System.out.println("Ingrese el nombre de la página");
        String p = scanner.nextLine();
        facade.escribir(s, p);
    }

    private void opcion2() {
        System.out.println("Opción 2 seleccionada.");
        System.out.println("Ingrese lo que desea escribir en el body");
        String s = scanner.nextLine();
        facade.crearBody(s);
        System.out.println("Body creado");
    }

    private void opcion3() {
        System.out.println("Opción 3 seleccionada.");
        System.out.println("Ingrese el texto que desea agregar");
        String s = scanner.nextLine();
        facade.crearTexto(s);
    }

    private void opcion4() {
        System.out.println("Opción 4 seleccionada.");
        System.out.println("Ingrese la ruta de la imagen que desea agregar");
        String s = scanner.nextLine();
        System.out.println("Ingrese el titulo de la imagen");
        String s = scanner.nextLine();
        facade.crearImagen(s, s)
    }

    private void opcion5() {
        System.out.println("Opción 5 seleccionada.");
    }

}

