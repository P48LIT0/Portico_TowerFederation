package Builder;

import java.util.Random;



public class Builder {
    int timeToNext;
    private Random random;
    private int available;
    private int max = 500;

    private static Builder instance = null;
    
    public Builder() {
        random = new Random();
        timeToNext = random.nextInt(5)+1;
    }

    static public Builder getInstance()
    {
        if(instance==null) instance = new Builder();
        return instance;
    }
    
    
    public int build()
    {
        timeToNext=random.nextInt(5)+1;
        int count = random.nextInt(5)+1;
        System.out.println("Builder: built " + count + ". Next I will build in: " + timeToNext);
        return count;
    }

    public boolean addTo(int count)
    {
        if(this.available+count<=this.max) {
            this.available += count;
            System.out.println("Builder: built " + count + " pieces of material. Tower consists of " + this.available + " pieces of material");
            return true;
        }
        else
        {
            System.out.println("Builder: I have no left space for " + count + " products");
            return false;
        }
    }
    public int getTimeToNext() {
        return timeToNext;
    }

    
}
