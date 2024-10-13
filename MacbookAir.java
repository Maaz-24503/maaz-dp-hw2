public class MacbookAir extends Laptop{
    private final int ram;
    private final int storage;
    public MacbookAir(){
        this.ram = 6;
        this.storage = 512;
    }
    @Override
    public String getDescription() {
        return "Macbook Air (6gb ram 512gb storage)";
    }
    public int getStorage(){return this.storage;}
    public int getRam(){return this.ram;}
}
