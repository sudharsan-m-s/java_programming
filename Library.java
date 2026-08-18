class Book
{
    int bookId;
    String title;
    String author;
    String category;
    int price;
    boolean isAvailable = false;
    Book(int b,String t, String a, String c, int p)
    {
        bookId = b;
        title = t;
        author = a;
        category = c;
        price = p;
    }
    void displayBookDetails()
    {
        System.out.println("Book_ID: "+ bookId);
        System.out.println("Book Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Category: "+ category);
        System.out.println("Price: Rs."+ price);
        System.out.println();
    }
}
public class Library
{
    public static void main(String[] args) {
        Book b1 = new Book(301,"Harry Potter","J K Rowling","Fiction",450);
        Book b2 = new Book(306,"The Alchemist","Paulo Coehlo","Non-Fiction",470);
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}