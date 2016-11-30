package com.evergrande.mybatis.common;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 * User: cuican
 * Date: 2016-11-30
 * Time: 11:14
 */
@Data
@ToString
public abstract class Entity implements Serializable {

	private static final long serialVersionUID = -1L;

	public int id;
	Date addTime;
	Date updateTime;
}
