package i7b1s4.tim.Services;

import i7b1s4.tim.Data.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
