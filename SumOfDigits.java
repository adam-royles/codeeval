
import java.io.IOException;
import java.io.*;
public class SumOfDigits {

    public static void main (String[] args) throws IOException {

        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            String string = line;

            int rawData = Integer.parseInt(line);
            int l = String.valueOf(rawData).length();
            int total=0;
            int[] n = new int[l];
            String[] bits = string.split("");

            for (int x =0; x<l; ++x){

                n[x] =Integer.parseInt(bits[x]);
                total +=n[x];
            }

            System.out.println(total);
        }
    }
}



