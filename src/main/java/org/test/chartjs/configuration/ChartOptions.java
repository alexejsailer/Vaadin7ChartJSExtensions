package org.test.chartjs.configuration;

public class ChartOptions {

	private Boolean showLines = null;
	private Boolean stacked = null;
	private ChartHover hover = null;
	private Boolean responsive = null;
	private ChartData title = null;

	public Boolean getShowLines() {
		return showLines;
	}

	public void setShowLines(Boolean showLines) {
		this.showLines = showLines;
	}

	public Boolean getStacked() {
		return stacked;
	}

	public void setStacked(Boolean stacked) {
		this.stacked = stacked;
	}

	public ChartHover getHover() {
		return hover;
	}

	public void setHover(ChartHover hover) {
		this.hover = hover;
	}

	public Boolean getResponsive() {
		return responsive;
	}

	public void setResponsive(Boolean responsive) {
		this.responsive = responsive;
	}

	public ChartData getTitle() {
		return title;
	}

	public void setTitle(ChartData title) {
		this.title = title;
	}

}
