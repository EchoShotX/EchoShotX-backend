package com.echoshotx.infrastructure.exception.object.domain;

import com.echoshotx.infrastructure.exception.object.general.GeneralException;
import com.echoshotx.infrastructure.exception.payload.code.BaseCode;

public class PointHandler extends GeneralException {
    public PointHandler(BaseCode code) {
        super(code);
    }
}
