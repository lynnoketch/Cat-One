package com.example.demo.Models;



import javax.persistence.*;

    @Entity
    @Table(name = "students")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        @Column(name = "student_number")
        private String studentNumber;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "score")
        private int score = 0;


        public Student(String studentNumber, String firstName) {
            this.studentNumber = studentNumber;
            this.firstName = firstName;
        }

        private Student(){

        }

        public String getStudentNumber() {
            return studentNumber;
        }

        public void setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", studentNumber='" + studentNumber + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
