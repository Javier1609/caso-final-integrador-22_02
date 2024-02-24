import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Alertatest {

     String notificarEvento(double valor, String tipoVariable) {
        // Lógica para determinar si el valor está por fuera de los límites aceptables
        if (valor > 100) {
            return "Alerta: Valor de " + tipoVariable + " extremadamente alto. Se requiere ajuste.";
        } else if (valor < 0) {
            return "Alerta: Valor de " + tipoVariable + " extremadamente bajo. Se requiere ajuste.";
        } else {
            return "Valor de " + tipoVariable + " dentro de los límites aceptables.";
        }
    }

        @Test
        void testNotificarEventoAlto () {
            Alerta alerta = new Alerta();
            String mensaje = alerta.notificarEvento(150, "Radiación");
            assertEquals("Alerta: Valor de Radiación extremadamente alto. Se requiere ajuste.", mensaje);
        }

        @Test
        void testNotificarEventoBajo () {
            Alerta alerta = new Alerta();
            String mensaje = alerta.notificarEvento(-10, "Presión");
            assertEquals("Alerta: Valor de Presión extremadamente bajo. Se requiere ajuste.", mensaje);
        }

        @Test
        void testNotificarEventoMedio () {
            Alerta alerta = new Alerta();
            String mensaje = alerta.notificarEvento(50, "Temperatura");
            assertEquals("Todo en orden", mensaje);
        }
    }
