package com.Visualization.Dashboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisualizationServiceImpl implements VisualizationService {

	@Autowired
	VisualizedEntityRepository visualizationRepo;

	@Override
	public BaseResponse getAllDetails(int endYear, String sector, String region, String pestle, String source,
			String swot, String country, String city, String topics) {
		BaseResponse response = new BaseResponse();
		try {
			List<VisualizationEntity> filteredEntities = visualizationRepo
					.findByEndYearAndSectorAndRegionAndPestleAndSourceAndSwotAndCountryAndCityAndTopics(endYear, sector, region,
							pestle, source, swot, country, city, topics);

			List<VisualizationEntityVO> visualizationVo = new ArrayList<>();
			for (VisualizationEntity entity : filteredEntities) {
				VisualizationEntityVO visualVo = new VisualizationEntityVO();
				visualVo.setIntensity(entity.getIntensity());
				visualVo.setLikelihood(entity.getLikelihood());
				visualVo.setRelevance(entity.getRelevance());
				visualVo.setYear(entity.getYear());
				visualVo.setCountry(entity.getCountry());
				visualVo.setTopics(entity.getTopics());
				visualVo.setRegion(entity.getRegion());
				visualVo.setCity(entity.getCity());

				visualizationVo.add(visualVo);
			}

			response.setResponseBody(visualizationVo);
			response.setResponseCode(IVisualizationConstants.successCode);
			response.setResponseMessage(IVisualizationConstants.successMessage);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResponseCode(IVisualizationConstants.failedCode);
			response.setResponseMessage(IVisualizationConstants.failedMessage);
			response.setResponseBody(e.getMessage());
		}
		return response;
	}
}
