package com.Visualization.Dashboard;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "visualization_dashboard") 
public class VisualizationEntity {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "intensity")
	    private int intensity;
	    
	    @Column(name = "likelihood")
	    private int likelihood;
	    
	    @Column(name = "relevance")
	    private int relevance;
	    
	    @Column(name = "year")
	    private int year;
	    
	    @Column(name = "country")
	    private String country;
	    
	    @Column(name = "topics")
	    private String topics;
	    
	    @Column(name = "region")
	    private String region;
	    
	    @Column(name = "city")
	    private String city;
	    
	    @Column(name = "swot")
	    private String swot;
	    
	    @Column(name = "endYear")
	    private int endYear;
	    
	    @Column(name = "sector")
	    private String sector;
	    
	    @Column(name = "cityLng")
	    private float cityLng;
	    
	    @Column(name = "cityLat")
	    private float cityLat;
	    
	    @Column(name = "insight")
	    private String insight;
	    
	    @Column(name = "url")
	    private String url;
	    
	    @Column(name = "startYear")
	    private int startYear;
	    
	    @Column(name = "impact")
	    private int impact;
	    
	    @Column(name = "added")
	    private String added;
	    
	    @Column(name = "published")
	    private String published;
	    
	    @Column(name = "pestle")
	    private String pestle;
	    
	    @Column(name = "source")
	    private String source;
	    
	    @Column(name = "title")
	    private String title;
		public Long getId() {
			return id;
			
		}
		public int getIntensity() {
			return intensity;
		}
		public void setIntensity(int intensity) {
			this.intensity = intensity;
		}
		public int getLikelihood() {
			return likelihood;
		}
		public void setLikelihood(int likelihood) {
			this.likelihood = likelihood;
		}
		public int getRelevance() {
			return relevance;
		}
		public void setRelevance(int relevance) {
			this.relevance = relevance;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getTopics() {
			return topics;
		}
		public void setTopics(String topics) {
			this.topics = topics;
		}
		public String getRegion() {
			return region;
		}
		public void setRegion(String region) {
			this.region = region;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getSwot() {
			return swot;
		}
		public void setSwot(String swot) {
			this.swot = swot;
		}
		public int getEndYear() {
			return endYear;
		}
		public void setEndYear(int endYear) {
			this.endYear = endYear;
		}
		public String getSector() {
			return sector;
		}
		public void setSector(String sector) {
			this.sector = sector;
		}
		public float getCityLng() {
			return cityLng;
		}
		public void setCityLng(float cityLng) {
			this.cityLng = cityLng;
		}
		public float getCityLat() {
			return cityLat;
		}
		public void setCityLat(float cityLat) {
			this.cityLat = cityLat;
		}
		public String getInsight() {
			return insight;
		}
		public void setInsight(String insight) {
			this.insight = insight;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getStartYear() {
			return startYear;
		}
		public void setStartYear(int startYear) {
			this.startYear = startYear;
		}
		public int getImpact() {
			return impact;
		}
		public void setImpact(int impact) {
			this.impact = impact;
		}
		public String getAdded() {
			return added;
		}
		public void setAdded(String added) {
			this.added = added;
		}
		public String getPublished() {
			return published;
		}
		public void setPublished(String published) {
			this.published = published;
		}
		public String getPestle() {
			return pestle;
		}
		public void setPestle(String pestle) {
			this.pestle = pestle;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setId(Long id) {
			this.id = id;
		}
}
		
		