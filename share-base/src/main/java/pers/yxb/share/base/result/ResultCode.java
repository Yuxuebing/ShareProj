package pers.yxb.share.base.result;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/16 0016
 * @Version
 * @Describe
 */
public enum ResultCode {
    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
