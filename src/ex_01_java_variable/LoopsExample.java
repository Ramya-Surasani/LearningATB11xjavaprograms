package ex_01_java_variable;

public class LoopsExample {
    public static void main(String[] args){
        String age1= args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);
        int age=Integer.parseInt(age1);
        String result=(age<18)?"minor" : (age<65) ? "Adult": "senior";
        System.out.println(result);
    }
}
