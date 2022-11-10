package com.example.demo6;

public class school extends org{
    int no_of_student ;
    int tution_per_stu;
    school(String name, String id, int no_of_student, int tution_per_stu){
        super(name, id);
        this.no_of_student=no_of_student;
        this.tution_per_stu=tution_per_stu;
    }
    @Override
    int calc_income() {
        return no_of_student*tution_per_stu;
    }
}
