package com.WebService.tn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.social.security.SocialAuthenticationException;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Service;

import com.WebService.tn.dto.LocalUser;
import com.WebService.tn.dto.SocialUser;

@Service("socialUserDetailService")
public class SocialUserDetailService implements SocialUserDetailsService {

    @Autowired
    @Qualifier(value = "localUserDetailService")
    private UserDetailsService userDetailService;

    @Override
    public SocialUserDetails loadUserByUserId(final String userId) throws UsernameNotFoundException, DataAccessException {
        LocalUser user = (LocalUser) userDetailService.loadUserByUsername(userId);
        if (user == null) {
            throw new SocialAuthenticationException("No local user mapped with social user " + userId);
        }
        return new SocialUser(user.getUserId(),user.getUsername(), user.getPassword(), user.isEnabled(), user.isAccountNonExpired(), user.isCredentialsNonExpired(), user.isAccountNonLocked(), user.getAuthorities());
    }
}
