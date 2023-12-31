package com.Visualization.Dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/VisualizedEntity")
public class VisualizationController {

	@Autowired
	VisualizationService vService;

	@GetMapping(value = "/getalldetail", produces = "application/json")
	public ResponseEntity<BaseResponse> getAllDetail(@RequestParam(required = false) Integer endYear,
			@RequestParam(required = false) String sector, @RequestParam(required = false) String region,
			@RequestParam(required = false) String pestle, @RequestParam(required = false) String source,
			@RequestParam(required = false) String swot, @RequestParam(required = false) String country,
			@RequestParam(required = false) String city, String topics) {
		BaseResponse response = new BaseResponse();
		try {

			response = vService.getAllDetails(endYear, sector, region, pestle, source, swot, country, city, topics);

			response.setResponseCode(IVisualizationConstants.successCode);
			response.setResponseMessage(IVisualizationConstants.successMessage);
			return ResponseEntity.ok(response);
		} catch (Exception e) {

			e.printStackTrace();

			response.setResponseCode(IVisualizationConstants.failedCode);
			response.setResponseMessage(IVisualizationConstants.failedMessage);
			response.setResponseBody(e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
	
}
