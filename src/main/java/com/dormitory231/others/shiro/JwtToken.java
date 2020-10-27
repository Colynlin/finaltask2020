package com.dormitory231.others.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author ColynLin
 * @Date 2020/10/19 23:48
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
