package Comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float mark;

    public Student(int rollno, float mark) {
        this.rollno = rollno;
        this.mark = mark;
    }


    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.mark-o.mark);
        return diff;
    }
}
