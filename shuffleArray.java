import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class shuffleArray{
        public static String[] arrayShuffle(String[] n){
            List<String> strList = Arrays.asList(n);
            Collections.shuffle(strList);
            strList.toArray(n);
            String x = (Arrays.toString(n));
            x = x.substring(1, x.length() - 1);
            String[] arrOfX = x.split(", ");
            return arrOfX;
        }
        
    }






