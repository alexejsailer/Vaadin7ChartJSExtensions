window.org_test_chartjs_ChartJSExtension = function() {

	var MONTHS = [ "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December" ];

	var randomScalingFactor = function() {
		return Math.round(Math.random() * 100);
		// return 0;
	};
	var randomColorFactor = function() {
		return Math.round(Math.random() * 255);
	};
	var randomColor = function(opacity) {
		return 'rgba(' + randomColorFactor() + ',' + randomColorFactor() + ','
				+ randomColorFactor() + ',' + (opacity || '.3') + ')';
	};

	var config = {
		type : 'line',
		data : {
			labels : [ "January", "February", "March", "April", "May", "June",
					"July" ],
			datasets : [
					{
						label : "My First dataset",
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor() ],
						fill : false,
						borderDash : [ 5, 5 ],
					},
					{
						hidden : true,
						label : 'hidden dataset',
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor() ],
					},
					{
						label : "My Second dataset",
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor() ],
					} ]
		},
		options : {
			responsive : true,
			title : {
				display : true,
				text : 'Chart.js Line Chart'
			},
			tooltips : {
				mode : 'label',
				callbacks : {
				// beforeTitle: function() {
				// return '...beforeTitle';
				// },
				// afterTitle: function() {
				// return '...afterTitle';
				// },
				// beforeBody: function() {
				// return '...beforeBody';
				// },
				// afterBody: function() {
				// return '...afterBody';
				// },
				// beforeFooter: function() {
				// return '...beforeFooter';
				// },
				// footer: function() {
				// return 'Footer';
				// },
				// afterFooter: function() {
				// return '...afterFooter';
				// },
				}
			},
			hover : {
				mode : 'dataset'
			},
			scales : {
				xAxes : [ {
					display : true,
					scaleLabel : {
						show : true,
						labelString : 'Month'
					}
				} ],
				yAxes : [ {
					display : true,
					scaleLabel : {
						show : true,
						labelString : 'Value'
					},
					ticks : {
						suggestedMin : -10,
						suggestedMax : 250,
					}
				} ]
			}
		}
	};

	$.each(config.data.datasets, function(i, dataset) {
		dataset.borderColor = randomColor(0.4);
		dataset.backgroundColor = randomColor(0.5);
		dataset.pointBorderColor = randomColor(0.7);
		dataset.pointBackgroundColor = randomColor(0.5);
		dataset.pointBorderWidth = 1;
	});

	$('#randomizeData').click(function() {
		$.each(config.data.datasets, function(i, dataset) {
			dataset.data = dataset.data.map(function() {
				return randomScalingFactor();
			});

		});

		window.myLine.update();
	});

	this.changeDataSet = function() {
		config.data = {
			labels : [ "July", "August", "September", "October", "November",
					"December" ],
			datasets : [
					{
						label : "My First dataset",
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor() ],
						fill : false,
					},
					{
						label : "My Second dataset",
						fill : false,
						data : [ randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor(),
								randomScalingFactor(), randomScalingFactor() ],
					} ]
		};

		$.each(config.data.datasets, function(i, dataset) {
			dataset.borderColor = randomColor(0.4);
			dataset.backgroundColor = randomColor(0.5);
			dataset.pointBorderColor = randomColor(0.7);
			dataset.pointBackgroundColor = randomColor(0.5);
			dataset.pointBorderWidth = 1;
		});

		// Update the chart
		window.myLine.update();
	}

	$('#addDataset').click(function() {
		var newDataset = {
			label : 'Dataset ' + config.data.datasets.length,
			borderColor : randomColor(0.4),
			backgroundColor : randomColor(0.5),
			pointBorderColor : randomColor(0.7),
			pointBackgroundColor : randomColor(0.5),
			pointBorderWidth : 1,
			data : [],
		};

		for (var index = 0; index < config.data.labels.length; ++index) {
			newDataset.data.push(randomScalingFactor());
		}

		config.data.datasets.push(newDataset);
		window.myLine.update();
	});

	$('#removeDataset').click(function() {
		config.data.datasets.splice(0, 1);
		window.myLine.update();
	});

	$('#removeData').click(function() {
		config.data.labels.splice(-1, 1); // remove the label first

		config.data.datasets.forEach(function(dataset, datasetIndex) {
			dataset.data.pop();
		});

		window.myLine.update();
	});

	var data = {
		labels : [ "January", "February", "March", "April", "May", "June",
				"July" ],
		datasets : [ {
			label : "My First dataset",
			fill : false,
			lineTension : 0.1,
			backgroundColor : "rgba(75,192,192,0.4)",
			borderColor : "rgba(75,192,192,1)",
			borderCapStyle : 'butt',
			borderDash : [],
			borderDashOffset : 0.0,
			borderJoinStyle : 'miter',
			pointBorderColor : "rgba(75,192,192,1)",
			pointBackgroundColor : "#fff",
			pointBorderWidth : 1,
			pointHoverRadius : 5,
			pointHoverBackgroundColor : "rgba(75,192,192,1)",
			pointHoverBorderColor : "rgba(220,220,220,1)",
			pointHoverBorderWidth : 2,
			pointRadius : 1,
			pointHitRadius : 10,
			data : [ 65, 59, 80, 81, 56, 55, 40 ],
		} ]
	};

	this.drawLine = function(options) {

		var connectorId = this.getParentId();

		var element = this.getElement("myPanel");
		$("#myPanel").append("<canvas id='canvas' width='500' height='350'></canvas>");

		var ctx = document.getElementById("canvas").getContext("2d");
		var myOptions = config.options;
		config = this.getState().configuration;
//		config.options = myOptions;
//		config.data = data;
		window.myLine = new Chart(ctx, config);

	}

	this.addData = function() {
		if (config.data.datasets.length > 0) {
			MONTHS = this.getState().axisLabels;
			// config.data.labels = this.getState().axisLabels;
			var month = MONTHS[config.data.labels.length % MONTHS.length];
			config.data.labels.push(month);

			$.each(config.data.datasets, function(i, dataset) {
				dataset.data.push(randomScalingFactor());
			});

			window.myLine.update();
		}

	}

}