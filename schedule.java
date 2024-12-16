public class schedule {
    public static String makeSchedule(String[] j){
        
        String[] randArr = {shuffleArray.arrayShuffle(j)};
       
        String teller1 = randArr[1];
        String teller2 = randArr[2];
        String altDualControl1 = randArr[3];
        String altDualControl2 = randArr[4];
        String classPresentation1 = randArr[5];
        String classPresentation2 = randArr[6];
        String custodial1 = randArr[7];
        String custodial2 = randArr[8];
        String newLine = System.getProperty("line.separator");
        String schedule =
            "Teller1: " + teller1 + newLine +
            "Teller2: "+ teller2 + newLine +
            "altDualControl1: " + altDualControl1 + newLine +
            "altDualControl2: " + altDualControl2 + newLine +
            "classPresentation1: " + classPresentation1 + newLine +
            "classPresentation2: " + classPresentation2 + newLine +
            "custodial1: " + custodial1 + newLine +
            "custodial2: " + custodial2;
        return schedule;
    }
}
