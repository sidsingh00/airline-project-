package OASISinfobyte;

// NUMBER  GUESSING   GAME


import java.util.Scanner;

public class task2 {

    void game1() {
        System.out.println("Start the game");
        System.out.println("Choose the number between 1 to 100");
        System.out.println("you have to 4 round");
        System.out.println("select the number");

    }

    void game2() {

        int e;
        int round = 0;

        while (round < 4) {
            int s = (int) (Math.random() * 101);
            int sum = (4 - round);
            int score = (100 - 25 * round);
            Scanner scl = new Scanner(System.in);

            e = scl.nextInt();
            System.out.println("");
            System.out.println("select the number");

            round++;

            if (s == e) {
                System.out.println("Congratulations You Finally Got The Real Value");
                break;
            } else if (round == 4) {
                System.out.println("BAD LUCK ");
                System.out.println("YOU DIDN'T ABOUT TO FIND THE VALUE JUST START THE GAME AGAIN ");
                System.out.println("TRY HARD ");

            }

            else if (round == 4) {
                System.out.println(" TOTAL SCORE " + " " + score + " ");
            }

            else if (s > e) {

                System.out.println("Your value is smaller" + " " + s + " " + " try you best you dont have many round");
                System.out.println(" " + "You round left" + " " + (4 - round));
            } else if (s < 44 && e > 90) {
                System.out.println("Your value is high" + " " + s + " " + " try you best you dont have many round");
                System.out.println(" " + "You round left" + " " + (4 - round));
            }

            else if (s > 90 && e < 44) {
                System.out.println("Your value is smaller" + " " + s + " " + " try you best you dont have many round");
                System.out.println(" " + "You round left" + " " + (4 - round));
            }

            else if (e > 100) {
                System.out.println("We can't take your value " + " " + e + " " + (0) + " Round Left ");
                System.out.println("GAME OVER " + " " + " YOU LOSS");
                break;
            }

            else {
                System.out.println("Your value is high" + " " + s + " " + " try you best you dont have many round");
                System.out.println(" " + "You round left" + " " + (4 - round));
            }

        }
    }

    public static void main(String[] args) {
        task2 c = new task2();
        c.game1();
        c.game2();

    }
}
