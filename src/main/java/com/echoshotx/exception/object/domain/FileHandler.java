package com.echoshotx.exception.object.domain;

import com.echoshotx.exception.object.general.GeneralException;
import com.echoshotx.exception.payload.code.BaseCode;

public class FileHandler extends GeneralException {
    public FileHandler(BaseCode code) {
        super(code);
    }
}
