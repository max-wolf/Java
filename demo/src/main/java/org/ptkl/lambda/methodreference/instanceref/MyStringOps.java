package org.ptkl.lambda.methodreference.instanceref;

public class MyStringOps {
    //普通方法：反转字符串
    public String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
