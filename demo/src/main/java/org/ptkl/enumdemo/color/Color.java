package org.ptkl.enumdemo.color;

public enum Color {
    //枚举实例必须在前面
    RED(1, "红色"),
    GREEN(2, "绿色");

    private int code;
    private String name;

    //enum构造方法不可被客户实例化,private多余
    Color(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "code:"+code+",name:"+name;
    }
}
