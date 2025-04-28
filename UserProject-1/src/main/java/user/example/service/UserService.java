package user.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import user.example.entity.User;

@Service
public class UserService {

	

    List<User> list = List.of(
            new User(1311L, "Durgesh Tiwari", "2"),
            new User(1312L, "Ankit Tiwari", "3"),
            new User(1314L, "Ravi Tiwari", "4")
    );

   
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
	
}
