package org.ptkl.lambda.methodreference.construct.demo1;

public class Demo {

    public static void main(String[] args) {
        /*original*/
//        MyFunc myFunc = new MyFunc() {
//            @Override
//            public MyClass func(int n) {
//                return new MyClass(n);
//            }
//        };

        /*lambda*/
//        MyFunc myFunc = n -> new MyClass(n);

        /*method reference*/
        MyFunc myFunc = MyClass::new;
        MyClass mc = myFunc.func(100);
        System.out.println("val in mc is: " + mc.getValue());
    }
}
