class Add extends Calc {
    @Override
    public int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    @Override
    public int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    @Override
    public int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    @Override
    public int calculate() {
        return a / b;
    }
}

public class Calculator {
    public static void main(String[] args) {
        //이건 내일 하도록 하겠습니다.
    }
}


