public class Ram2Gb extends AddOn{
    private Ram2Gb(){}
    public Ram2Gb(Laptop laptop){
        this.laptop = laptop;
    }
    @Override
    public String getDescription() {
        return this.laptop.getDescription()+" +2gb Ram (additional)";
    }

    @Override
    public int getRam() {
        return laptop.getRam() + 2;
    }
}
