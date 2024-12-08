/*
 Problem Statemnt
 Write a Java program that, given a list of books, prints the title of books whose publication year is between 2000 and 2022 (including 2000, 2022). Otherwise the program raises an exception and prints custom message. Complete the program as specified below.
• ClassPublicationYearOutOfBoundsExceptionextendstheExceptionclassandshould have the following member:
– Constructor public PublicationYearOutOfBoundsException(String t) that
takes the title of the book as argument. The constructor, initializes the error mes- sageas"Publication year of <book-title> is outside the acceptable range".
• Class Book has/should have the following members:
– Private instance variables String title and int publicationYear
– Constructor to initialize these variables
– MethodcheckAndGetTitleshouldreturnthetitleofthebookifthepublicationYear
is within the given limits. Otherwise, it should throw PublicationYearOutOfBoundsException.
• Class ExceptionTest has the main method. It takes the title and publicationYear of four books as input, and invokes the method checkAndGetTitle of class Book to produce the specified output.
 
What you have to do
• Define class PublicationYearOutOfBoundsException
• Define method checkAndGetTitle() in class Book
*/

import java.util.Scanner;
import java.util.ArrayList;
//Answer starts
class PublicationYearOutOfBoundsException extends Exception{
    public PublicationYearOutOfBoundsException(String t){
        super("Publication year of \"" + t + " \"is outside the acceptable range");
    }
}
//Answer ends
class Book{
    private String title;
    private int publicationYear;
    public Book(String t, int year){
        title = t;
        publicationYear = year;
    }
    public String checkAndGetTitle() throws PublicationYearOutOfBoundsException{
        //Answer Starts
        if(publicationYear <= 2000 || publicationYear > 2022){
            throw new PublicationYearOutOfBoundsException(title);
        }
        return title;
        //Answer Ends
    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            Book b = new Book(sc.next(), sc.nextInt());
            bookList.add(b);
        }
        for(Book b: bookList){
            try{
                String title = b.checkAndGetTitle();
                System.out.println(title);
            }
            catch(PublicationYearOutOfBoundsException pe){
                System.out.println(pe.getMessage());
            }
        }
        sc.close();
    }
}
