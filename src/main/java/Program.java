import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                String value = hashmap.get(key);
                System.out.println(value);
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> books = new HashMap<>();
        books.put("book1", new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        books.put("book2", new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        books.put("book3", new Book("1984", "George Orwell", 1949));

        System.out.println("All books:");
        printValues(books);

        System.out.println("\nBooks containing 'Harry':");
        printValueIfNameContains(books, "Harry");
    }
}
