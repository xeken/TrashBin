package kr.hs.dgsw.web0319;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> userList;

    public UserServiceImpl() {
        userList = new ArrayList<>();

        //User uSer = new User("user1", "user1@gmail.com");

        //uSer.setName("user no.1");
        //uSer.setEmail("user1@gmail.com");

        userList.add(new User("user1", "user1@gmail.com"));
        userList.add(new User("user2", "user2@gmail.com"));
        userList.add(new User("user3", "user3@gmail.com"));

    }

    @Override
    public List<User> list() {

        return this.userList;
    }

    @Override
    public User view(String name) {  //이 방법은 비교하는 값의 량이 많을땐 시스템이 멈춰 버린다.

        User found = null;
        //1번 for문을 사용하여 찾는다.
        for(int i = 0; i <this.userList.size(); i++){

            found = this.userList.get(i);

            if (found.getName().equals(name))
                return found;
                //break;
            //found = null;  // 찾고자하는 내용이 없을 떈 이렇게 해야 한다.
        }
        return null;
        //return found;
    }

    @Override
    public boolean add(User user) {

        return this.userList.add(user);
    }

    @Override
    public User update(User user) {

        User found = this.view(user.getName());

        if(found != null)
            found.setEmail(user.getEmail());

        return found;
    }

    @Override
    public Boolean delete(String name) {

        User found = this.view(name);

        return this.userList.remove(found);

    }

    // 밑에 건 오늘 사용안함 . 그냥 저런게 있다~ 좋은 방법들이다~


    public User find1(String name){  // 이 방법은 메모리는 더 많이 먹지만 시스템이 멈추지는 않는다.

        Iterator<User> userIterator = this.userList.iterator();
        while (userIterator.hasNext()){

            User user = userIterator.next();
            if(user.getName().equals(name))
                return user;
        }
        return null;
    }

    public User find2(String name){ // foreach문는 일반 for문보다 느리다. BUT 편하다.

        for(User user :this.userList){

            if(user.getName().equals(name))
                return user;
        }

        return null;
    }

    public User find3(String name){  //이 방법은 데이터에 병렬접근한다. 한번에 여러개 분석 , 그리하여 많이 빠르지만 메모리를 많이 먹는다.

       return this.userList.stream()
                .filter(user -> user.getName().equals(name))
                .findAny() //분석기 다 뿌려놓고 젤 먼저 발견한 놈
                //.findFirst() 줄 세워놓고 젤 먼저 발견한 놈
                .orElse(null); //발견 못 했을 때

    }
}


