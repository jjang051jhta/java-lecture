import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //Map key value
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple","사과");
        dictionary.put("banana","바나나");
        dictionary.put("strawberry","딸기");
        System.out.println(dictionary.get("apple"));
        System.out.println(dictionary.size());
        System.out.println(dictionary.containsKey("apple"));
        System.out.println(dictionary.containsValue("사과"));
        //dictionary.put("apple","부사");
        if(!dictionary.containsKey("apple")) {
            dictionary.put("apple","부사");
        }
        dictionary.putIfAbsent("apple","아오리");
        dictionary.putIfAbsent("cat","고양이");
        System.out.println(dictionary.get("apple"));
        System.out.println(dictionary.get("cat"));

        Set<String> keySet = dictionary.keySet(); //1 key 값 뽑기
        Iterator<String> iterator = keySet.iterator();  // key에서 순환자 만들기
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+"==="+dictionary.get(iterator.next()));
        }
        //foreach
        for(Map.Entry<String,String> entry:dictionary.entrySet()) {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        // key를 뽑아올 수 있다.
    }
}
