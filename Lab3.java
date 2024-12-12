package ColPac;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab3 
{
	public static void main(String[] args) {
        int iterationCount = 100000;

        System.out.printf("%-15s %-15s %-15s %-15s%n", "Method", "Iteration", "ArrayList Time", "LinkedList Time");

        testAdd(iterationCount);

        testRemove(iterationCount);

        testGet(iterationCount);
    }

    private static void testAdd(int iterations) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.printf("%-15s %-15d %-15d %-15d%n", "add", iterations, arrayListTime, linkedListTime);
    }

    private static void testRemove(int iterations) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            arrayList.remove(Integer.valueOf(i)); 
        }
        endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        // Тест для LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            linkedList.remove(Integer.valueOf(i));
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.printf("%-15s %-15d %-15d %-15d%n", "remove", iterations, arrayListTime, linkedListTime);
    }

    private static void testGet(int iterations) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int value = arrayList.get(i); 
        }
        endTime = System.nanoTime();
        long arrayListTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            int value = linkedList.get(i); 
        }
        endTime = System.nanoTime();
        long linkedListTime = endTime - startTime;

        System.out.printf("%-15s %-15d %-15d %-15d%n", "get", iterations, arrayListTime, linkedListTime);
    }

}
