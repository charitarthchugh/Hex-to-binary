import java.util.Scanner;

public class Main {

    private static String output1 = "";

    public static void main(String[] args) {
        //Hard coding each value in binary
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the the hex value:");
        String hexvalue = scan.next();
        hexvalue = hexvalue.toUpperCase();
        voidcheck(hexvalue);
        System.out.println("The original hex value was: " + hexvalue);
        System.out.println("The binary value is: " + convert(hexvalue));
        System.exit(0);

    }

    public static void voidcheck(String input) {
        char[] alphabet = "GHIJKLMNOPQRSTUVXYZ!@#$%^&*()~{}|:<>?[];',. ".toCharArray();
        String[] voidarray = new String[]{String.copyValueOf(alphabet)};
        int length = voidarray.length;
        for (int i = 0; i < length; i++) {
            if (input.contains(voidarray[i])) {
                System.out.println("Contains invalid characters");
                System.exit(0);
            }
        }
    }

    public static String convert(String hexval) {
        String[] hexvsluesarray = new String[]{"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
        char[] hexchar = hexval.toCharArray();
        for (int i = 1; i <= hexchar.length; i++) {
            if (hexchar[i] == '0') {
                 output1 = output1 + hexvsluesarray[0];
            } else if (hexchar[i] == '1') {
                 output1 = output1 + hexvsluesarray[1];
            } else if (hexchar[i] == '2') {
                 output1 = output1 + hexvsluesarray[2];
            } else if (hexchar[i] == '3') {
                 output1 = output1 + hexvsluesarray[3];
            } else if (hexchar[i] == '4') {
                 output1 = output1 + hexvsluesarray[4];
            } else if (hexchar[i] == '5') {
                 output1 = output1 + hexvsluesarray[5];
            } else if (hexchar[i] == '6') {
                 output1 = output1 + hexvsluesarray[6];
            } else if (hexchar[i] == '7') {
                 output1 = output1 + hexvsluesarray[7];
            } else if (hexchar[i] == '8') {
                 output1 = output1 + hexvsluesarray[8];
            } else if (hexchar[i] == '9') {
                 output1 = output1 + hexvsluesarray[9];
            } else if (hexchar[i] == 'A') {
                 output1 = output1 + hexvsluesarray[10];
            } else if (hexchar[i] == 'B') {
                 output1 = output1 + hexvsluesarray[11];
            } else if (hexchar[i] == 'C') {
                 output1 = output1 + hexvsluesarray[12];
            } else if (hexchar[i] == 'D') {
                 output1 = output1 + hexvsluesarray[13];
            } else if (hexchar[i] == 'E') {
                 output1 = output1 + hexvsluesarray[14];
            } else if (hexchar[i] == 'F') {
                 output1 = output1 + hexvsluesarray[15];
            } else {
                output1 = "Invalid characters found.Terminating program.";

            }
        }

     return output1;
    }

}
