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
}
