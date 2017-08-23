import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSentences {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
            final String welcome = line;
            final List< String > words = Arrays.asList( welcome.split( "\\s" ));
            Collections.reverse( words );
            final String rev = words.stream().collect( Collectors.joining( " " ));
            System.out.println(rev);
        }
    }
}
