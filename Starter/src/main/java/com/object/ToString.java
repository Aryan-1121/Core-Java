package com.object;

public class ToString {
    public static void main(String[] args) {


        Test test = new Test(2,"heroo");

        Test test1 = new Test(2, "heroo");
        // internal representation of toString ->
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }

        System.out.println(test.hashCode() +" -> converting this hashcode to hexString to get default value which comes from toString = "+ Integer.toHexString(test.hashCode()));

        System.out.println(test1.hashCode());
        System.out.println(test);
        System.out.println(test1);









    }
}
