class Book {
    private String title;
    private String author;
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class Member {

    private int memberId;
    private String memberName;
    Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    void displayMember() {
        System.out.println("Member ID   : " + memberId);
        System.out.println("Member Name : " + memberName);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "ISBN101");
        Member m1 = new Member(92, "Prathamesh");
        Member m2 = new Member(90, "Atharva");
        Member m3 = new Member(91, "Saurabh");
        System.out.println("-- Book Details --");
        b1.displayBook();
        System.out.println("\n-- Member Details --");
        m1.displayMember();
        m2.displayMember();
        m3.displayMember();
    }
}

