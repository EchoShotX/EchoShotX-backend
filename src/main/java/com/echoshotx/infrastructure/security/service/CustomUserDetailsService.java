package com.echoshotx.infrastructure.security.service;

import com.echoshotx.domain.member.adaptor.MemberAdaptor;
import com.echoshotx.infrastructure.security.vo.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService{

    private final MemberAdaptor memberAdaptor;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new CustomUserDetails(memberAdaptor.queryByUsername(username));
    }
}
