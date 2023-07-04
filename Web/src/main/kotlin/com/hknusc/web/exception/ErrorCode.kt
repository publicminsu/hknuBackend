package com.hknusc.web.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(val status: HttpStatus,val message: String) {
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    
    USER_NOT_FOUND(HttpStatus.NOT_FOUND,"사용자를 찾을 수 없습니다."),
    
    LOGIN_FAIL(HttpStatus.UNAUTHORIZED, "로그인에 실패했습니다."),
    INVALID_TOKEN(HttpStatus.UNAUTHORIZED,"유효하지 않은 인증입니다."),
    EMPTY_TOKEN(HttpStatus.UNAUTHORIZED,"인증되지 않았습니다."),

    REVIEW_NOT_FOUND(HttpStatus.NOT_FOUND,"리뷰를 찾을 수 없습니다.")
}