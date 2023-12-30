package com.Visualization.Dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizedEntityRepository extends JpaRepository<VisualizationEntity, Long> {

	public List<VisualizationEntity> findByYearEndYear(int endYear);

	public List<VisualizationEntity> findByTopics(String topics);

	public List<VisualizationEntity> findBySector(String sector);

	public List<VisualizationEntity> findByRegion(String region);

	public List<VisualizationEntity> findByPestle(String pestle);

	public List<VisualizationEntity> findBySource(String source);

	public List<VisualizationEntity> findBySwot(String swot);

	public List<VisualizationEntity> findByCountry(String country);

	public List<VisualizationEntity> findByCity(String city);

}
