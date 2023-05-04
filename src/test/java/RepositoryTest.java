import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Animals Farm", 192, "George Orwell");
        Book book2 = new Book(2, "The Green Mile", 543, "Stephen King");
        Book book3 = new Book(3, "Walden", 381, "Henry David");
        Book book4 = new Book(4, "Pride and Prejudice", 451, "Jane Austen");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);

        Product[] expected = {book1, book2, book3, book4};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    public void testAddSmart() {
        Repository repo = new Repository();

        Smartphone smartphone1 = new Smartphone(22, "Note 10 plus", 500, "Samsung");
        Smartphone smartphone2 = new Smartphone(33, "14 pro max", 800, "Iphone");
        Smartphone smartphone3 = new Smartphone(44, "Redmi 9A", 300, "Xiaomi");


        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);


        Product[] expected = {smartphone1, smartphone2, smartphone3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdBook() {
        Repository repo = new Repository();

        Book book1 = new Book(1, "Animals Farm", 192, "George Orwell");
        Book book2 = new Book(2, "The Green Mile", 543, "Stephen King");
        Book book3 = new Book(3, "Walden", 381, "Henry David");
        Book book4 = new Book(4, "Pride and Prejudice", 451, "Jane Austen");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(book4);

        Product[] expected = {book1, book2, book4};
        Product[] actual = repo.removeById(3);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveByIdSmart() {
        Repository repo = new Repository();

        Smartphone smartphone1 = new Smartphone(22, "Note 10 plus", 500, "Samsung");
        Smartphone smartphone2 = new Smartphone(33, "14 pro max", 800, "Iphone");
        Smartphone smartphone3 = new Smartphone(44, "Redmi 9A", 300, "Xiaomi");


        repo.add(smartphone1);
        repo.add(smartphone2);
        repo.add(smartphone3);


        Product[] expected = {smartphone2, smartphone3};
        Product[] actual = repo.removeById(22);
        Assertions.assertArrayEquals(expected, actual);

    }


}














































































































































































































































































































































































