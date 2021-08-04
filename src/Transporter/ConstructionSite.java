package Transporter;


public class ConstructionSite {
    private int available;
    private int max;
    private static ConstructionSite instance = null;

    private ConstructionSite() {
    	available=0;
        max=200;

    }

    static public ConstructionSite getInstance()
    {
        if(instance==null) instance = new ConstructionSite();
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
            System.out.println("Construction site: added " + count + " pieces of material. There is " + this.available + " pieces of material in the construction site");
            return true;
        }
        else
        {
            System.out.println("Construction site: no place for " + count + " pieces of material");
            return false;
        }
    }

    public boolean getFrom(int count)
    {
        if(available-count>=0) {
            this.available-=count;
            System.out.println("Construction site: " + count + " pieces of material were taken to building tower. There is " + this.available + " pieces of material in the construction site");
            return true;
        }
        else
        {
            System.out.println("Construction site: there is no material in construction site.");
            return false;
        }
    }
}
