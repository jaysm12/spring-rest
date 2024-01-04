package com.jays.springrest.controller.external;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/external")
public class TransactionController {

  @PostMapping(value="/services/rest/sample-service")
  public ResponseEntity<ApiResponse> sampleService(@RequestBody ApiRequest req) {
    ApiResponse.DataResponse dataResponse = new ApiResponse.DataResponse("000", "Success", req.dataRequest.getTrxId());
    ApiResponse res = new ApiResponse(dataResponse);

    return new ResponseEntity<>(res, HttpStatus.CREATED);
  }
}
