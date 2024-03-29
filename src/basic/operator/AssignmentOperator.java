package basic.operator;

public class AssignmentOperator {
    public static void main(String[] args) {

        /*
         # 대입(할당) 연산자 (=)
         # 복합 대입 연산자 (+=, -=, *=, /=, %=)
         - 변수에 값을 대입할 때 사용하는 연산자 입니다.
         - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태입니다.
         */
        int a = 5, b = 3;
        
        a += 3;
        a -= 4;
        a *= 6;
        a /= 5;
        a %= 3;
        System.out.println("a = " + a);
    }
}
