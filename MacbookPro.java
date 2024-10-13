public class MacbookPro extends Laptop{
    private final int ram;
    private final int storage;
    public MacbookPro(){
        this.ram = 12;
        this.storage = 1024;
    }
    @Override
    public String getDescription() {
        return "Macbook Pro (12gb ram 1024gb storage)";
    }
    @Override
    public int getStorage(){return this.storage;}
    @Override
    public int getRam(){return this.ram;}
}
