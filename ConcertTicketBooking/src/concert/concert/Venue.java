package concert.concert;

public class Venue {
    private String name;
    private String address;
    private int capacity;
    
    public Venue(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    @Override
    public String toString() {
        return name + " (" + address + ")";
    }
}