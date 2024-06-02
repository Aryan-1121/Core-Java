package com.string;

public class StringConcat {
    public static void main(String[] args) {

        String s1 = "hero";
        String s2 = "hero";
        String s3 = new String("hero");
        // the hashCode() method is designed to provide a hash code value for objects, and for String objects, it is computed based on the characters in the string. Two String objects with the same content will have the same hash code, even if they are different objects in memory.

        System.out.println(s1.hashCode()+"         "+ s2.hashCode()+"    "+s3.hashCode());

        System.out.println(s1.equals(s2));       // true
        System.out.println(s1==s2);                     //true
        System.out.println(s1==s3);                    // false (bcs s3 will refer to new obj at heap although there will be another obj created at string constant pool byt that will be unrefrenced )
        System.out.println("======");
        System.out.println(s1.equals(s3));     // true (equals method checks for content not reference )
                                                //The equals method in Java is used to compare two objects for equality. By default, the equals method in the Object class checks for reference equality, meaning it returns true if and only if both references point to the same object in memory. However, many classes, including String, override this method to provide a content-based equality check
        System.out.println(s2==s3);                   // false (== checks for reference not content)
        System.out.println(s2.equals(s3));    // true
    }
}
