package com.js.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** * @author  作者 E-mail: * @date 创建时间：2017年9月1日 下午2:06:55 * @version 1.0 * @parameter  * @since  * @return  */
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return DataSourceContextHolder.getDbType();
	}
	
}
