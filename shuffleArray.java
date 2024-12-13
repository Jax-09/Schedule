import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class shuffleArray{
        public static String arrayShuffle(String[] n){
            List<String> strList = Arrays.asList(n);

            Collections.shuffle(strList);

            strList.toArray(n);

            return (Arrays.toString(n));
        }
        
    }






