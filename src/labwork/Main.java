package labwork;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        LED[] ledArray=new LED[n];
        for (int i = 0; i < n; i++) {
            String colourName=scanner.next();
            boolean Working=scanner.nextBoolean();
            ledArray[i]=new LED(colourName, Working);

        }
        LEDStrip ledStrip =new LEDStrip(ledArray);
        System.out.println(ledStrip.stripStatus());
        scanner.close();




        }

    }

