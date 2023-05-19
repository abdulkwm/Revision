package ex1;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many book object you want to add?");
        int size = sc.nextInt();
        Book [] book = new Book[size];
        for (int i = 0; i < book.length; i++){
            Book book1 = new Book();
            System.out.println("please enter book Id");
            book1.setBookId(sc.nextInt());
            System.out.println("please enter book name");
            book1.setBookName(sc.next());
            System.out.println("please enter book price");
            book1.setBookPrice(sc.nextFloat());
            book[i] = book1;
        }
        for (Book books: book
             ) {
            System.out.println(books.toString());
        }
    }
}
