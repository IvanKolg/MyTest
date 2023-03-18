package Учебная.Сериализация;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            //FileInputStream fis = new FileInputStream("people.bin");   --для массива--
            //ObjectInputStream ois = new ObjectInputStream(fis);        --для массива--

            //Person[] people = (Person[]) ois.readObject();             --для массива--
            //System.out.println(Arrays.toString(people));               --для массива--
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);


//            Person person1 = (Person) ois.readObject();
//            Person person2 = (Person) ois.readObject();

//            System.out.println(person1);
//            System.out.println(person2);

            //ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
