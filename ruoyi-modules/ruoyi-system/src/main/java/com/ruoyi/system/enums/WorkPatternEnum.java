package com.ruoyi.system.enums;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/8 22:40
 **/
public enum WorkPatternEnum {
    Weeks("1", "礼拜制"),
    Continuitys("2", "连续制");

    private String type;
    private String desc;

    public static String desc(String type) {
        WorkPatternEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            WorkPatternEnum workPatternEnum = var1[var3];
            if (workPatternEnum.getType() .equals(type) ) {
                return workPatternEnum.getDesc();
            }
        }

        return null;
    }

    private WorkPatternEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public String getType() {
        return this.type;
    }

    public String getDesc() {
        return this.desc;
    }
}
