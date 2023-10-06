package lesson27_multithreading.task1;

public class Main {
   public static void main(String[] args) {

      // Два способа создания отдельного потока:
       // 1. Наследование от класса Thread
       // 2. Реализация метода Runnable

      MyThread1 myThread1 = new MyThread1();
      MyThread2 myThread2 = new MyThread2();

      // Вызов метода run() не создаёт новый поток,
      // при этом метод run() отрабатывает точно так же,
      // как и любой другой вызванный метод в однопоточном реж
//      myThread1.run();
//      myThread2.run();

      // 1 способ: вызываем метод start() у нашего объкта
      myThread1.start();

      // 2 способ: создаём объект класса Thread, в конструктор
      // этого конструктора отправляем объект thread2, и у
      // объекта thread вызываем метод star()
      Thread thread = new Thread(myThread2);
      thread.start();

      for (int i = 0; i < 10; i++) {
         System.out.println("Главный поток: " + i);

         try {
            Thread.sleep(300);
         } catch (Exception e) {
            System.out.println("Ошибка!");
         }
      }
   }
}
