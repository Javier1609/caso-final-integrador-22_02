import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StarNavigator {
    public int[][] planRoutes(int[][] terrain) {
        return new int[][]{};
    }

    public int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        // Verificar que las matrices se pueden multiplicar
        if (matrixA[0].length != matrixB.length) {
            throw new IllegalArgumentException("Las matrices no se pueden multiplicar");
        }
        int[][] result = new int[matrixA.length][matrixB[0].length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    @Test
    void testPlanRoutes() {
        StarNavigator starNavigator = new StarNavigator();

        int[][] terrain = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        int[][] routes = starNavigator.planRoutes(terrain);

        int[][] expectedRoutes = new int[][]{};

        assertArrayEquals(expectedRoutes, routes);
    }

    @Test
    void testMultiplyMatrices() {
        StarNavigator starNavigator = new StarNavigator();

        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrixB = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        };

        int[][] product = starNavigator.multiplyMatrices(matrixA, matrixB);

        int[][] expectedProduct = {
                {84, 90, 96},
                {201, 216, 231},
                {318, 342, 366}
        };

        assertArrayEquals(expectedProduct, product);
    }
}