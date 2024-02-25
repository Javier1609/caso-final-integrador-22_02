import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Alerta {
    public String notificarEvento(int i, String radiación) {
        if (i > 100) {
            return "Alerta: Valor de " + radiación + " extremadamente alto. Se requiere ajuste.";
        } else if (i < 0) {
            return "Alerta: Valor de " + radiación + " extremadamente bajo. Se requiere ajuste.";
        } else {
            return "Todo en orden";
        }
    }

    public class MonitoreoAmbiental {
        private double nivelRadiacion;
        private double temperatura;
        private double presion;

        public MonitoreoAmbiental(double nivelRadiacion, double temperatura, double presion) {
            this.nivelRadiacion = nivelRadiacion;
            this.temperatura = temperatura;
            this.presion = presion;
        }

        public double getNivelRadiacion() {
            return nivelRadiacion;
        }

        public double getTemperatura() {
            return temperatura;
        }

        public double getPresion() {
            return presion;
        }
    }

    @Test
    void testGetNivelRadiacion() {
        MonitoreoAmbiental monitoreo = new MonitoreoAmbiental(0.15, 25.0, 1013.0);
        assertEquals(0.15, monitoreo.getNivelRadiacion());
    }

    @Test
    void testGetTemperatura() {
        MonitoreoAmbiental monitoreo = new MonitoreoAmbiental(0.15, 25.0, 1013.0);
        assertEquals(25.0, monitoreo.getTemperatura());
    }

    @Test
    void testGetPresion() {
        MonitoreoAmbiental monitoreo = new MonitoreoAmbiental(0.15, 25.0, 1013.0);
        assertEquals(1013.0, monitoreo.getPresion());
    }
}