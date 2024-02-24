import java.util.ArrayList;
import java.util.List;

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
