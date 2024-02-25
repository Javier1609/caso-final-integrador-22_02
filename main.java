import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class main {

    public static void main(String[] args) {
        // Crear una instancia de CalculadoraTiempo
        CalculadoraTiempo calculadoraTiempo = new CalculadoraTiempo();

        // Calcular y mostrar el tiempo en la Tierra y en el nuevo planeta
        System.out.println("Tiempo en la Tierra:");
        mostrarTiempo(calculadoraTiempo, 1);

        System.out.println("\nTiempo en el nuevo planeta:");
        mostrarTiempo(calculadoraTiempo, 2);

        // Mostrar los mayores valores representables
        System.out.println("\nMayores valores representables:");
        mostrarMayoresValores(calculadoraTiempo);
    }

    public static void mostrarTiempo(CalculadoraTiempo calculadoraTiempo, int planeta) {
        int segundos = calculadoraTiempo.calcularTiempoEnSegundos(planeta);
        System.out.println("Segundos: " + segundos);
        System.out.println("Minutos: " + calculadoraTiempo.convertirSegundosAMinutos(segundos));
        System.out.println("Horas: " + calculadoraTiempo.convertirSegundosAHoras(segundos));
        System.out.println("Días: " + calculadoraTiempo.convertirSegundosADias(segundos));
        System.out.println("Años: " + calculadoraTiempo.convertirSegundosAAños(segundos));
    }

    public static void mostrarMayoresValores(CalculadoraTiempo calculadoraTiempo) {
        System.out.println("Máximos valores representables:");
        System.out.println("Byte: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MAX_VALUE);
    }
}

class CalculadoraTiempo {
    private static final double FACTOR_TIEMPO_PLANETA = 1.2;

    public int calcularTiempoEnSegundos(int planeta) {
        return 365 * 24 * 60 * 60;
    }

    public double convertirSegundosAMinutos(int segundos) {
        return segundos / 60.0;
    }

    public double convertirSegundosAHoras(int segundos) {
        return segundos / 3600.0;
    }

    public double convertirSegundosADias(int segundos) {
        return segundos / 86400.0;
    }

    public double convertirSegundosAAños(int segundos) {
        return segundos / 31536000.0;
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