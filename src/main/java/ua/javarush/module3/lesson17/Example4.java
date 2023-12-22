package ua.javarush.module3.lesson17;

import java.util.Optional;

public class Example4 {
    public static void main(String[] args) {

    }
}

class Client {
}

class Account {

}

interface CrudRepository<E> {
    Optional<E> findById(Integer id);
}

abstract class AbstractCrudRepository<E> implements CrudRepository<E> {
    @Override
    public Optional<E> findById(Integer id) {
        openConnection();
        Optional<E> item = findItem(id);
        closeConnection();

        return item;
    }

    protected abstract Optional<E> findItem(Integer id);

    private void closeConnection() {
        //close connection
    }

    private void openConnection() {
        // open connection
    }
}

class ClientRepository extends AbstractCrudRepository<Client> implements CrudRepository<Client> {
    @Override
    protected Optional<Client> findItem(Integer id) {
        return Optional.empty();
    }
}

class AccountRepository extends AbstractCrudRepository<Account> implements CrudRepository<Account> {


    @Override
    protected Optional<Account> findItem(Integer id) {
        return Optional.empty();
    }
}
