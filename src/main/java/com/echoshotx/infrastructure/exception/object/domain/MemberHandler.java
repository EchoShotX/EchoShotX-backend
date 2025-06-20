package com.echoshotx.infrastructure.exception.object.domain;

import com.echoshotx.infrastructure.exception.object.general.GeneralException;
import com.echoshotx.infrastructure.exception.payload.code.BaseCode;

public class MemberHandler extends GeneralException {
    public MemberHandler(BaseCode code) {
        super(code);
    }
}
