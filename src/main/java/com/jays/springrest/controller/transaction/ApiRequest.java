package com.jays.springrest.controller.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiRequest {

    @JsonProperty("sampleservicerq")
    InnerSampleServiceRequest sampleServiceRq;

    public ApiRequest() {
    }

    public ApiRequest(InnerSampleServiceRequest sampleServiceRq) {
        this.sampleServiceRq = sampleServiceRq;
    }

    public InnerSampleServiceRequest getSampleServiceRq() {
        return sampleServiceRq;
    }

    public void setSampleServiceRq(InnerSampleServiceRequest sampleServiceRq) {
        this.sampleServiceRq = sampleServiceRq;
    }

    public static class InnerSampleServiceRequest {

        @JsonProperty("service_id")
        String serviceId;

        @JsonProperty("order_type")
        String orderType;

        @JsonProperty("type")
        String type;

        @JsonProperty("trx_id")
        String trxId;

        public InnerSampleServiceRequest(String serviceId, String orderType, String type, String trxId) {
            this.serviceId = serviceId;
            this.orderType = orderType;
            this.type = type;
            this.trxId = trxId;
        }

        public String getServiceId() {
            return serviceId;
        }

        public void setServiceId(String serviceId) {
            this.serviceId = serviceId;
        }

        public String getOrderType() {
            return orderType;
        }

        public void setOrderType(String orderType) {
            this.orderType = orderType;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTrxId() {
            return trxId;
        }

        public void setTrxId(String trxId) {
            this.trxId = trxId;
        }
    }
}
