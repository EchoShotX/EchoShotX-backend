package com.echoshotx.infrastructure.exception.object.domain;

import com.echoshotx.infrastructure.exception.object.general.GeneralException;
import com.echoshotx.infrastructure.exception.payload.code.BaseCode;

public class FileHandler extends GeneralException {
    public FileHandler(BaseCode code) {
        super(code);
    }
}
