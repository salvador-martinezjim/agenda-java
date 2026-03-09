import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 

        // Paso 4: Personalización con Variable de Entorno
        String usuario = System.getenv("STUDENT_NAME");
        if (usuario == null) usuario = "Invitado";

        while (!salir) {
            System.out.println("==========================================");
            System.out.println(" ORGANIZADOR DE TAREAS - [Usuario: " + usuario + "]");
            System.out.println("==========================================");
            System.out.println("1. Agregar una nueva tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar una tarea");
            System.out.println("5. Ejecutar auto-diagnóstico (Tests)");
            System.out.println("6. Salir");
            System.out.println("==========================================");
            System.out.print("Seleccione una opción: ");

            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe la tarea: ");
                    sn.nextLine(); // Limpiar buffer
                    String t = sn.nextLine();
                    miAgenda.añadirTarea(t);
                    break;
                case 2:
                    System.out.println("Tus tareas: " + miAgenda.listarTareas());
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no implementada aún, pero el flujo de CI funciona!");
            }
        }
    }
}