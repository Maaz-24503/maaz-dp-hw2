public abstract class AddOn extends Laptop{
    Laptop laptop;
    @Override
    public abstract String getDescription();
    @Override
    public int getRam() {return laptop.getRam();}
    @Override
    public int getStorage() {return laptop.getStorage();}
}
