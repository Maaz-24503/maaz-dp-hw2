public class Storage256Gb extends AddOn{
    private Storage256Gb(){}
    public Storage256Gb(Laptop laptop){
        this.laptop = laptop;
    }
    @Override
    public String getDescription() {
        return this.laptop.getDescription()+" +256gb storage (additional)";
    }
    @Override
    public int getStorage() {
        return laptop.getStorage() + 256;
    }
}
