import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class DescomposicionNumerosTest {

    @Test
    void testObtenerPrimos() {
        DescomposicionNumeros descomposicionNumeros = new DescomposicionNumeros();
        List<Integer> primos = descomposicionNumeros.obtenerPrimos(5);
        assertEquals(5, primos.size());
        assertTrue(primos.contains(2));
        assertTrue(primos.contains(3));
        assertTrue(primos.contains(5));
        assertTrue(primos.contains(7));
        assertTrue(primos.contains(11));
    }

    public class DescomposicionNumeros {

        public List<Integer> obtenerPrimos(int N) {
            List<Integer> primos = new ArrayList<>();
            int num = 2;
            while (primos.size() < N) {
                if (esPrimo(num)) {
                    primos.add(num);
                }
                num++;
            }
            return primos;
        }

        private boolean esPrimo(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
