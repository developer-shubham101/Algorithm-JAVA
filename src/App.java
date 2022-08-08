import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        StringOperation algo = new StringOperation();
//        algo.performOperation();


        /*Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d = scan.nextDouble();
        String s = scan.nextLine();
        s += scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scanner.close();*/

        /*int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        boolean isEven = N % 2 == 0;
        if (isEven && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (isEven && N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (isEven && N >= 20) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Weird");
        }

        scanner.close();*/


        /*int i = 0x01;
        byte b = (byte) i;
        System.out.println(b); // -22
        int i2 = 0xFF;
        System.out.println(i2); // 234*/


        ByteBuffer bb = ByteBuffer.allocate(4);

        bb.putInt(2342);

        byte[] arr = bb.array();
        ArrayList<Integer> convertedString = toHexadecimal(arr);

        System.out.println(convertedString.get(0).byteValue());
    }


    /* this method use for  byte array to Hexadecimal for write calibrate */
    public static ArrayList<Integer> toHexadecimal(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();

        for (byte i : bytes) {
            String hex = Integer.toHexString((int) i & 0xFF);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex).append(" ");

        }
        hexString.substring(0, hexString.length() - 1);


        ArrayList<Integer> stringBuilder2 = new ArrayList<>();
        String[] vv1 = hexString.toString().split(" ");
        for (int i = vv1.length - 1; i >= 0; i--) {
            System.out.println("@@dd" + "ByteArrayToHexString: " + vv1[i]);
            stringBuilder2.add(Integer.parseInt(vv1[i]));
        }

        System.out.println("@@@reversd --" + stringBuilder2 + "");

        System.out.println("@@@toHexadecimal --" + hexString + "");

        return stringBuilder2;
    }
}
