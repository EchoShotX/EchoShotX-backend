package com.echoshotx.domain.member.adaptor;

import com.echoshotx.domain.member.entity.Member;
import com.echoshotx.domain.member.repository.MemberRepository;
import com.echoshotx.infrastructure.annotation.adaptor.Adaptor;
import com.echoshotx.infrastructure.exception.object.domain.MemberHandler;
import com.echoshotx.infrastructure.exception.payload.code.ErrorStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Adaptor
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberAdaptor {

    private final MemberRepository repository;

    public Member queryByUsername(String username) {
        return repository.findByUsername(username)
                .orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));
    }

}
