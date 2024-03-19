public class AssignmentOperator {
    public static void main(String[] args) {
        int a=3,b=3,c=3;
        a += 3; //6
        b *= 3; //9
        c %= 2; //1

        a += 1;
        a++;
        int d = 3;
        a = d++;
        System.out.println("a=="+a+",d=="+d);
        a = ++d;
        System.out.println("a=="+a+",d=="+d);
    }
}
