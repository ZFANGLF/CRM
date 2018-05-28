package com.nexcool.crm.model.beans;

public interface DataBeans {
	/**   
	* @Function: DataBeans.java
	* @Description: 获取字段连接字符串，用于拼装SQL语句
	*
	* @param: 无参数
	* @return：字段连接字符串
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: administrator
	* @date: 2018年4月9日 下午7:28:09 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年4月9日     administrator           v1.0.0               修改原因
	*/
	String getFields();
	/**   
	* @Function: DataBeans.java
	* @Description: 获取字段值连接字符串，用于拼装SQL语句
	*
	* @param: 无参数
	* @return：字段值连接字符串
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: administrator
	* @date: 2018年4月9日 下午7:29:12 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2018年4月9日     administrator           v1.0.0               修改原因
	*/
	String getValue();
}
