class Book {
    String title, author, genre;
    double price;
    int pages;

    Book(String title, String author, String genre, double price, int pages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.pages = pages;
    }

    void displayBook() {
        System.out.println();
        System.out.println("BOOK DETAILS");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Genre  : " + genre);
        System.out.println("Price  : " + price);
        System.out.println("Pages  : " + pages);
    }
}

class Library {
    String name, location;
    int capacity;
    Book book;

    Library(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.book = new Book("The Alchemist", "Paulo Coelho", "Fiction", 299.99, 208); // Method1
    }

    void displayLibrary() {
        System.out.println();
        System.out.println("LIBRARY DETAILS");
        System.out.println("Name     : " + name);
        System.out.println("Location : " + location);
        System.out.println("Capacity : " + capacity);
    }
}

class LibraryDriver {
    public static void main(String[] args) {
        Library lib = new Library("Central Library", "Pune", 5000);
        lib.displayLibrary();
        lib.book.displayBook();
    }
}
