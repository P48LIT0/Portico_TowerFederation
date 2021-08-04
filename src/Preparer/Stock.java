package Preparer;
public class Stock {
    private int available;
    private int max;
    private static Stock instance = null;

    private Stock() {
    	available=0;
        max=50;

    }

    static public Stock getInstance()
    {
        if(instance==null) instance = new Stock();
        return instance;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean addTo(int count)
    {
        if(this.available+count<=this.max) {
            this.available += count;
            System.out.println("Stock: added " + count + " pieces of material. There is " + this.available + " pieces of material in stock");
            return true;
        }
        else
        {
            System.out.println("Stock: no place for " + count + " pieces of material");
            return false;
        }
    }

    public boolean getFrom(int count)
    {
        if(available-count>=0) {
            this.available-=count;
            System.out.println("Stock: " + count + " pieces of material were taken. There is " + this.available + " pieces of material in stock");
            return true;
        }
        else
        {
            System.out.println("Stock: lack of material");
            return false;
        }
    }
}
