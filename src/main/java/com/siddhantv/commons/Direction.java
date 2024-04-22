package com.siddhantv.commons;

public enum Direction {
    UP("up"),DOWN("down");
    private final String code;
    Direction(String code){
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
