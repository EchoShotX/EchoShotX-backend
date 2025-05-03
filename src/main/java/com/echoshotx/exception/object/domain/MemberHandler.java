package com.echoshotx.exception.object.domain;

import com.echoshotx.exception.object.general.GeneralException;
import com.echoshotx.exception.payload.code.BaseCode;

public class MemberHandler extends GeneralException {
    public MemberHandler(BaseCode code) {
        super(code);
    }
}
