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

        // 학생 5명의 이름과 점수를 map에 저장하고
        // 각 학생의 이름과 점수를 뽑고 총점 및 평균을 구하시오.
        // key를 뽑아올 수 있다.

        Map<String,Integer> students = new HashMap<>();
        students.put("장성호",90);
        students.put("장동건",75);
        students.put("정형돈",87);
        students.put("정준하",92);
        students.put("노홍철",63);
        Set<String> keySet02 = students.keySet();
        Iterator<String> iterator02 = keySet02.iterator();
        int sum = 0;
        while(iterator02.hasNext()) {
            String name = iterator02.next();
            int score =  students.get(name);
            sum+=score;
            System.out.println(name+":"+score);
        }
        System.out.println("평균은 "+sum/students.size());
        //Student class id, tel을 속성으로 가진다.
        // map에 <String,Student>로  장성호, new Student(1,"111-1111")
        //5명을 map에 넣고
        // scanner를 통해 이름을 입력받아서 id와 전화번호를 출력하시오.
        // 이때 찾는 사람이 없으면 없는 사람이라고 출력하시오.
    }
}
