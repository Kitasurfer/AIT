package lesson_07;/* AIT Groupe: 52-1
Author: Bogdan Fesenko
Date: 18-09-2024
*/

public class str {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("java");
        str4 = "java";
        System.out.println("CASE ==");
        if (str1 == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("Case equals");
        if (str1.equals(str2)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
        System.out.println("case 3 ==");
        if (str1 == str3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println("case equals 3");
        if (str1.equals(str3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
