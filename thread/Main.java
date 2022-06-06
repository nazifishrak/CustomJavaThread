package thread;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomThread thread1 = new CustomThread(
                "c1",
                0,
                500,
                true,
                1
        );
        CustomThread thread2 = new CustomThread(
                "c2",
                10,
                1000,
                true,
                2
        );
        CustomThread thread3 = new CustomThread(
                "c3",
                0,
                2000,
                true,
                10
        );

        thread1.start();thread2.start();thread3.start();
        System.out.println("Please type the command");
        String commandstr = scanner.nextLine();
        while(!commandstr.equalsIgnoreCase("exit")) {
            if (commandstr.equals("1")){
                System.out.println("Counter in thread1 : "+ thread1.getCounter());
            }
            else if (commandstr.equals("2")) {
                System.out.println("Counter in thread2 : "+ thread2.getCounter());
            }
            else if (commandstr.equals("3")) {
                System.out.println("Counter in thread3 : "+ thread3.getCounter());
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

}
