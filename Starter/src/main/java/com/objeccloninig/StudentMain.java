package com.objeccloninig;

//no need to create object with new keyword => we can create new object with just reference clone() will take care of creting new obj
//use typeConversion in which you want to clone and call the clone method you wrote in that class asigning it to the new refernce variable in which you want to create a clone

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(2, "hero");
        Student s2 =(Student)student.clone();

        System.out.println(student);
        System.out.println(student.getRoll() +"   "+ student.getName());
        System.out.println(s2);
        System.out.println(s2.getRoll() +"   "+ s2.getName());
    }

}
