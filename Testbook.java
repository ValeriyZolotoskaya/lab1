package Book;
public class Testbook {
    public static void main(String[] args) {
        Book b1 = new Book("Лолита", "Владимир Владимирович Набоков", 96, "Egogender");
        Book b2 = new Book("Сахарный Кремль", "Владимир Георгиевич Сорокин", 180, "Two-spirit");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}