package com.js.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.js.pojo.Userinfo;
import com.js.service.UserinfoService;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserinfoService t_userService;

    /**
     * 用于的权限的认证。
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		try {
			String userName=(String)principalCollection.getPrimaryPrincipal();
			SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
			authorizationInfo.setRoles(t_userService.getLoginroles(userName));
	    	System.out.println("授权成功");
			return authorizationInfo;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("授权失败");
			return null;
		}
    }
    /**
     * 首先执行这个登录验证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override					 
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
//    	String userName=(String)token.getPrincipal();
//		//Userinfo user=t_userService.getLoginUser(userName);
//		if(user!=null){
//			AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"xx");
//			return authcInfo;
//		}else{
//			return null;				
//		}
 //   
    return null;
    }
}

