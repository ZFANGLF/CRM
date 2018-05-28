package com.nexcool.crm.model.dao;

import java.util.ArrayList;

import com.nexcool.crm.model.beans.DataBeans;

/**
 * @Package: com.nexcool.crm.model.dao 
 * @ClassName: Dao.java
 * @Description: 数据库接口类
 *
 * @version: v1.0.0
 * @author: Sundy
 * @date: 2018年4月10日 下午4:50:54 
 *
 * Modification History:
 * Date					 		Author 			Version	 	Description
 *----------------------------------------------------------------------------*
 * 2018年4月10日 		Sundy	 		v1.0.0 		修改原因
 *
 * Copyright: Copyright (c) 2018 nexcool.com All rights reserved.
**/
public interface JDBCDao {
	/**   
	 * @Function: create
	 * @Description: 插入一条数据
	 *
	 * @param beans
	 * @return: int
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:48:55 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	int create(DataBeans beans);
	/**   
	 * @Function: delete
	 * @Description: 删除一条数据
	 *
	 * @param beans
	 * @return: Boolean
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:52:06 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	Boolean delete(DataBeans beans);
	/**   
	 * @Function: update
	 * @Description: 更新一条数据
	 *
	 * @param beans
	 * @return: int
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:52:33 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	int update(DataBeans beans);
	/**   
	 * @Function: find
	 * @Description: 查询一条符合条件的数据
	 *
	 * @param condition
	 * @return: DataBeans
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:53:05 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	DataBeans find(String condition);
	/**   
	 * @Function: select
	 * @Description: 查询符合条件的所有数据
	 *
	 * @param condition
	 * @return
	 * @return: ArrayList<DataBeans>
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:53:27 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	ArrayList<DataBeans> select(String condition);
	/**   
	 * @Function: count
	 * @Description: 查询符合条件的数据条数
	 *
	 * @param condition
	 * @return: int
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:54:23 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	int count(String condition);
}
