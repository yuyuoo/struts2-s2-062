package com.test.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest {
    public static void main(String[] args) throws OgnlException {
        OgnlContext context = new OgnlContext();
        Object obj = Ognl.getValue("'helloworld'.length()",context);
        System.out.println(obj);
        Object obj1 = Ognl.getValue("@java.lang.String@format('foo %s','bar')",context);
        System.out.println(obj1);
        Object obj2 = Ognl.getValue("@java.lang.Runtime@getRuntime().exec('calc')",context);
    }
}