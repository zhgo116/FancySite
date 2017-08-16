/**
 * UUIDUtil.java
 * cn.fancy.tellingweb.common
 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2015年3月26日 		wang_tj
 *
 * Copyright (c) 2015, TNT All Rights Reserved.
*/

package cn.fancy.utils;

import java.util.UUID;

/**
 * ClassName:UUIDUtil
 *
 * @author   wang_tj
 * @version  
 * @since    Ver 1.1
 * @Date	 2015年3月26日		下午3:56:34
 *
 * @see 	 
 */
public class UUIDUtil {
	
	/**
	 * 获取当前UUID，用做数据关联
	 * 新增表结构请使用此ID替换seq
	 */
	public static String getUUID() {
		UUID uuid = UUID.randomUUID();
		String uuidStr = (uuid.toString()).replaceAll("-", "");
		return uuidStr;
	}
}

