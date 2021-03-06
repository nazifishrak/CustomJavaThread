package thread;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static CustomThread thread1 = new CustomThread(
            "c1",
            0,
            500,
            true,
            1
    );
    static CustomThread thread2 = new CustomThread(
            "c2",
            0,
            1000,
            true,
            2
    );
    static CustomThread thread3 = new CustomThread(
            "c3",
            0,
            2000,
            true,
            10
    );
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);



        thread1.start();thread2.start();thread3.start();
        System.out.println("Please type the command");
        String commandstr = scanner.nextLine();
        while(!commandstr.equalsIgnoreCase("exit")) {
            if (commandstr.equals("1")){
                System.out.println("Counter in thread1 : "+ thread1.getCounter());
                isAlive();

            }
            else if (commandstr.equals("2")) {
                System.out.println("Counter in thread2 : "+ thread2.getCounter());
                isAlive();
            }
            else if (commandstr.equals("3")) {
                System.out.println("Counter in thread3 : "+ thread3.getCounter());
                isAlive();
            }
            else if (commandstr.equalsIgnoreCase("1s")) {
                thread1.stopThread();
                System.out.println("Thread Stopped Successfully");
            }
            else if (commandstr.equalsIgnoreCase("2s")) {
                thread2.stopThread();
                System.out.println("Thread Stopped Successfully");
            }
            else if (commandstr.equalsIgnoreCase("3s")) {
                thread3.stopThread();
                System.out.println("Thread Stopped Successfully");
            } else {
                System.out.println("Invalid command");
            }
            commandstr = scanner.nextLine();
        }


    }
    public static void isAlive() {
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());
        System.out.println("Thread 3 is alive: " + thread3.isAlive());
    }

}
