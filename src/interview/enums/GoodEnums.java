package interview.enums;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-24:2019
 * Des:
 */
public enum GoodEnums {
    NORMAL("1","牛逼");
    String code;
    String msg;

    GoodEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
