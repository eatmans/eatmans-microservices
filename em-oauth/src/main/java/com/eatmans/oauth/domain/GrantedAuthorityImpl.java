package com.eatmans.oauth.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/6/6
 */
public class GrantedAuthorityImpl implements GrantedAuthority {
    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}