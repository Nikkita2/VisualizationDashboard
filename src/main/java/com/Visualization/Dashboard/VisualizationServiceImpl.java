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
			String swot, String country, String city) {
		BaseResponse response = new BaseResponse();
		List<VisualizationEntity> visualEntity = visualizationRepo.findAll();
		List<VisualizationEntityVO> visualizationVo = new ArrayList<>();
		for (VisualizationEntity entity : visualEntity) {
			VisualizationEntityVO visualVo = new VisualizationEntityVO();
			visualVo.setIntensity(entity.getIntensity());
			visualVo.setLikelihood(entity.getLikelihood());
			visualVo.setRelevance(entity.getRelevance());
			visualVo.setYear(entity.getYear());
			visualVo.setCountry(entity.getCountry());
			visualVo.setTopics(entity.getTopics());
			visualVo.setRegion(entity.getRegion());
			visualVo.setCity(entity.getCity());

		}
		return response;

	}

}
