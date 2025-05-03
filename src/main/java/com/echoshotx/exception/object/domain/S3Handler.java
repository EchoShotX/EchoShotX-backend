package com.echoshotx.exception.object.domain;

import com.echoshotx.exception.object.general.GeneralException;
import com.echoshotx.exception.payload.code.BaseCode;

public class S3Handler extends GeneralException {
    public S3Handler(BaseCode code) {
        super(code);
    }
}
