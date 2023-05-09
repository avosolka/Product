import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Animals Farm", 192, "George Orwell");
        Book book2 = new Book(2, "The Green Mile", 543, "Stephen King");
        Book book3 = new Book(3, "Walden", 381, "Henry David");
        Book book4 = new Book(4, "Pride and Prejudice", 451, "Jane Austen");
        Book book5 = new Book(5,"Green book", 185, "J.White");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {book1, book2, book3, book4, book5};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchOneBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Animals Farm", 192, "George Orwell");
        Book book2 = new Book(2, "The Green Mile", 543, "Stephen King");
        Book book3 = new Book(3, "Walden", 381, "Henry David");
        Book book4 = new Book(4, "Pride and Prejudice", 451, "Jane Austen");
        Book book5 = new Book(5,"Green book", 185, "J.White");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Farm");
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testSearchTwoBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Animals Farm", 192, "George Orwell");
        Book book2 = new Book(2, "The Green Mile", 543, "Stephen King");
        Book book3 = new Book(3, "Walden", 381, "Henry David");
        Book book4 = new Book(4, "Pride and Prejudice", 451, "Jane Austen");
        Book book5 = new Book(5,"Green book", 185, "J.White");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {book2, book5};
        Product[] actual = manager.searchBy("Green");
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSearchNoOneBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "Animals Farm", 192, "George Orwell");
        Book book2 = new Book(2, "The Green Mile", 543, "Stephen King");
        Book book3 = new Book(3, "Walden", 381, "Henry David");
        Book book4 = new Book(4, "Pride and Prejudice", 451, "Jane Austen");
        Book book5 = new Book(5,"Green book", 185, "J.White");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Gomer");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSmart() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Smartphone smartphone1 = new Smartphone(22, "Note 10 plus", 500, "Samsung");
        Smartphone smartphone2 = new Smartphone(33, "14 pro max", 800, "Iphone");
        Smartphone smartphone3 = new Smartphone(44, "Redmi 9A", 300, "Xiaomi");
        Smartphone smartphone4 = new Smartphone(55, "Galaxy 10", 400, "Samsung");


        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);


        Product[] expected = {smartphone1, smartphone2, smartphone3, smartphone4};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchOneSmart() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Smartphone smartphone1 = new Smartphone(22, "Note 10 plus", 500, "Samsung");
        Smartphone smartphone2 = new Smartphone(33, "14 pro max", 800, "Iphone");
        Smartphone smartphone3 = new Smartphone(44, "Redmi 9A", 300, "Xiaomi");
        Smartphone smartphone4 = new Smartphone(55, "Galaxy 10", 400, "Samsung");


        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] expected = {smartphone3};
        Product[] actual = manager.searchBy("Redmi");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchTwoSmart() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Smartphone smartphone1 = new Smartphone(22, "Galaxy 22", 500, "Samsung");
        Smartphone smartphone2 = new Smartphone(33, "14 pro max", 800, "Iphone");
        Smartphone smartphone3 = new Smartphone(44, "Redmi 9A", 300, "Xiaomi");
        Smartphone smartphone4 = new Smartphone(55, "Galaxy 10", 400, "Samsung");


        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] expected = {smartphone1, smartphone4};
        Product[] actual = manager.searchBy("Galaxy");
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void testSearchNoOneSmart() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Smartphone smartphone1 = new Smartphone(22, "Note 10 plus", 500, "Samsung");
        Smartphone smartphone2 = new Smartphone(33, "14 pro max", 800, "Iphone");
        Smartphone smartphone3 = new Smartphone(44, "Redmi 9A", 300, "Xiaomi");
        Smartphone smartphone4 = new Smartphone(55, "Galaxy 10", 400, "Samsung");


        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);

        Product[] expected = {};
        Product[] actual = manager.searchBy("One");
        Assertions.assertArrayEquals(expected, actual);

    }

}
