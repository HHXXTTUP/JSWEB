package com.js.util;/** * @author  作者 E-mail: * @date 创建时间：2017年9月1日 下午4:42:56 * @version 1.0 * @parameter  * @since  * @return  */
public class DataSourceContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
	  
    public static void setDbType(String dbType) {  
        contextHolder.set(dbType);  
    }  
  
    public static String getDbType() {  
        return ((String) contextHolder.get());  
    }  
  
    public static void clearDbType() {  
        contextHolder.remove();  
    }  
}
