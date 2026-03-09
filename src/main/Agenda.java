package main;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<String> tareas = new ArrayList<>();

    public void añadirTarea(String tarea) {
        tareas.add(tarea);
    }

    public List<String> listarTareas() {
        return tareas;
    }

    public void marcarCompletada(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.set(indice, tareas.get(indice) + " [COMPLETADA]");
        }
    }
}