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
        String schedule =
        "Teller1:" + teller1 + " 
        Teller2:"+ teller2 + " 
        altDualControl1:" + altDualControl1 + " 
        altDualControl2:" + altDualControl2 + "
        classPresentation1:" classPresentation1 + "
        classPresentation2:" + classPresentation2 + "
        custodial1:" + custodial1 + "
        custodial2:" + custodial2;
        return schedule;
    }
}
