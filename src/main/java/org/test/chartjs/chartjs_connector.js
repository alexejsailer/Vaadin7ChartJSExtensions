window.org_test_chartjs_ChartJSExtension = function() {

	var randomScalingFactor = function() {
		return Math.round(Math.random() * 100);
	};

	this.drawLine = function(options) {
		var connectorId = this.getParentId();
		var element = this.getElement("myPanel");
		$("#myPanel").append(
				"<canvas id='canvas' width='500' height='350'></canvas>");
		var ctx = document.getElementById("canvas").getContext("2d");
		config = this.getState().configuration;
		window.myLine = new Chart(ctx, config);
	}

	this.addData = function() {
		if (config.data.datasets.length > 0) {
			MONTHS = this.getState().axisLabels;
			var month = MONTHS[config.data.labels.length % MONTHS.length];
			config.data.labels.push(month);
			$.each(config.data.datasets, function(i, dataset) {
				dataset.data.push(randomScalingFactor());
			});
			window.myLine.update();
		}
	}

}