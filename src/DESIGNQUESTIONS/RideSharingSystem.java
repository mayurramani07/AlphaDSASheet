package DESIGNQUESTIONS;
import java.util.*;
public class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    Set<Integer> cancel;
    Set<Integer> waiting;
    public RideSharingSystem() {
        rider = new LinkedList<>();
        driver = new LinkedList<>();
        cancel = new HashSet<>();
        waiting = new HashSet<>();
    }
    public void addRider(int riderId) {
        rider.offer(riderId);
        waiting.add(riderId);
    }
    public void addDriver(int driverId) {
        driver.offer(driverId);
    }
    public int[] matchDriverWithRider() {
        while(!rider.isEmpty() && cancel.contains(rider.peek())) {
            waiting.remove(rider.peek());
            cancel.remove(rider.peek());
            rider.poll();
        }
        if(rider.isEmpty() || driver.isEmpty()) {
            return new int[]{-1,-1};
        }
        int r = rider.poll();
        int d = driver.poll();

        waiting.remove(r);
        return new int[]{d,r};
    }
    public void cancelRider(int riderId) {
        if (waiting.contains(riderId)) {
            waiting.remove(riderId);
            cancel.add(riderId);
        }
    }
}