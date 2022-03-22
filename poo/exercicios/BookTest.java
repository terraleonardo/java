public class BookTest {
    
    public static void main(String[] args) {
        
        Book l01 = new Book("Duna", 400);

        System.out.println(l01.getPages());
        System.out.println(l01.getReadPages());

        l01.read(36);
        System.out.println(l01.getReadPages());
        l01.read(72);
        l01.read(292);

        l01.restart();

        System.out.println(l01.getReadPages());
    }
}
