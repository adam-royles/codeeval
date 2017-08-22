
import java.io.IOException;
import java.io.*;
public class ArmstrongNumbers {

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
                    int total = 0;
                    int multi= 0;
                    String[] bits = string.split("");
                    for (int x =0; x<l; ++x){

                        int n =Integer.parseInt(bits[x]);
                        multi = n;

                        for(int k=1; k<l-1; ++k){
                            multi = multi * n;
                        }
                        total += n*multi;
                    }

                    if(total == rawData){
                        System.out.print("True");
                    }else {
                        System.out.print("False");
                    }

                    System.out.print("\n");
                }
            }
        }




