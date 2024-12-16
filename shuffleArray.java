import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class shuffleArray{
        public static String[] arrayShuffle(String[] n){
            List<String> strList = Arrays.asList(n);

            Collections.shuffle(strList);

            strList.toArray(n);

            String x = (Arrays.toString(n));

            String[] arrOfX = x.split(", ");

            return arrOfX;
        }
        
    }






