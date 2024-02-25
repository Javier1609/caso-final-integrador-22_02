import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TaskPlanner {
    public int[] assignTasks(int[][] tasks, int[] workloads) {
        int[] optimalWorkloads = new int[workloads.length];
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[i].length; j++) {
                optimalWorkloads[i] += tasks[i][j];
            }
        }
        return optimalWorkloads;
    }

    @Test
    void testAssignTasks() {
        TaskPlanner taskPlanner = new TaskPlanner();

        int[][] tasks = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        int[] workloads = {30, 40, 50};

        int[] optimalWorkloads = taskPlanner.assignTasks(tasks, workloads);

        int[] expectedWorkloads = {6, 9, 12};
        assertArrayEquals(expectedWorkloads, optimalWorkloads);
    }
}