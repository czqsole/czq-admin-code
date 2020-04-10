package czq.czqsole.domain.result;

import java.io.Serializable;

/**
 * Author: BG366783
 * Date: 2019-03-03 02:24
 */
public class BaseResult implements Serializable {

    private Boolean success = true;

    private String errorCode;

    private String errorMsg;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
