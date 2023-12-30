package com.Visualization.Dashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/VisualizedEntity")
public class VisualizationController {
	@Autowired
	VisualizationService vService;

	@GetMapping(value="/getalldetail",produces = "application/json")
	public ResponseEntity<BaseResponse> getAllDetail(@RequestParam(required = false) int endYear, @RequestParam(required = false) String sector, @RequestParam(required = false) String region,@RequestParam(required = false)  String pestle, @RequestParam(required = false) String source,
			@RequestParam(required = false) String swot,@RequestParam(required = false) String country,@RequestParam(required = false) String city )  {
	        BaseResponse response = new BaseResponse();
	        try {
	            response = vService.getAllDetails(endYear, sector, region, pestle, source, swot, country, city);
	            response.setResponseCode(IVisualizationConstants.successCode);
	            response.setResponseMessage(IVisualizationConstants.successMessage);
	        } catch (Exception e) {
	            e.printStackTrace();
	            response.setResponseCode(IVisualizationConstants.failedCode);
	            response.setResponseMessage(IVisualizationConstants.failedMessage);
	            response.setResponseBody(e.getMessage());
	        }
	        return ResponseEntity.ok(response);
	    }


	}

