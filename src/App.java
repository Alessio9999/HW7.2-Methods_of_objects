public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Лев","Толстой");
        Author author2 = new Author("Карл","Маркс");
        Author author3 = new Author("Карл","Маркс");
        Book book1 = new Book("Война и мир", author1, 1873);
        Book book2 = new Book("Капитал", author2, 1867);
        Book book3 = new Book("Капитал", author3, 1867);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("book3.hashCode() = " + book3.hashCode());
        System.out.println("book1 == book2 -> " + book1.equals(book2));
        System.out.println("book2 == book3 -> " + book2.equals(book3));
    }
}