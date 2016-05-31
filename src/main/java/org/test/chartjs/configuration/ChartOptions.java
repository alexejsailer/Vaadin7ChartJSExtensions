package org.test.chartjs.configuration;

public class ChartOptions {

	private Boolean showLines = null;
	private Boolean stacked = null;
	private ChartHover hover = null;
	private Boolean responsive = null;
	private ChartTitle title = null;
	private ChartTooltips tooltips = null;
	private ChartScales scales = null;
	
	public ChartOptions() {
		initDefaultValues();
	}
	
	public void initDefaultValues() {
		responsive = true;
		title = new ChartTitle();
		tooltips = new ChartTooltips();
		hover = new ChartHover();
		scales = new ChartScales();
	}

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

	public ChartTitle getTitle() {
		return title;
	}

	public void setTitle(ChartTitle title) {
		this.title = title;
	}

	public ChartTooltips getTooltips() {
		return tooltips;
	}

	public void setTooltips(ChartTooltips tooltips) {
		this.tooltips = tooltips;
	}

	public ChartScales getScales() {
		return scales;
	}

	public void setScales(ChartScales scales) {
		this.scales = scales;
	}
	
}
