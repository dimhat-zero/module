package com.jianla.model.base;

import java.io.Serializable;

/**
 * 规范化json返回结果
 */
public class JsonResult implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 2750976048920319870L;

	private Integer code = 200;

	private Boolean success = true;

	private String message;

	private Object data;


	/* 系统级错误 */
	public static final JsonResult OK = new JsonResult(200, "OK");

	public static final JsonResult FORBIDDEN = new JsonResult(403, "没有权限访问", false);

	public static final JsonResult INTERNAL_ERR = new JsonResult(500, "服务器内部错误", false);

	/* 应用级错误 */
	public static final JsonResult ERR_INPUT_NULL = new JsonResult(4002001, "Field is required", false);

	public static final JsonResult ERR_NOT_LOGIN = new JsonResult(4001001, "没有登录", false);

	public static final JsonResult ERR_NOT_AUTH = new JsonResult(4003001, "没有权限", false);

	public static JsonResult createOK() {
		return new JsonResult(200, "OK");
	}

	public Integer getCode() {
		return code;
	}


	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	public JsonResult() {
		super();
	}

	public JsonResult(Integer code) {
		super();
		this.code = code;
	}

	public JsonResult(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public JsonResult(Integer code, String message, Boolean success) {
		super();
		this.code = code;
		this.success = success;
		this.message = message;
	}

}
