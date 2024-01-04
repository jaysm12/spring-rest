package com.jays.springrest.controller.external;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {

    @JsonProperty("sampleservicers")
    DataResponse dataResponse;

    public ApiResponse() { }

    public ApiResponse(DataResponse dataResponse) {
        this.dataResponse = dataResponse;
    }

    public DataResponse getDataResponse() {
        return dataResponse;
    }

    public void setDataResponse(DataResponse dataResponse) {
        this.dataResponse = dataResponse;
    }


    public static class DataResponse {

        @JsonProperty("error_code")
        String errorCode;

        @JsonProperty("error_msg")
        String errorMsg;

        @JsonProperty("trx_id")
        String trxId;

        public DataResponse(String errorCode, String errorMsg, String trxId) {
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
            this.trxId = trxId;
        }

        public String geterrorCode() {
            return errorCode;
        }

        public void seterrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String geterrorMsg() {
            return errorMsg;
        }

        public void seterrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getTrxId() {
            return trxId;
        }

        public void setTrxId(String trxId) {
            this.trxId = trxId;
        }


        @Override
        public String toString() {
            return "{" +
                " errorcode='" + geterrorCode() + "'" +
                " errormsg='" + geterrorMsg() + "'" +
                " trxid='" + getTrxId() + "'" +
                "}";
        }

    }
}
