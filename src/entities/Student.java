package entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalGrade() {
        return (note1 + note2 + note3);
    }
    public String result() {
        if (finalGrade() >= 60) {
            return "Status = PASS";
        }
        else {
            double missing = (60 - finalGrade());
            return "Status = FAILED" + "\nMissing = " + missing + " Points";
        }
    }
    public String toString() {
        return "Name = " + name
                + "\nFinal Grade = " + String.format("%.2f%n", finalGrade())
                + result();
    }
}


