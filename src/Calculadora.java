
public class Calculadora {
    Integer suma (Integer a, Integer b, Integer c) {
        return a + b + c;
    }
    Integer resta (Integer a, Integer b, Integer c) {
        return a - b - c;
    }
    Integer multiplicacion (Integer a, Integer b) {
        return a * b;
    }
    Integer division (Integer a, Integer b) {
        return a % b;
    }

    public static Integer factorial (Integer n){
        int i=1;
        int factorial =1;
        while (i<=n){
            factorial = factorial +1;
        }
        return factorial;
    }
    public static Integer mayor (Integer a, Integer b,Integer c) {
        Integer result = a;
        if (a>b && a>c){
            result = a;
        }else if (b>a && b>c){
            result = b;
        }else {
            result = c;
        }
        return result;
    }
}
