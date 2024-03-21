import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Book bookList[] = new Book[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("제목을 쓰시오");
            String title = scanner.nextLine();
            System.out.println("저자를 쓰시오");
            String author = scanner.nextLine();
            bookList[i] = new Book(title,author);
        }
        for(int i=0;i<5;i++){
            System.out.printf
                    ("제목은 %s , 저자는 %s",bookList[i].title,bookList[i].author);
        }
    }
}
