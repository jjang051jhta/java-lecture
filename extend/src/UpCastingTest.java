class Person {
    String name;
    String id;
    public Person(String name) {
        this.name = name;
    }
    public void eat(Snack snack) {
        snack.open();
    }
    public Person() {}
}
class Student extends Person {
    String grade;
    String department;
    public Student(String name) {
        super(name);
    }
}
class Animal {
    String hairColor;
    String leg;
}

class Snack {
    public void open() {
        System.out.println("과자 봉지를 뜯습니다.");
    }
}

class Oreo extends Snack {

}
class Sawooggang extends Snack {

}
class PotatoChip extends Snack {

}


public class UpCastingTest {
    public static void main(String[] args) {
        Student student = new Student("장성호");
        student.id="111";
        student.department="컴터";
        Person person = student; // upcasting
        Sawooggang sawooggang = new Sawooggang();
        Oreo oreo = new Oreo();
        PotatoChip potatoChip = new PotatoChip();
        Person person02 = new Person();
        Student student02 = (Student)person02;
        student02.grade="3";
        student02.department = "컴터";
    }
}
