package com.Visualization.Dashboard;

public interface VisualizationService {
	BaseResponse getAllDetails(int endYear, String sector, String region, String pestle, String source, String swot,
			String country, String city);

}
