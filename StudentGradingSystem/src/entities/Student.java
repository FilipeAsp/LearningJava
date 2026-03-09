package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double gradeFinal(){
        return grade1 + grade2+ grade3;
    }

    public double  missingPoint(){
        if(gradeFinal() < 60){
            return 60.0- gradeFinal();
        }else{
            return 0.0;
        }
    }

    public String toString(){
        if (gradeFinal()>60){
            return "Final grade: " + String.format("%.2f",gradeFinal()) + 
            "\nPass";
        }else{
            return "Final grade: " + String.format("%.2f",gradeFinal()) +
            "\nFailed\nMissing" + String.format("%.2f",missingPoint()) +
            " points";
        }
    }
}
