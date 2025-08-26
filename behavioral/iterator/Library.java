package behavioral.iterator;

public class Library implements Aggregate<Book> {
    private Book[] books;
    private int index = 0;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index < books.length) {
            books[index++] = book;
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new LibraryIterator();
    }

    // Inner Concrete Iterator
    private class LibraryIterator implements Iterator<Book> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < index && books[currentIndex] != null;
        }

        @Override
        public Book next() {
            return books[currentIndex++];
        }
    }
}
