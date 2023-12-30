package com.Visualization.Dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizedEntityRepository extends JpaRepository<VisualizationEntity, Long> {

    List<VisualizationEntity> findByEndYear(int endYear);

    List<VisualizationEntity> findByTopics(String topics);

    List<VisualizationEntity> findBySector(String sector);

    List<VisualizationEntity> findByRegion(String region);

    List<VisualizationEntity> findByPestle(String pestle);

    List<VisualizationEntity> findBySource(String source);

    List<VisualizationEntity> findBySwot(String swot);

    List<VisualizationEntity> findByCountry(String country);

    List<VisualizationEntity> findByCity(String city);

    List<VisualizationEntity> findByEndYearAndSectorAndRegionAndPestleAndSourceAndSwotAndCountryAndCity(
            int endYear, String sector, String region, String pestle, String source, String swot, String country,
            String city);

}
