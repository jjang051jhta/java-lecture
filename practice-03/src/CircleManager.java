import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //객체배열
        Circle arr[] = new Circle [3];
        for(int i=0;i<3;i++) {
            System.out.println("x,y,radius ==>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            arr[i] = new Circle(x,y,radius);
        }
        for(Circle circle : arr) {
            circle.show();
        }
        int big = 0;
        for(int i=0;i<3;i++) {
            double area =arr[i].getArea();
            if(arr[big].getArea() < arr[i].getArea() ) {
                big = i;
            }
            arr[i].show();
        }
        System.out.println("가장 큰 면적의 원은 ");
        arr[big].show();
    }
}
