package org.ptkl.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericArray {
    public static void main(String[] args) {
       /* The component type of an array object may not be a type variable or a parameterized type,
       unless it is an (unbounded) wildcard type.
       You can declare array types whose element type is a type variable or a parameterized type, but not array objects.

        // not allowed
        List<String>[] lsa = new List<String>[10];
        // OK, array of unbounded wildcard type.
        List<?>[] lsa = new List<?>[10];
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<>();
        li.add(new Integer(3));
        oa[1] = li;
        // Run time error, but cast is explicit.
        String s = (String) lsa[1].get(0);*/
    }
}