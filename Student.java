public class Student {
    Private String name = "";
    Private int teller1 = 0;
    Private int teller2 = 0;
    Private int altDualControl = 0;
    Private int classPresentation = 0;
    Private int custodial = 0;
    //student class
    Public Student(String name, int teller1, int teller2, int altDualControl, int classPresentation, int custodial){
        this.name = name;
        this.teller1 = teller1;
        this.teller2 = teller2;
        this.altDualControl = altDualControl;
        this.classPresentation = classPresentation;
        this.custodial = custodial;
    }
    //Getters for each variable
    public String getStudentName(){
        return name;
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
}