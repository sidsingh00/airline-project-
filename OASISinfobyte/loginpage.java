package OASISinfobyte;

//  package OASISinfobyte;

import OASISinfobyte.timersubmit;
import OASISinfobyte.logout;
import java.util.Timer;
import java.util.*;
import java.util.function.Function;

public class loginpage {

    int a, b;
    String id, name, d, pass, e;
    String gmail = "@gmail.com";

    boolean exam = true, c;

    // MAKING THE USER ID AND MODIFIED PASSWORD
    /*
     * there you can enter your name password and for the safety perpose your
     * password will be modifide and will convert into interger
     */
    void login() {
        if (exam == true) {
            System.out.println("WELCOME IN ONLINE EXAMINATION");
            System.out.println(" ");
            System.out.print("ENTER YOUR EXAMINATION ID :");
        }
        Scanner sr = new Scanner(System.in);

        id = sr.nextLine();
        name = id;

        id = id.concat(gmail);
        int rand = (int) (Math.random());

        while (!exam == false) {

            System.out.println(" EXAMINATION ID :" + " " + id);

            System.out.print("ENTER YOUR PASSWORD :");
            pass = sr.nextLine();

            if (exam == true) {
                System.out.println(" HIDDEN PASSWORD:" + " " + rand);
                break;
            }

        }

        System.out.println("WELCOME" + " " + name + " your exam will start in 15 min");
        System.out.println(" ");
        System.out.println(" ");

        // HERE I JUST TRY TO CONVERT OR CHANGE THE PREVIOUS ID OR PASSWORD INTO NEW ONE
        // AND IT WILL CONTINUE WITH IT
        // THERE I JUST START THE CHANGING PASSWORD OR USER ID CODE

        System.out.println("IF YOUR HAVE TO CHANGE THE USER ID OR PASSWORD :");
        System.out.println("Type True" + " " + " Otherwise false");
        System.out.println(" ");

        c = sr.nextBoolean();

        if (c == true) {

            System.out.print("ENTER YOUR NEW EXAMINATION ID :");
            Scanner src = new Scanner(System.in);
            d = src.nextLine();
            d = d.concat(gmail);
            int rand2 = (int) (Math.random() * 30);
            while (c == true) {

                System.out.println(" NEW EXAMINATION ID :" + " " + d);

                System.out.print("ENTER YOUR NEW PASSWORD :");
                pass = src.nextLine();

                if (c == true) {
                    System.out.println(" NEW HIDDEN PASSWORD:" + " " + rand2);
                    break;
                }

            }
        } else if (c != true) {
            System.out.println(" ");

        } else {
            System.out.println(" not valid");

        }

    }
}
// HERE THE EXAMINATION BEGIN
// HERE THE MCQ QUESTION'S START
// THE TIMER AND AUTO SUBMITION IS THERE AFTER THE COMMENT SECTION

class Time extends timersubmit {
    void t() {

    }

}

// HERE I JUST CREATE THE LOGOUT PAGE WHERE YOU CAN LOGOUT IN VERY PRETTY WAY !
class l extends logout {
    public static void main(String[] args) {
        loginpage lp = new loginpage();
        lp.login();
        Time t1 = new Time();
        t1.TS1();
        t1.TS2();
        t1.TS3();

        l l1 = new l();
        l1.lg();

    }
}
