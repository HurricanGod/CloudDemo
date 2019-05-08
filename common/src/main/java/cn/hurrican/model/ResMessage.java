package cn.hurrican.model;

import lombok.Data;

import java.util.Map;

/**
 * @author Hurrican
 * @Date 2019/5/8  10:56
 * @since 1.0.0
 */
@Data

public class ResMessage<T> {

    private int retCode;

    private String msg;

    private T result;

    public ResMessage() {
        this.retCode = 0;
        this.msg = "";
    }

    public ResMessage(int retCode, String msg) {
        this.retCode = retCode;
        this.msg = msg;
    }

    public ResMessage(T result) {
        this.result = result;
    }

    public ResMessage<T> safePut(String key, Object val) {
        if (this.result instanceof Map) {
            ((Map) this.result).put(key, val);
        }
        return this;
    }
}
