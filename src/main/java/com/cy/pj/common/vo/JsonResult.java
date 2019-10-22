package com.cy.pj.common.vo;

import java.io.Serializable;

public class JsonResult implements Serializable {
	private static final long serialVersionUID = 2080943344863436345L;
	private int state = 1;
	private String msg = "ok";
	private Object data;

	public JsonResult() {
	}

	public JsonResult(Object data) {
		this.data = data;
	}

	public JsonResult(String msg) {
		this.msg = msg;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public JsonResult(Throwable t) {
		this.state = 0;
		this.msg = t.getMessage();
	}

}
