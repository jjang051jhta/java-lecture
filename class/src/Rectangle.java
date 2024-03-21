public class Rectangle {
    int width;
    int height;

    // 생성자 오버로드
    Rectangle() {

    }
    Rectangle(int w, int h) {
        // 생성자 함수
        System.out.println("나는 넓이 "+w+",높이 "+h+" 네모입니다.");
    }

    int getArea() {
        return width*height;
    }
}
