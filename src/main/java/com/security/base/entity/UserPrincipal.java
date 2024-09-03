package com.security.base.entity;

/* 
 * Bu classın amacı User objesine detailsi eklemeden onun yerini alacak
 * aracı bir sınıf kullanmak. Bu sınıf SecurityConfigteki
 * DaoAuthenticationProvider providerın içindeki provider.setUserDetailsService(userDetailsService);
 * kendi userdetailisimiz bilgisini almak.
*/


import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrincipal implements UserDetails{

    private User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return user.getUserPassword();
    }

    @Override
    public String getUsername() {
       return user.getUsername();
    }

    
}