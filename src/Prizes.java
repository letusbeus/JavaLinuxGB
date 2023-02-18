import java.util.Comparator;
import java.util.PriorityQueue;

public class Prizes {
    private PriorityQueue<Toy> queue;

    public Prizes() {
        queue = new PriorityQueue<>(Comparator.comparingInt(Toy::getFrequency));
    }

    public void Put(Toy toy) {
        queue.offer(toy);
    }

    public Toy Get() {
        return queue.poll();
    }
}
