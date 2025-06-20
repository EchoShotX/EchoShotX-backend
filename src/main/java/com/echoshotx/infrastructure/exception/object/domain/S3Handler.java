package com.echoshotx.infrastructure.exception.object.domain;

import com.echoshotx.infrastructure.exception.object.general.GeneralException;
import com.echoshotx.infrastructure.exception.payload.code.BaseCode;

public class S3Handler extends GeneralException {
    public S3Handler(BaseCode code) {
        super(code);
    }
}
