import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>();
        String animals [] = {"dog","cat","panda","tiger"};
        List<String> animalList = new ArrayList<>(Arrays.asList(animals));
        //animalList.clear();
        //System.out.println(animalList.get(0));
        for(int i=0;i<animalList.size();i++){
            System.out.print(animalList.get(i)+"\t");
        }
        System.out.println();
        for(String animal : animalList){
            System.out.print(animal+"\t");
        }
        System.out.println();
        //iterable
        Iterator<String> iterator = animalList.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+"\t");
        }
        System.out.println();
//        animalList.stream().forEach(aniaml -> {
//            System.out.print(aniaml+"\t");
//        });
        // 사람이름 네개 arrayList에 넣고 제일 긴 사람 출력하기....

        ArrayList<String> personList =
                new ArrayList<>(Arrays.asList("abc","abcdefg","aa","cccc"));
//        personList.add("jjang051");
//        personList.add("jjang051111");
//        personList.add("jjang0522222");
//        personList.add("jjang0533");
        System.out.println(personList.get(0));
        int longest = 0;
        for(int i=0;i<personList.size();i++) {
            if(personList.get(i).length()>personList.get(longest).length()) {
                longest = i;
            }
        }
        System.out.println(personList.get(longest));

        Iterator<String> iterator02 = personList.iterator();
        while(iterator02.hasNext()) {
            System.out.print(iterator02.next()+"\t");
        }
        //List  iteratro();
    }
}


