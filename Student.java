public class Student {
    String name = "";
    boolean earlyLunch = true;
    int teller1 = 0;
    int teller2 = 0;
    int altDualControl = 0;
    int classPresentation = 0;
    int custodial = 0;
    
    //student class
    public Student(String string, boolean b, int i, int j, int k, int l, int m) {
        name = string;
        earlyLunch = b;
        teller1 = i;
        teller2 = j;
        altDualControl = k;
        classPresentation = l;
        custodial = m;
    }
    //Getters for each variable
    public String getName(){
        return name;
    }
    public String getLunchString(){
        if(earlyLunch==true){
            return "Early Lunch";
        }
        else{
            return "Late Lunch";
        }
    }
    public boolean getEarlyLunch(){
        return earlyLunch;
    }
    public int getTeller1Count(){
        return teller1;
    }
    public int getTeller2Count(){
        return teller2;
    }
    public int getAltDualControlCount(){
        return altDualControl;
    }
    public int getClassPresentationCount(){
        return classPresentation;
    }
    public int getCustodialCount(){
        return custodial;
    }

    //Setters
    /* 
    public void setStudantName(n){
        name=n;
    }
    public void setLunch(l){
        lunch=l;
    }
    public void setTeller1(o){
        teller1=o;
    }
    public void setTeller2(t){
        teller2=t;
    }
    public void setAltDualControl(a){
        altDualControl=a;
    }
    public void setClassPresentation(c){
        classPresentation=c;
    }
    public void setCustodial(u){
        custodial=u;
    } */
}




