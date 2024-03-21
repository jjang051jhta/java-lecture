public class Book {
    String title;
    String author;
    // 생성자 두개...
    Book() {
        this("","");
        System.out.println("나는 this로 호출되었습니다.");
    }
    Book(String title) {
        //this.title = title;
        //this.author = "작자미상";
        this(title,"작자미상");
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
