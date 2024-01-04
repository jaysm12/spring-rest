package com.jays.springrest.controller.external;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(TransactionController.class)
class TransactionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testSampleService() throws Exception {
      ApiRequest.DataRequest dummy = new ApiRequest.DataRequest("1111", "order-1", "type-1", "trx-1");
      ApiRequest request = new ApiRequest(dummy);

      ApiResponse.DataResponse dataResponse = new ApiResponse.DataResponse("000", "Success", "trx-1");
      ApiResponse expectedResponse = new ApiResponse(dataResponse);


      RequestBuilder requestBuilder = MockMvcRequestBuilders
              .post("/external/services/rest/sample-service")
              .content(objectMapper.writeValueAsString(request))
              .contentType(MediaType.APPLICATION_JSON);


      MvcResult result = mockMvc.perform(requestBuilder)
              .andExpect(status().isCreated())
              .andReturn();

      String content = result.getResponse().getContentAsString();
      ApiResponse actualResponse = objectMapper.readValue(content, ApiResponse.class);
      assertEquals(expectedResponse.getDataResponse().geterrorCode(), actualResponse.getDataResponse().geterrorCode(), "Code should match");
      assertEquals(expectedResponse.getDataResponse().geterrorMsg(), actualResponse.getDataResponse().geterrorMsg(), "Message should match");
      assertEquals(expectedResponse.getDataResponse().getTrxId(), actualResponse.getDataResponse().getTrxId(), "TrxId should match");
      
  }
}
