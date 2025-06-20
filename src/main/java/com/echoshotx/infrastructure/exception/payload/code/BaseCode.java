package com.echoshotx.infrastructure.exception.payload.code;


public interface BaseCode {
    Reason getReason();
    Reason getReasonHttpStatus();
}