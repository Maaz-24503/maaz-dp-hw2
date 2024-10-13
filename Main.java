public class Main {
    public static void main(String[] args) {
        Laptop macbookPro = new MacbookPro();
        System.out.println(macbookPro.getDescription());
        macbookPro = new Storage256Gb(macbookPro);
        System.out.println(macbookPro.getDescription());
        macbookPro = new Ram2Gb(macbookPro);
        System.out.println(macbookPro.getDescription());
    }
}
