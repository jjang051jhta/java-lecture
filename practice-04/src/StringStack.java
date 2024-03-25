public class StringStack implements Stack {

    public String element[];

    //element[5]
    private int num;

    public StringStack(int capacity) {
        element = new String[capacity];
        num = -1;
    }

    @Override
    public int length() {
        return num+1;
    }

    @Override
    public int capacity() {
        return element.length;
    }

    @Override
    public String pop() {
        if(num == -1) {
            return null;
        }
        String str = element[num];
        num--;
        return str;

    }
    @Override
    public boolean push(String val) {
        if(num == element.length - 1){
            return false;
        } else {
            num++;
            element[num] = val;
            return true;
        }
    }
}
