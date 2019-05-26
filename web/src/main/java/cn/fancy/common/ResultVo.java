package cn.fancy.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.util.StringUtils;


/**
 * 基础共通返回值
 *
 * @author caosheng
 * @date 2018/03/20
 */
public class ResultVo<T> {
    /**
     * 响应结果成功或失败
     */
    private boolean status;
    /**
     * 响应消息
     */
    private String msg;
    /**
     * 返回实体数据(方便swagger展示对象属性名及注释)
     */
    private T data;
    /**
     * 状态码
     */
    private int code = 200;

    /**
     * 解决Fastjson转换多属性报错问题而使用
     */
    public static final Gson GSON = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();

    @Deprecated
    public ResultVo() {

    }
    @Deprecated
    public ResultVo(boolean status, String msg) {
        this.status = status;
        this.msg = msg;
        this.data = null;
        this.code=code;
    }

    @Deprecated
    public ResultVo(boolean status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    private ResultVo(boolean status, String msg, int code) {
        this.status = status;
        this.msg = msg;
        this.code = code;
        this.data = null;
    }


    public static ResultVo success() {
        return new ResultVo(true, ResultCode.SUCCESS.getMsg(), ResultCode.SUCCESS.getCode());
    }

    public static ResultVo success(String msg) {
        return new ResultVo(true, msg, ResultCode.SUCCESS.getCode());
    }


    public static <T>ResultVo<T> success(String msg,T data) {
        ResultVo res=success(msg);
        res.setData(data);
        return res;
    }

    public static <T>ResultVo<T> success(T data) {
        ResultVo res = success();
        res.setData(data);
        return res;
    }


    public static <T>ResultVo<T> failure(String msg) {
        if(StringUtils.isEmpty(msg)){
            msg=ResultCode.SERVER_ERROR.getMsg();
        }
        return new ResultVo(false, msg, ResultCode.SERVER_ERROR.getCode());
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}
