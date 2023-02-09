package OASISinfobyte;

import java.util.Scanner;

class logout {

    
    void lg() {
      

        try  {
            Scanner sn = new Scanner(System.in);
            
            int log;
            boolean bl = true;
            while (bl == true) {
                if (bl == true) {
                    System.out.println("If you can to logout from the examination page/ ID then:");
                    System.out.println(" type true otherwise false");
                    log = sn.nextInt();
                    System.out.println("ok");
                    break;

                } else {
                    log = sn.nextInt();
                    System.out.println("ok");
                    break;

                }
            }

        }catch(Exception e){
            System.out.println(" Successfully you are on the home page ");
           
        }
       
    };

    public static void main(String[] args) {
        logout lo = new logout();
        lo.lg();
    }

}
