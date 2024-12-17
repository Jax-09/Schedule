import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String[] earlyArr = {"Ava", "Ayla", "Carol", "Chloe", "Clella", "Georgia", "Harlow" , "Remy" };
        String[] lateArr ={"Desmond", "Diana", "Ellyott", "Josh", "Kaiden", "McKenna", "Reece" };
        //early lunch students
        Student ava = new Student ("Ava", true, 1, 2, 3, 4, 5);
        Student ayla = new Student ("Ayla", true, 1, 2, 3, 4, 5);
        Student carol = new Student ("Carol", true, 1, 2, 3, 4, 5);
        Student chloe = new Student ("Chloe", true, 1, 2, 3, 4, 5);
        Student clella = new Student ("Clella", true, 1, 2, 3, 4, 5);
        Student georgia = new Student ("Georgia", true, 1, 2, 3, 4, 5);
        Student harlow = new Student ("Harlow", true, 1, 2, 3, 4, 5);
        Student remy = new Student ("Remy", true, 1, 2, 3, 4, 5);
        //late lunch students
        Student desmond = new Student ("Desmond", false, 1, 2, 3, 4, 5);
        Student diana = new Student ("Diana", false, 1, 2, 3, 4, 5);
        Student ellyott = new Student ("Ellyott", false, 1, 2, 3, 4, 5);
        Student josh = new Student ("Josh", false, 1, 2, 3, 4, 5);
        Student kaiden = new Student ("Kaiden", false, 1, 2, 3, 4, 5);
        Student mcKenna = new Student ("McKenna", false, 1, 2, 3, 4, 5);
        Student reece = new Student ("Reece", false, 1, 2, 3, 4, 5);

        System.out.println("Do you want a schedule? (answer with \"yes\" or \"no\")");
        Scanner obl = new Scanner(System.in);
        String yn = obj.nextLine();
        if(yn.equals("y") || yn.equals("yes") || yn.equals("Yes") || yn.equals("Y")){
            String el = "a";
            Scanner obj = null;
            boolean isEarly = true;
            String[] arrOfChoice = earlyArr;
            while(!(el.equals("Early") || el.equals("early") || el.equals("Late") || el.equals("late"))){
                System.out.println("Do you want a early or late schedule? (answer with \"Early\" or \"Late\")");
                obj = new Scanner(System.in);
                el = obj.nextLine();
                if (el.equals("Early") || el.equals("early")){}
                else if (el.equals("Late") || el.equals("late")){
                    isEarly=false;
                    arrOfChoice = lateArr;
                }
            }
            
            int w = 0;
            while( !(w ==1 || w==2 || w==3 || w==4 || w==5)){
                System.out.println("What week is your schedule? (answer with \"1\", \"2\", \"3\", \"4\", or \"5\")");
                Scanner obi = new Scanner(System.in);
                String week = obj.nextLine();
                try {
                    w = Integer.parseInt(week);
                }
                catch (NumberFormatException e) {
                    w = 0;
                }
            }
                System.out.println(schedule.makeScheduleWeek(arrOfChoice, w, isEarly));
            }
        else{
            
        }
    }
}