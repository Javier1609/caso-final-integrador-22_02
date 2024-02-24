import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class tierra {

    @Test
    void testCalcularTiempoEnSegundos() {
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        int segundosTierra = calculadoraTiempo.calcularTiempoEnSegundos(1);
        assertEquals(31536000,segundosTierra);
        int segundosPlanetaNuevo = calculadoraTiempo.calcularTiempoEnSegundos(2);
        assertEquals(31536000, segundosPlanetaNuevo);
    }



    @Test
    void testConvertirSegundosAMinutos() {
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        double minutos = calculadoraTiempo.convertirSegundosAMinutos(3600);
        assertEquals(60, minutos);
    }

    @Test
    void testConvertirSegundosAHoras() {
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        double horas = calculadoraTiempo.convertirSegundosAHoras(36000);
        assertEquals(10, horas);
    }

    @Test
    void testConvertirSegundosADias() {
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        double dias = calculadoraTiempo.convertirSegundosADias(86400);
        assertEquals(1, dias);
    }
    @Test
    void testConvertirSegundosAMeses() {
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        double meses = calculadoraTiempo.convertirSegundosADias(2592000);
        assertEquals(30, meses);
    }

    @Test
    void testConvertirSegundosAAños() {
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();
        double años = calculadoraTiempo.convertirSegundosAAños(31536000);
        assertEquals(1, años);
    }
}
