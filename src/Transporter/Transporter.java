package Transporter;

import java.util.Random;

public class Transporter {
    int timeToNext;
    private Random random;

    public Transporter() {
        random = new Random();
        timeToNext = random.nextInt(5)+1;
    }

    public int transport()
    {
        timeToNext=random.nextInt(5)+1;
        int count = random.nextInt(5)+1;
        System.out.println("Transporter: I took from stock " + count + " pieces of material. Next I will take in: " + timeToNext);
        return count;
    }

    public int getTimeToNext() {
        return timeToNext;
    }

}
