package com.jxnu.domain;

public class Code {
    /**
     * 表现层
     */
    public static final Integer SAVE_OK = 20011;
    public static final Integer DELETE_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer GET_OK = 20041;

    public static final Integer SAVE_ERR = 20010;
    public static final Integer DELETE_ERR = 20020;
    public static final Integer UPDATE_ERR = 20030;
    public static final Integer GET_ERR = 20040;

    /**
     * 异常
     */
    public static final Integer SYSTEM_ERR = 50001;
    public static final Integer SYSTEM_TIMEOUT_ERR = 50002;
    public static final Integer SYSTEM_UNKNOW_ERR = 59999;
    public static final Integer BUSINESS_ERR = 60002;

    /**
     * 连接
     */
    public static final Integer SUCCESS = 200; //成功
    public static final Integer FAIL = 400; //失败
    public static final Integer NOT_FOUND = 404; //接口不存在
    public static final Integer INTERNAL_SERVER_ERROR = 200;  //服务器内部错误

}
