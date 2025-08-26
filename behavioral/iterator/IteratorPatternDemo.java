package behavioral.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        Library library = new Library(5);

        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.addBook(new Book("Design Patterns", "Harish"));

        Iterator<Book> iterator = library.createIterator();

        System.out.println("Library Books:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
