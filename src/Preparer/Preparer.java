package Preparer;

import java.util.Random;

public class Preparer {
    int timeToNext;
    private Random random;
    public Preparer() {
        random = new Random();
        timeToNext = random.nextInt(5)+1;
    }
    public int produce()
    {
        timeToNext=random.nextInt(5)+1;
        int count = random.nextInt(5)+1;
        System.out.println("Preparer: made " + count + " pieces of material. Next I will produce in: " + timeToNext);
        return count;
    }
    public int getTimeToNext() {
        return timeToNext;
    }
}
