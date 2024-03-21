public class CircleTest {
    public static void main(String[] args) {
        Circle basketBall = new Circle(20,"농구공");
        System.out.println(basketBall.getArea());

        Circle baseBall = new Circle(12,"야구공");
        baseBall.name = "야구공";
        System.out.println(baseBall.getArea());

        Rectangle rectangle = new Rectangle(20,30);
        rectangle.width=30;
        rectangle.height=20;
        System.out.println(rectangle.getArea());

        // Rectangle class 정의해보기...
        // int width, int height
        // getArea()

        Book chunhang = new Book("춘향전");
        System.out.println(chunhang.title+"=="+chunhang.author);
        Book hong = new Book("홍길동전","허균");
        System.out.println(hong.title+"=="+hong.author);

        Book littlePrince = chunhang;
        littlePrince.author = "생떽쥐 베리";
        System.out.println(littlePrince.title);
        System.out.println(littlePrince.author);
        System.out.println(chunhang.author);

        Circle arr[] =  new Circle[3];
        String nameList[] = {"농구공","배구공","야구공"};
        for(int i=0;i<3;i++) {
            arr[i] = new Circle((int)(Math.random()*20+5),nameList[i]);
        }
        System.out.println(arr[0].name+"=="+arr[0].radius);
        System.out.println(arr[1].name+"=="+arr[1].radius);
        System.out.println(arr[2].name+"=="+arr[2].radius);
        // bookList 5개를 만들어서 제목과 저자를 입력받아 배열에 넣고
        // 제목과 저자를 출력하는 코드를 짜시오.
    }
}
