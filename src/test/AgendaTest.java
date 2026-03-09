package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Agenda;

public class AgendaTest {
    @Test
    public void testAñadirTarea() {
        Agenda miAgenda = new Agenda();
        miAgenda.añadirTarea("Estudiar CI/CD");
        assertEquals(1, miAgenda.listarTareas().size());
        assertEquals("Estudiar CI/CD", miAgenda.listarTareas().get(0));
    }
}