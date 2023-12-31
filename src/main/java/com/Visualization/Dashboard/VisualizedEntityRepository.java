package com.Visualization.Dashboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizedEntityRepository extends JpaRepository<VisualizationEntity, Long> {
	@Query
	("SELECT ve FROM VisualizationEntity ve " + "WHERE (:endYear IS NULL OR ve.endYear = :endYear) " +
            "AND (:sector IS NULL OR ve.sector = :sector) " +
            "AND (:region IS NULL OR ve.region = :region) " +
            "AND (:pestle IS NULL OR ve.pestle = :pestle) " +
            "AND (:source IS NULL OR ve.source = :source) " +
            "AND (:swot IS NULL OR ve.swot = :swot) " +
            "AND (:country IS NULL OR ve.country = :country) " +
            "AND (:city IS NULL OR ve.city = :city) " +
            "AND (:topics IS NULL OR ve.topics = :topics)")
    List<VisualizationEntity> findByEndYear(int endYear);

    List<VisualizationEntity> findByTopics(String topics);

    List<VisualizationEntity> findBySector(String sector);

    List<VisualizationEntity> findByRegion(String region);

    List<VisualizationEntity> findByPestle(String pestle);

    List<VisualizationEntity> findBySource(String source);

    List<VisualizationEntity> findBySwot(String swot);

    List<VisualizationEntity> findByCountry(String country);

    List<VisualizationEntity> findByCity(String city);

	List<VisualizationEntity> findByEndYearAndSectorAndRegionAndPestleAndSourceAndSwotAndCountryAndCityAndTopics(
			int endYear, String sector, String region, String pestle, String source, String swot, String country,
			String city, String topics);

}
