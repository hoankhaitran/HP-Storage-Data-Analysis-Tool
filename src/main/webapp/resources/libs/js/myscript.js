/**
 * 
 */
$(document).ready(function() {
    $( "#datepicker" ).datepicker({changeMonth: true,changeYear: true,showButtonPanel: true,dateFormat: 'yymm',
    	onClose: function() {
    		
    		        var iMonth = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
    		
    		        var iYear = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
    		
    		        $(this).datepicker('setDate', new Date(iYear, iMonth, 1));
    		
    		     }
	     
     });
    
  });
$(document).on('change', "#monthSelector", function()
	{
		$.get( "newcustomerreport/Storage/"+$('#monthSelector').val(), function( data ) {
			var csv = data["newCustomerReport"];
			var row = "<tr><td>All</td><td>" + csv["allCustomer"]+"</tr>"+"<tr><td>Storage Customers</td><td>" + csv["storageCustomer"]+"</tr>";
	$('#resultTable1 > tbody').html(row);
			});
		

});


$(document).ready(function() {

	$("#selectCalculationType").change(function() {

	});
});

$(document).ready(function() {

	$("#addReportFrag").click(function() {
		// alert(rpt);
		count++;
		$("#report").append("<div><h4>Report Frag " + count + "</h4></div>");
		
		$("#report").append($("#temp").html());

		$("#reportFrag").html("");
		$('#temp').html("");

	});
});
// /////////////////////////////////
var rpt = $("#reportFrag").html();
var count = 0;
var countCal = 0;
$(document).ready(function() {
	var body = $("#reportFrag").html();
	$("#addCalculation").click(function() {
		countCal++;
		var cal = " <div>Calculation" + countCal + "</div>";
		$("#reportFrag").append(cal);

		rpt = $("#reportFrag").html();
		// alert(rpt);
	});
});


$(document)
		.ready(
				function() {
					
					

					$('#selectCalculationType')
							.change(
									function() {
										var selected = $(
												"#selectCalculationType option:selected")
												.val();
										$('#reportControls').show();	
										if (selected == "NewCustomer") {
											$( "#datepicker" ).hide();
											$("#temp")
													.load(
															"/csc191/test #newCustomerTableDiv");

										}
										if (selected == "CustomerEnvironmentSize") {
											$("#temp")
													.load(
															"/csc191/test #customerEnvSizeDiv");
											$( "#datepicker" ).show();
											$
													.ajax(
															{
																url : "/csc191/getAllColumns"
															})
													.then(
															function(data) {
																// alert("Hi");
																var html = '';
																for ( var i in data) {
																	var csv = data[i];
																	html += '<option value="'
																			+ data[i]
																			+ '">'
																			+ data[i]
																			+ '</option>';
																}
																$(
																		'#selectColumnDropbox')
																		.html(
																				html);
																$(
																		'#selectColumnDropbox')
																		.show();

																$(
																		'#CustomerEnvironmentSizeControl')
																		.show();

															});
										}
									});
				});

$(document).on('click', "#addColumn", function() {
	addRowToTable($('#selectColumnDropbox :selected').text());

});

$(document).ready(function() {

	$("#saveReport").click(function() {
		saveHtml();
		// alert("not yet implemented");

	});
});

function addRowToTable(rowName) {

	var row = "<tr><td>" + rowName + "</td></tr>";
	$.ajax(
			{
				url : "/csc191/report/"
						+ $('#selectColumnDropbox :selected').text()
						+ "/dateReported/" + $('#datepicker').val()
			}).fail(function() {
		alert("Non numeric value or NULL ");
	}).then(
			function(data) {
				var csv = data["customerEnvReport"];
				row = "<tr><td>" + rowName + "</td><td>" + csv["sum"]
						+ "</td><td>" + csv["avg"] + "</td><td>" + csv["max"]
						+ "</td><td>" + csv["count"] + "</td></tr>";
				$('#resultTable').append(row);

			});

}
function saveHtml() {
	alert($("#report").html());

}

