import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.random.RandomGenerator;

public class Randoms implements Iterable<Integer> {
    protected Random random;
     int min;
     int max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return new Random().nextInt((max+1)-min)+min;
            }
        };
    }
}


