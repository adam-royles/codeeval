//Sample code to read in test cases:
import java.io.*;
import java.util.*;


import static java.lang.System.in;

public class FizzBuzz {


    public static void main(String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        try{
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String string = line;
            String[] bits = string.split("\\s");
            String X = bits[0];
            String Y = bits[1];
            String Z = bits[2];

            int x = Integer.parseInt(X);
            int y = Integer.parseInt(Y);
            int z = Integer.parseInt(Z);
            int i;
            String fizzbuzz = "FB";
            String fizz= "F";
            String buzz = "B";
            StringBuilder container = new StringBuilder();
            for (i = 1; i <= z; i++) {

                if (i % x == 0 && i % y == 0) {
                    container.append(fizzbuzz);
                    container.append(" ");
                } else if (i % x == 0 && i % y != 0) {
                    container.append(fizz);
                    container.append(" ");
                } else if (i % x != 0 && i % y == 0) {
                    container.append(buzz);
                    container.append(" ");
                } else {
                    container.append(i);
                    container.append(" ");
                }

            }
            String finished = container.toString();
            System.out.print(finished.trim());
            System.out.print("\n");
        }
    }catch(ArrayIndexOutOfBoundsException e){}
    }
}








