package ua.javarush.module2.lesson17.example7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Example7 {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepositoryImpl();
        System.out.println(userRepository.findById(1).get());
        System.out.println("===========================================");
        StaticProxyUserRepositoryTiming staticProxyUserRepositoryTiming =
                new StaticProxyUserRepositoryTiming();

        System.out.println(staticProxyUserRepositoryTiming.findById(1).get());

        System.out.println("===========================================");

        UserRepository proxyInstance =(UserRepository) Proxy.newProxyInstance(
                UserRepositoryImpl.class.getClassLoader(),
                UserRepositoryImpl.class.getInterfaces(),
                new TimeHandler(userRepository));

        System.out.println(proxyInstance.findById(1).get());
    }
}

// new Class<?>[]{UserRepository.class}
interface UserRepository {
    Optional<User> findById(Integer id);
}

class UserRepositoryImpl implements UserRepository {

    private static final Map<Integer, User> ID_TO_USER = new HashMap<>();

    static {
        ID_TO_USER.put(1, new User(1, "Alex1"));
        ID_TO_USER.put(2, new User(2, "Alex2"));
        ID_TO_USER.put(3, new User(3, "Alex3"));
    }

    @Override
    public Optional<User> findById(Integer id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(ID_TO_USER.get(id));
    }
}

class User {
    private final Integer id;
    private final String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class StaticProxyUserRepositoryTiming implements UserRepository {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public Optional<User> findById(Integer id) {
        long startTime = System.currentTimeMillis();
        Optional<User> result = userRepository.findById(id);
        long endTime = System.currentTimeMillis();

        System.out.println("findById takes: " + (endTime - startTime) + "ms");
        return result;
    }
}

class TimeHandler implements InvocationHandler {

    private final Object instance;

    public TimeHandler(Object instance) {
        this.instance = instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(instance, args);
        long endTime = System.currentTimeMillis();

        System.out.println(String.format("It takes %d to invoke method %s", (endTime - startTime), method.getName()));

        return result;
    }
}
