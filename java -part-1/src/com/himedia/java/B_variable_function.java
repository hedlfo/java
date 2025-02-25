package com.himedia.java;

//* 변수 : 값을 저장할 수 있는 메모리상의 공간
// 변수 타입 : 변수에 저장될 값이 어떤 타입인지를 지정하는 것.
// 변수 이름 : 변수에 붙인 이름
// 변수 초기화 : 변수를 사용하기 전에 처음으로 값을 저장하는 것.

//* 변수의 명명 규칙
// 1. 대소문자가 구분되며 길이에 제한이 없다.
// 2. 예약어를 사용해서는 안된다. ex)true, false, break, int, for, ...
// 3. 숫자로 시작하면 안된다.
// 4. 특수문자 : '_'와 '$'만을 허용한다.

//*변수의 타입
//기본형(Primitive type)과 참조형(Reference type)
//자료형은 크게 '기본형'과 '참조형' 두 가지로 나눌 수 있는데,
//기본형 변수는 실제 값(data)를 저장하는 반면,
//참조형 변수는 어떤 값이 저장되어 있는 주소(memory address)를 값으로 갖는다.
// -기본형: 논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형(float, double)
// -참조형: 객체의 주소를 저장한다. 기본형을 제외한 나머지 타입.


//**기본형
//-논리형 : boolean
//true 와 false 중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용된다.
//크기:1byte
// 범위 : -
//-문자형 : char
// 문자를 저장하는데 사용되며, 하나의 문자만 저장할 수 있다.
// 크기 : 2byte
// 범위 :
//-정수형 : byte, short, int, long
// 정수를 저장하는데 사용된다. byte는 이진데이터를 다룰 때, short는 C언어와의 호환을 위해 추가되었다.
// 크기 : byte(1byte-8bit), short(2byte), int(4byte), long(8byte)
//-실수형: float, double
//크기:float(4byte), double(8byte)
//*상수(Constant):변수와 마찬가지로 '값을 저장할 수 있는 공간'이지만,
//변수와 달리 한번 값을 저장하면 다른 값으로 변경할 수 없다.


//*return
//1. 값을 반환 : 함수가 어떤 밧을 계산하거나 처리한 후, 그 결과를 호출한 코드로 돌려줄 때 사용.
//2. 함수 종료 : return 문이 실행되면 해당 함수는 즉시 종료가 된다.
public class B_variable_function {

    public static void exam1() {
        String myStr = "안녕하세요!";
        System.out.println(myStr);

        int num = 10;
        System.out.println(num);

        byte bNum = 127;
        System.out.println(bNum);

        float fNum = 3.14f;
        System.out.println(fNum);

        double dNum = 3.14432534564;
        System.out.println(dNum);

        final float PI = 3.14f;
        //PI = 3.15; //

    }

// *함수 :프로그래밍에서 특정 작업을 수행하기 위해 작성된 코드의 묶음
//1. 함수 선언 : 함수의 이름과 특성을 정의하는 부분이다.
//2. 매개변수(Parameters)":매개변수는 함수가 작업을 수행하는데 필요한 입력값을 전달하는 부분이다.
//3. 반환타입(Return type) : 함수가 어떤 유형의 값을 반환할

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //minus 함수
    public static int minus(int a, int b) {
        int minus = a - b;
        return minus;
    }
    //multiply 함수 (곱하기)
    public static int multiply(int a, int b) {
        return a * b;
    }
    //divide(나누기) : 소수점으로 반환 받는다.
    public static double divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        //호출

        //호출후 받은 결과값 출력

    }


}