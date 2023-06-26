import Zoopark.*;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        System.out.println("1.Elephant");
        /*elephant1.breathe();
        elephant1.move();*/
        Lion lion1 = new Lion();
        /*lion1.breathe();
        lion1.move();*/
        System.out.println("2.Lion");
        Raven raven1 = new Raven();
        System.out.println("3.Raven");
        /*raven1.breathe();
        raven1.move();*/
        Mockingbird mockingbird1 = new Mockingbird();
        System.out.println("4.Mockingbird");
       /* mockingbird1.breathe();
        mockingbird1.move();*/
        Shark shark1 = new Shark();
        System.out.println("5.Shark");
        /*shark1.breathe();
        shark1.move();*/
        Dolphin dolphin1 = new Dolphin();
        System.out.println("6.Dolphin");
        /*dolphin1.breathe();
        dolphin1.move();*/

        String str = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose the animal: ");
        str = scanner.nextLine();
        if (str.equals("2")|| str.equals("Lion")) {
            lion1.breathe();
            lion1.move();
            lion1.roar();
        }
        else if (str.equals("1")|| str.equals("Elephant")) {
            elephant1.breathe();
            elephant1.move();
            elephant1.sleep();
        }
        else if (str.equals("3")|| str.equals("Raven")) {
            raven1.breathe();
            raven1.move();
            raven1.cawing();
        }
        else if (str.equals("4")|| str.equals("Mockingbird")) {
            mockingbird1.breathe();
            mockingbird1.move();
            mockingbird1.tweet();
        }
        else if (str.equals("5")|| str.equals("Shark")) {
            shark1.breathe();
            shark1.move();
            shark1.bite();
        }
        else if (str.equals("6")|| str.equals("Dolphin")) {
            dolphin1.breathe();
            dolphin1.move();
            dolphin1.whistle();
        }
        else System.out.println("There is no such animal in the Zoo");
    }
}

       /* Book suitcase = new Book("Suitcase", "Hard cover", "Dovlatov", "Ast", 120);
        Chapter chapter1 = new Chapter(" The contents of an old suitcase provide the inspiration for Sergei Dovlatov's witty tales of life in 1960s Soviet Russia", "An Officer’s Belt", "I had three long conversations with Marusya over a cup of coffee. She told me her whole rather silly story. To some degree we became friends.");
        Contents contents = new Contents(1986, "There's a reason every book, even one that isn't very serious, is shaped like a suitcase", new int[3]);
        *//*Book compromise = new Book("Compromise", "Hard cover", "Dovlatov", "Books", 200);*//*
        Ebook suitcase2 = new Ebook("Suitcase", "Dovlatov", "No cover", "Ast", 150, "EPUB");
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the book: ");
        str = scanner.nextLine();
        if (str.equals("suitcase")) {
            System.out.println("Book name: " + suitcase.getBookName());
            System.out.println("Author: " + suitcase.getAuthor());
            System.out.println("Number of pages: " + suitcase.getNumberOfPages());
            System.out.println("Author quote: " + contents.getAuthorQuote());
        } else if (str.equals("suitcase2")) {
            System.out.println("Name: " + suitcase2.getBookName());
            System.out.println("Number of pages: " + suitcase2.getNumberOfPages());
            System.out.println("Book format: " + suitcase2.getBookFormat());
        } else System.out.println("No book found");
    }
}*/





        /*Book suitcaseCopy = suitcase;
        System.out.println(suitcase.getName());
        System.out.println(compromise.getName());
        System.out.println(suitcaseCopy.getName());
        System.out.println(suitcaseCopy.getNumberOfPages());
        suitcaseCopy.setNumberOfPages(200);
        System.out.println(suitcaseCopy.getNumberOfPages());
        String suitcaseAuthor = suitcase.getAuthor();
        System.out.println(suitcaseAuthor);*/


/*        Chapter Chapter1 = new Chapter(" The contents of an old suitcase provide the inspiration for Sergei Dovlatov's witty tales of life in 1960s Soviet Russia", "An Officer’s Belt", "I had three long conversations with Marusya over a cup of coffee. She told me her whole rather silly story. To some degree we became friends.");
        Contents Contents = new Contents(1986, "There's a reason every book, even one that isn't very serious, is shaped like a suitcase", new int[3]);
        Book Suitcase = new Book("Suitcase", "Hard cover", "Dovlatov", "Ast", 120);
        SecondBook Compromise = new SecondBook("Compromise", "Dovlatov", "Hard cover", "Books", 200);
        String book = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the book: ");
        book = scanner.nextLine();
        while (true) {
            if (book.contains("Suitcase")) {
                System.out.println("Name: " + Book.name);
                System.out.println("Author: " + Book.author);
                System.out.println("Number of pages: " + Book.numberOfPages);
                SysteChapter Chapter1 = new Chapter(" The contents of an old suitcase provide the inspiration for Sergei Dovlatov's witty tales of life in 1960s Soviet Russia", "An Officer’s Belt", "I had three long conversations with Marusya over a cup of coffee. She told me her whole rather silly story. To some degree we became friends.");
        Contents Contents = new Contents(1986, "There's a reason every book, even one that isn't very serious, is shaped like a suitcase", new int[3]);
        Book Suitcase = new Book("Suitcase", "Hard cover", "Dovlatov", "Ast", 120);
        SecondBook Compromise = new SecondBook("Compromise", "Dovlatov", "Hard cover", "Books", 200);
        String book = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select the book: ");
        book = scanner.nextLine();
        while (true) {
            if (book.contains("Suitcase")) {
                System.out.println("Name: " + Book.name);
                System.out.println("Author: " + Book.author);
                System.out.println("Number of pages: " + Book.numberOfPages);
                System.out.println("Year release: " + Contents.yearRelease);
                break;
            } else if
            (book.contains("Compromise")) {
                System.out.println("Name: " + SecondBook.name);
                System.out.println("Author: " + SecondBook.author);
                System.out.println("Number of pages: " + SecondBook.numberOfPages);
                System.out.println("Editions: " + SecondBook.edition);

                break;
            }
            Book.getName();
            Book.setName();
            Book.getCover();
            Book.setCover();
            Book.getAuthor();
            Book.setAuthor();
            Book.getEdition();
            Book.setEdition();
            Book.getNumberOfPages();
            Book.setNumberOfPages();
            Contents.getAuthorQuote();
            Contents.setAuthorQuote();
            Contents.getYearRelease();
            Contents.setYearRelease();
            Contents.getContents();
            Contents.setContents();
            Chapter.getName();
            Chapter.setName();
            Chapter.getAnnotation();
            Chapter.setAnnotation();
            Chapter.getText();
            Chapter.setText();
            SecondBook.getName();
            SecondBook.setName();
        }*/





































