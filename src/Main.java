import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Prizes prizes = new Prizes();
        prizes.Put(new Toy(1, "Конструктор", 20));
        prizes.Put(new Toy(2, "Робот", 20));
        prizes.Put(new Toy(3, "Кукла", 60));
        prizes.Put(new Toy(4, "Кукла", 60));
        prizes.Put(new Toy(5, "Кукла", 60));
        prizes.Put(new Toy(6, "Робот", 20));
        prizes.Put(new Toy(7, "Конструктор", 20));
        prizes.Put(new Toy(8, "Робот", 20));
        prizes.Put(new Toy(9, "Робот", 20));
        prizes.Put(new Toy(10, "Робот", 20));

        try {
            FileWriter writer = new FileWriter("prizes.txt");
            for (int i = 0; i < 10; i++) {
                Toy toy = prizes.Get();
                writer.write(toy.getId() + " " + toy.getName() + " " + toy.getFrequency() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }
}