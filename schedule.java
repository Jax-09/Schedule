public class schedule {
    static String teller1 = null;
    static String teller2 = null;
    static String altDualControl1 = null;
    static String altDualControl2 = null;
    static String classPresentation1 = null;
    static String classPresentation2 = null;
    static String custodial1 = null;
    static String custodial2 = null;
    static String newLine = System.getProperty("line.separator");
    public static String makeScheduleDay(String[] j, int w, int d){
        if ((w % 2 != 0)&&(d % 2 != 0)){
            teller1 = j[0];
            teller2 = j[1];
            altDualControl1 = j[2];
            altDualControl2 = j[3];
            classPresentation1 = j[4];
            classPresentation2 = j[5];
            custodial1 = j[6];
            if (j.length==8){
                custodial2 = j[7];
            }
        }
        else if ((w % 2 != 0) && (d % 2 == 0)){
            teller1 = j[2];
            teller2 = j[3];
            altDualControl1 = j[0];
            altDualControl2 = j[1];
            if (j.length==8){
                classPresentation1 = j[6];
                classPresentation2 = j[7];
                custodial1 = j[4];
                custodial2 = j[5];
            }
            else{
            classPresentation1 = j[6];
            classPresentation2 = j[5];
            custodial1 = j[4];
            }
        }
        else if ((w % 2 == 0) && (d % 2 != 0)){
            classPresentation1 = j[0];
            classPresentation2 = j[1];
            custodial1 = j[2];
            custodial2 = j[3];
            teller1 = j[4];
            teller2 = j[5];
            altDualControl1 = j[6];
            if (j.length==8){
                altDualControl2 = j[7];
            }
        }
        else if ((w % 2 == 0) && (d % 2 == 0)){
            teller1 = j[2];
            teller2 = j[3];
            altDualControl1 = j[0];
            altDualControl2 = j[1];
            if (j.length==8){
                classPresentation1 = j[6];
                classPresentation2 = j[7];
                custodial1 = j[4];
                custodial2 = j[5];
            }
            else{
            classPresentation1 = j[6];
            classPresentation2 = j[5];
            custodial1 = j[4];
            }
        }
        //return suff
        
        if (j.length==8){
            return teller1 + " " + teller2 + " " + altDualControl1 + " " + altDualControl2 + " " + classPresentation1 + " " + classPresentation2 + " " + custodial1 + " " + custodial2;
        }
        else if (j.length==7){
            return teller1 + " " + teller2 + " " + altDualControl1 + " " + altDualControl2 + " " + classPresentation1 + " " + classPresentation2 + " " + custodial1;
        }
        else{
            return null;
        }
    }
    public static String makeScheduleWeek(String[] j, int w, boolean e){       
        String custodialO2= null;
        String custodialE2 = null;
        String[] dayEven = (schedule.makeScheduleDay(j, w, 1)).split(" ");
            String tellerE1 = dayEven[0];
            String tellerE2 = dayEven[1];
            String altDualControlE1 = dayEven[2];
            String altDualControlE2 = dayEven[3];
            String classPresentationE1 = dayEven[4];
            String classPresentationE2 = dayEven[5];
            String custodialE1 = dayEven[6];
            if (j.length == 8){
                custodialE2 = dayEven[7];
            }
        String[] dayOdd = (schedule.makeScheduleDay(j, w, 2)).split(" ");
            String tellerO1 = dayOdd[0];
            String tellerO2 = dayOdd[1];
            String altDualControlO1 = dayOdd[2];
            String altDualControlO2 = dayOdd[3];
            String classPresentationO1 = dayOdd[4];
            String classPresentationO2 = dayOdd[5];
            String custodialO1 = dayOdd[6];
            if (j.length == 8){
                custodialO2 = dayOdd[7];
            }
        if (j.length == 8){
            if(e){
            return
                "                       Monday   |   Tuesday   |  Wednesday  |    Thursday  |    Friday  " + newLine +
                "                    11:00-11:55 | 11:15-12:05 | 11:30-12:15 |  11:15-12:05 | 11:00-11:55" + newLine +
                "Teller: " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + newLine +
                "Alternate / Dual Control: " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + newLine +
                "Class Presentation: " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + newLine +
                "Custodial: " + custodialE1 + ", " + custodialE2 + "  |  " + custodialO1 + ", " + custodialO2 + "  |  " + custodialE1 + ", " + custodialE2 + "  |  " + custodialO1 + ", " + custodialO2 + "  |  " + custodialE1 + ", " + custodialE2 + "  |  " + newLine +
                "IQ Open Early Lunch 11:05-12:25 | 12:05-12:30 | 12:15-12:40 | 12:05-12:30 | 11:05-12:25";
            }
            else if (!e){
                return
                    "                      Monday   |   Tuesday   |  Wednesday  |    Thursday  |    Friday  " + newLine +
                    "                   11:30-11:25 | 11:45-12:35 | 12:00-12:45 |  11:45-12:35 | 11:30-11:25" + newLine +
                    "Teller: " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + newLine +
                    "Alternate / Dual Control: " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + newLine +
                    "Class Presentation: " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + newLine +
                    "Custodial: " + custodialE1 + ", " + custodialE2 + "  |  " + custodialO1 + ", " + custodialO2 + "  |  " + custodialE1 + ", " + custodialE2 + "  |  " + custodialO1 + ", " + custodialO2 + "  |  " + custodialE1 + ", " + custodialE2 + "  |  " + newLine +
                    "IQ Open Late Lunch 11:55-12:20 | 12:05-12:30 | 12:15-12:40 | 12:05-12:30 | 11:55-12:20";
            }
            else{
                return null;
            }
        }
        else if (j.length == 7){
            if(e){
                return
                    "                       Monday   |   Tuesday   |  Wednesday  |    Thursday  |    Friday  " + newLine +
                    "                    11:00-11:55 | 11:15-12:05 | 11:30-12:15 |  11:15-12:05 | 11:00-11:55" + newLine +
                    "Teller: " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + newLine +
                    "Alternate / Dual Control: " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + newLine +
                    "Class Presentation: " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + newLine +
                    "Custodial: " + custodialE1 +  "  |  " + custodialO1 + "  |  " + custodialE1 + "  |  " + custodialO1 + "  |  " + custodialE1 + "  |  " + newLine +                   
                    "IQ Open Early Lunch 11:05-12:25 | 12:05-12:30 | 12:15-12:40 | 12:05-12:30 | 11:05-12:25";
            }
            else if (!e){
                return
                    "                      Monday   |   Tuesday   |  Wednesday  |    Thursday  |    Friday  " + newLine +
                    "                   11:30-11:25 | 11:45-12:35 | 12:00-12:45 |  11:45-12:35 | 11:30-11:25" + newLine +
                    "Teller: " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + tellerO1 + ", " + tellerO2 + "  |  " + tellerE1 + ", " + tellerE2 + "  |  " + newLine +
                    "Alternate / Dual Control: " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + altDualControlO1 + ", " + altDualControlO2 + "  |  " + altDualControlE1 + ", " + altDualControlE2 + "  |  " + newLine +
                    "Class Presentation: " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + classPresentationO1 + ", " + classPresentationO2 + "  |  " + classPresentationE1 + ", " + classPresentationE2 + "  |  " + newLine +
                    "Custodial: " + custodialE1 +  "  |  " + custodialO1 + "  |  " + custodialE1 + "  |  " + custodialO1 + "  |  " + custodialE1 + "  |  " + newLine +                   
                    "IQ Open Late Lunch 11:55-12:20 | 12:05-12:30 | 12:15-12:40 | 12:05-12:30 | 11:55-12:20";
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }
} 

