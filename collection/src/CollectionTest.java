import java.util.*;

class User {
    int id;
    int age;
    String name;
    public User(String name,int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

public class CollectionTest {
    public static  void show(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"\t");
        }
    }
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike",1,20));
        userList.add(new User("Mike",2,50));
        userList.add(new User("Mike",3,30));
        userList.add(new User("Demian",4,45));
        userList.add(new User("Alice",5,17));
        //객체는 정렬 안됨
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {



                //return o1.name - o2.name;
                //return o1.name.compareTo(o2.name);
                if(o1.name.compareTo(o2.name) > 0) {
                    return 1;
                } else if(o1.name.compareTo(o2.name) < 0) {
                    return -1;
                }
                return o1.age - o2.age;

            }
        });
        for(User user : userList) {
            System.out.println(user.name+"==="+user.id+"==="+user.age);
        }
//        List<String> movieList = new ArrayList<>();
//        movieList.add("아이언맨");
//        movieList.add("파묘");
//        movieList.add("댓글부대");
//        movieList.add("범죄도시");
//        show(movieList);
//        System.out.println();
//        Collections.sort(movieList);
//        show(movieList);
//        System.out.println();
//        Collections.sort(movieList,Collections.reverseOrder());
//        show(movieList);

    }
}
