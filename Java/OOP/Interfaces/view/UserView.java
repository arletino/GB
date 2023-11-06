package Java.OOP.Interfaces.view;

import java.util.List;

import Java.OOP.Interfaces.data.User;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> list);
    
}
