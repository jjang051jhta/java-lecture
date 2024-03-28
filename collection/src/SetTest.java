import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("berry");
        set.add("apple");
        set.add("apple");
        set.add("apple");
        set.add("apple");
        set.add("apple");
        //set은 중복없음
        System.out.println(set.size());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //Set은 중복을 허용하지 않는다. 순서는 없다.
        //LinkedHashSet은 순서 보장해준다.
        String array[] = {"H","A","P","P","Y"};
        Set<String> set02 = new LinkedHashSet<>(Arrays.asList(array));
        Iterator<String> iterator02 = set02.iterator();
        while (iterator02.hasNext()) {
            System.out.println(iterator02.next());
        }
        String distinctArray[] =  set02.toArray(new String[0]);
        System.out.println(Arrays.toString(distinctArray));
    }
}
