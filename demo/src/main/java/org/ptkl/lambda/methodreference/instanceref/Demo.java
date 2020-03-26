package org.ptkl.lambda.methodreference.instanceref;

import java.util.function.Function;

public class Demo {

    public static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        MyStringOps strOps = new MyStringOps(); //instance object

        /*original*/
//        String outStr = stringOp(new StringFunc() {
//            @Override
//            public String func(String s) {
//                return strOps.strReverse(s);
//            }
//        }, inStr);

        /*lambda*/
//        String outStr = stringOp(s -> strOps.strReverse(s), inStr);

        /*method reference*/
        String outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Original string: " + inStr);
        System.out.println("String reserved: " + outStr);

    }
}
