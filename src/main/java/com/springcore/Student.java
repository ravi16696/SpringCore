package com.springcore;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentAddress;

    public Student() {
    }

    public Student(Integer studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        //System.out.println("setting student id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
