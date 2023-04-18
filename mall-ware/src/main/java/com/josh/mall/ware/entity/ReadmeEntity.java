package com.josh.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author mingwei
 * @email qwe292387082@gmail.com
 * @date 2023-04-05 19:04:19
 */
@Data
@TableName("README")
public class ReadmeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String readme;
	/**
	 * 
	 */
	private String btcAddress;
	/**
	 * 
	 */
	private String email;

}
