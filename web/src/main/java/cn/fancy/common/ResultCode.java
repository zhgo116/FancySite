package cn.fancy.common;

/**
 * 返回状态码
 * @author caosheng
 * @date 2018/11/27
 */
public enum ResultCode {
    /**
     *未登录
     */
    NOT_LOGIN(401,"未登录"),
    SUCCESS (200,"成功"),
    SERVER_ERROR (500,"接口处理异常,请联系工程师!"),
    ACCESS_ERROR (501,"错误"),
    PARAM_ERROR (502,"传入参数异常");
    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
