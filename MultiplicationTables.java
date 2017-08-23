
import java.io.IOException;
public class MultiplicationTables {

    public static void main(String[] args) throws IOException {

        int tableSize = 12;
        printMulitplicationTable(tableSize);

    }

    public static void printMulitplicationTable(int tableSize){

        System.out.format("    ");
        for(int i=1; i<=tableSize; i++){
            System.out.format("", i);

        }
        System.out.println();

        for(int i=1; i<=tableSize; i++){
            for(int j=1; j<=tableSize; j++ ){
                System.out.format("%4d", i*j);
            }
            System.out.println();

        }

    }
}

