package Учебная.Сериализация;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {

        Person person1 = new Person(1,"Bob");
//        Person person2 = new Person(2,"Mike");
        //Person[] people = {new Person(1,"Bob"),                 ----для
                //new Person(2,"Mike"), new Person(3,"Tom")};     массива---


        try (ObjectOutputStream oos = new ObjectOutputStream((new FileOutputStream("people.bin")))) {
            //FileOutputStream fos = new FileOutputStream("people.bin");    ---для
            //ObjectOutputStream oos = new ObjectOutputStream(fos);         массива---

            oos.writeObject(person1);
//            oos.writeObject(person1);
//            oos.writeObject(person2);

            //fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
