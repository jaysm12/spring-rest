package com.jays.springrest.controller.transaction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

  @PostMapping(value="/course")
  public ResponseEntity<ApiResponse> createCourse(@RequestBody ApiRequest req) {


    ApiResponse.DataResponse dataResponse = new ApiResponse.DataResponse("000", "Success", req.sampleServiceRq.getTrxId());
    ApiResponse res = new ApiResponse(dataResponse);

    System.out.println(res);

    return new ResponseEntity<>(res, HttpStatus.CREATED);
  }
}
