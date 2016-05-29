package org.test.chartjs.configuration;

public class ChartDataset {

	private String label = null;
	private Boolean fill = null;
	private Double lineTension = null;
	private String backgroundColor = null;
	private String borderColor = null;
	private String borderCapStyle = null;
	private Double[] borderDash = null;
	private Double borderDashOffset = null;
	private String borderJoinStyle = null;
	private String pointBorderColor = null;
	private String pointBackgroundColor = null;
	private Double pointBorderWidth = null;
	private Double pointHoverRadius = null;
	private String pointHoverBackgroundColor = null;
	private String pointHoverBorderColor = null;
	private Double pointHoverBorderWidth = null;
	private Double pointRadius = null;
	private Double pointHitRadius = null;
	private Double[] data = null;

	public void initDefaultValues() {
		label = "My First dataset";
		lineTension = new Double(0.1d);
		backgroundColor = "rgba(75,192,192,0.4)";
		borderColor = "rgba(75,192,192,1)";
		borderCapStyle = "butt";
		borderDash = new Double[0];
		borderDashOffset = new Double(0.0);
		borderJoinStyle = "miter";
		pointBorderColor = "rgba(75,192,192,1)";
		pointBackgroundColor = "#fff";
		pointBorderWidth = new Double(1d);
		pointHoverRadius = new Double(5d);
		pointHoverBackgroundColor = "rgba(75,192,192,1)";
		pointHoverBorderColor = "rgba(220,220,220,1)";
		pointHoverBorderWidth = new Double(2d);
		;
		pointRadius = new Double(1d);
		;
		pointHitRadius = new Double(10d);
		;
		data = new Double[] { 65d, 59d, 80d, 81d, 56d, 55d, 40d };
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getFill() {
		return fill;
	}

	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	public Double getLineTension() {
		return lineTension;
	}

	public void setLineTension(Double lineTension) {
		this.lineTension = lineTension;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public Double[] getData() {
		return data;
	}

	public void setData(Double[] data) {
		this.data = data;
	}

	public String getPointBorderColor() {
		return pointBorderColor;
	}

	public void setPointBorderColor(String pointBorderColor) {
		this.pointBorderColor = pointBorderColor;
	}

	public String getPointBackgroundColor() {
		return pointBackgroundColor;
	}

	public void setPointBackgroundColor(String pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	public String getBorderCapStyle() {
		return borderCapStyle;
	}

	public void setBorderCapStyle(String borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
	}

	public Double[] getBorderDash() {
		return borderDash;
	}

	public void setBorderDash(Double[] borderDash) {
		this.borderDash = borderDash;
	}

	public Double getBorderDashOffset() {
		return borderDashOffset;
	}

	public void setBorderDashOffset(Double borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
	}

	public Double getPointBorderWidth() {
		return pointBorderWidth;
	}

	public void setPointBorderWidth(Double pointBorderWidth) {
		this.pointBorderWidth = pointBorderWidth;
	}

	public String getBorderJoinStyle() {
		return borderJoinStyle;
	}

	public void setBorderJoinStyle(String borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
	}

	public Double getPointHoverRadius() {
		return pointHoverRadius;
	}

	public void setPointHoverRadius(Double pointHoverRadius) {
		this.pointHoverRadius = pointHoverRadius;
	}

	public String getPointHoverBackgroundColor() {
		return pointHoverBackgroundColor;
	}

	public void setPointHoverBackgroundColor(String pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	public String getPointHoverBorderColor() {
		return pointHoverBorderColor;
	}

	public void setPointHoverBorderColor(String pointHoverBorderColor) {
		this.pointHoverBorderColor = pointHoverBorderColor;
	}

	public Double getPointHoverBorderWidth() {
		return pointHoverBorderWidth;
	}

	public void setPointHoverBorderWidth(Double pointHoverBorderWidth) {
		this.pointHoverBorderWidth = pointHoverBorderWidth;
	}

	public Double getPointRadius() {
		return pointRadius;
	}

	public void setPointRadius(Double pointRadius) {
		this.pointRadius = pointRadius;
	}

	public Double getPointHitRadius() {
		return pointHitRadius;
	}

	public void setPointHitRadius(Double pointHitRadius) {
		this.pointHitRadius = pointHitRadius;
	}

}
