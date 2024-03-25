import java.util.*;

class Dictionary02 extends PairMap {
    int num;

    Dictionary02(int num) {
        this.num = num;
        keyArray = new String[num];
        valueArray = new String[num];
    }

    @Override
    String get(String key) {
        int index = Arrays.asList(keyArray).indexOf(key); // keyArray의 index값
        return valueArray[index];
    }

    @Override
    void put(String key, String value) {
        for (int i = 0; i < num; i++) {
            if (keyArray[i] == null) {
                keyArray[i] = key;
                valueArray[i] = value;
                break;
            } else if (keyArray[i].equals(key)) {
                valueArray[Arrays.asList(keyArray).indexOf(key)] = value;
                break;
            } else
                continue;
        }
    }

    @Override
    String delete(String key) {
        int index = Arrays.asList(keyArray).indexOf(key);
        valueArray[index] = null;
        return null;
    }

    @Override
    int length() {
        int storage = 0;
        for (int i = 0; i < num; i++) {
            if (valueArray[i] == null) {
                storage = i;
                break;
            } else if (i == num - 1) {
                storage = num;
            } else
                continue;
        }
        return storage;
    }
}

