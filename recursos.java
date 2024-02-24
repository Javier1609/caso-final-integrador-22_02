import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class recursos {

    @Test
    void testCalcularConsumoTotal() {
        int[] consumoPeriodo = {10, 15, 20, 10, 15};
        ConsumoRecursos consumoRecursos = new ConsumoRecursos(consumoPeriodo);
        int consumoTotal = consumoRecursos.calcularConsumoTotal(consumoPeriodo);
        assertEquals(70, consumoTotal);
    }

    @Test
    void testCalcularConsumoPromedio() {
        int[] consumoPeriodo = {10, 15, 20};
        ConsumoRecursos consumoRecursos = new ConsumoRecursos(consumoPeriodo);
        int consumoPromedio = consumoRecursos.calcularConsumoPromedio(consumoPeriodo);
        assertEquals(15, consumoPromedio);
    }

    @Test
    void testCalcularConsumoMinimo() {
        int[] consumoPeriodo = {10, 15, 20, 5};
        ConsumoRecursos consumoRecursos = new ConsumoRecursos(consumoPeriodo);
        int consumoMinimo = consumoRecursos.calcularConsumoMinimo(consumoPeriodo);
        assertEquals(5, consumoMinimo);
    }

    @Test
    void testCalcularConsumoMaximo() {
        int[] consumoPeriodo = {10, 15, 20, 25};
        ConsumoRecursos consumoRecursos = new ConsumoRecursos(consumoPeriodo);
        int consumoMaximo = consumoRecursos.calcularConsumoMaximo(consumoPeriodo);
        assertEquals(25, consumoMaximo);
    }

    @Test
    void testVerificarAlerta() {
        int[] consumoPeriodo = {10, 15, 20};
        ConsumoRecursos consumoRecursos = new ConsumoRecursos(consumoPeriodo);
        int umbralSeguro = 50;
        assertTrue(consumoRecursos.verificarAlerta(consumoPeriodo, umbralSeguro));

        umbralSeguro = 100;
        assertTrue(consumoRecursos.verificarAlerta(consumoPeriodo, umbralSeguro));
    }


    class ConsumoRecursos {
        private int[] consumoDiario;

        public ConsumoRecursos(int[] consumoDiario) {
            this.consumoDiario = consumoDiario;
        }

        public int calcularConsumoTotal(int[] consumoPeriodo) {
            int total = 0;
            for (int consumo : consumoPeriodo) {
                total += consumo;
            }
            return total;
        }

        public int calcularConsumoPromedio(int[] consumoPeriodo) {
            int total = calcularConsumoTotal(consumoPeriodo);
            return total / consumoPeriodo.length;
        }

        public int calcularConsumoMinimo(int[] consumoPeriodo) {
            int min = Integer.MAX_VALUE;
            for (int consumo : consumoPeriodo) {
                if (consumo < min) {
                    min = consumo;
                }
            }
            return min;
        }

        public int calcularConsumoMaximo(int[] consumoPeriodo) {
            int max = Integer.MIN_VALUE;
            for (int consumo : consumoPeriodo) {
                if (consumo > max) {
                    max = consumo;
                }
            }
            return max;
        }

        public boolean verificarAlerta(int[] consumoPeriodo, int umbral) {
            int consumoTotal = calcularConsumoTotal(consumoPeriodo);
            return consumoTotal < umbral;
        }
    }
}
