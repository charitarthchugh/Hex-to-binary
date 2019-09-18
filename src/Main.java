import org.jetbrains.annotations.*;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        //Hard coding each value in binary
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the the hex value:");
        String hexvalue = scan.next();
        hexvalue = hexvalue.toUpperCase();
        System.out.println("The original hex value was: " + hexvalue);
        System.out.println("The binary value is "+ convert(hexvalue));
        System.exit(0);

    }

    public static void voidcheck(String input) {
        char[] alphabet = "GHIJKLMNOPQRSTUVXYZ!@#$%^&*()~{}|:<>?[];',. ".toCharArray();
        String[] voidarray = new String[]{String.copyValueOf(alphabet)};
        for (int i = 0; i < voidarray.length; i++) {
            if (input.contains(voidarray[i])) {
                System.exit(0);
            }
        }

    }

    @Contract(pure = true)//intellijj reccomendation
    public static String convert(@NotNull /*Intellij Recommendation*/ String hexval1) {
        String[] hexvaluesarray = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
        char[] hexchar= hexval1.toCharArray();
        String output1="";
        for (int i = 0; i < hexval1.length(); i++) {
            if (hexchar[i] == '0') {
                 output1 = output1 + hexvaluesarray[0];
            } else if (hexchar[i] == '1') {
                 output1 = output1 + hexvaluesarray[1];
            } else if (hexchar[i] == '2') {
                 output1 = output1 + hexvaluesarray[2];
            } else if (hexchar[i] == '3') {
                 output1 = output1 + hexvaluesarray[3];
            } else if (hexchar[i] == '4') {
                 output1 = output1 + hexvaluesarray[4];
            } else if (hexchar[i] == '5') {
                 output1 = output1 + hexvaluesarray[5];
            } else if (hexchar[i] == '6') {
                 output1 = output1 + hexvaluesarray[6];
            } else if (hexchar[i] == '7') {
                 output1 = output1 + hexvaluesarray[7];
            } else if (hexchar[i] == '8') {
                 output1 = output1 + hexvaluesarray[8];
            } else if (hexchar[i] == '9') {
                 output1 = output1 + hexvaluesarray[9];
            } else if (hexchar[i] == 'A') {
                 output1 = output1 + hexvaluesarray[10];
            } else if (hexchar[i] == 'B') {
                 output1 = output1 + hexvaluesarray[11];
            } else if (hexchar[i] == 'C') {
                 output1 = output1 + hexvaluesarray[12];
            } else if (hexchar[i] == 'D') {
                 output1 = output1 + hexvaluesarray[13];
            } else if (hexchar[i] == 'E') {
                 output1 = output1 + hexvaluesarray[14];
            } else if (hexchar[i] == 'F') {
                 output1 = output1 + hexvaluesarray[15];
            } else {
                output1 = "Invalid characters found.Terminating program.";

            }
        }

     return output1;
    }

}
