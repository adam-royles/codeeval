import java.io.IOException;

public class PrimePallindromes {

    public static void main(String[] args) throws IOException {
        int max =0;
        int i,j,k;
        for(i=1; i<1000; i++){

            k=0;
            for(j=2; j<i; j++){

                if(i%j==0){

                    k=1;
                    break;
                }
            }if(k==0){
                String right = Integer.toString(i);
                String reverse = new StringBuilder(right).reverse().toString();
                if(right.equals(reverse))
                 if(i>max){
                    max = i;
                 }
            }
        }
        System.out.print(max+"\n");


    }

}
