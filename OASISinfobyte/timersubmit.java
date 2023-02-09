package OASISinfobyte;

import java.util.Timer;
import java.util.TimerTask;
import java.net.Socket;
import java.util.Scanner;

// HERE THE EXAMINATION BEGIN
// HERE THE MCQ QUESTION'S START

public class timersubmit {

    void TS1() {
        System.out.println("YOU EXAM WILL START IN 5 SEC");
        System.out.println(" ");
        System.out.println("FOR EACH QUESTION YOU HAVE 10 SEC");
        System.out.println("START THE EXAMINATION  ");
        System.out.println("ALL THE BEST");

        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            int count = 4;

            @Override
            public void run() {

                // TODO Auto-generated method stub

            }

        };
        time.schedule(task, 10);

    }

    /**
     * 
     */
    void TS2() {

        int a, b;
        boolean bbb;

        Scanner srr = new Scanner(System.in);

        System.out.println("(Q1)   WHO IS THE FATHER OF JAVA?");

        System.out.println("(1)       Guido van Rossum");
        System.out.println("(2)       Bjarne Stroustrup");
        System.out.println("(3)       James Gosling OC");

        a = srr.nextInt();

        Timer timer = new Timer();
        TimerTask task2 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("(Q2)     Who give the physics equation E=MC^2?");
                System.out.println("(1)           Issac Newton ");
                System.out.println("(2)           Albert Einstein");
                System.out.println("(3)           Stephen Hawking");

            }

        };
        timer.schedule(task2, 10000);
        b = srr.nextInt();

    }

    void TS3() {

        Timer tim = new Timer();
        TimerTask task3 = new TimerTask() {

            @Override
            public void run() {

                // TODO Auto-generated method stub

                System.out.println("EXAM OVER");
                System.out.println("Exam successfully submitted ");
            }

        };
        tim.schedule(task3, 0);

    }

    public static void main(String[] args) {

        timersubmit tm = new timersubmit();
        tm.TS1();
        tm.TS2();
        tm.TS3();
    }

}
