package Очередь;

public class QueueTest {
    public static void main(String[] arg) {
        ObjectQueue queue = new ObjectQueue();

        for(int i=0; i<11; i++) {
            // В данном случае мы складываем в очередь строки
            queue.push("Данные №: " + i);
        }

        while(queue.size() > 0) {
            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки

            for(int i=0; i<queue.size(); i++){
                System.out.println(queue.get(i));
            }
            String s = (String)queue.pull();
            System.out.println("\n"+s);
            System.out.println("Размер очереди:" + queue.size());
        }
    }
}
