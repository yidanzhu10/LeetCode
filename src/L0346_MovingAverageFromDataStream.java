import java.util.LinkedList;
import java.util.Queue;


public class L0346_MovingAverageFromDataStream {
}

class MovingAverage {

    int size;
    Queue<Integer> queue;
    double sum;

    public MovingAverage(int size){
        this.size = size;
        this.sum = 0;
        this.queue = new LinkedList<>();
    }

    public double next(int val){
        this.sum += val;
        this.queue.offer(val);
        if(queue.size() >= this.size){
            sum -= queue.poll();
        }
        return sum / this.queue.size();
    }
}
