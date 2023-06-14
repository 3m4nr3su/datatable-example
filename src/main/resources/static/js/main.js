/**
 * 
 */
$(document).ready(function() {

	var table = $('#example').DataTable({
		buttons: [
			{
				extend: 'colvisGroup',
				text: 'Show All Months',
				show: ':hidden'
			},
			{
				extend: 'copyHtml5',
				text: 'Copy',
				exportOptions: {
					columns: ':visible'
				}
			},
			{
				extend: 'csvHtml5',
				text: 'CSV',
				exportOptions: {
					columns: ':visible'
				}
			},
			{
				extend: 'excelHtml5',
				text: 'Excel',
				exportOptions: {
					columns: ':visible'
				}
			},
			{
				extend: 'pdfHtml5',
				text: 'PDF',
				exportOptions: {
					columns: ':visible'
				}
			}
		]
	});

	var startDate;
	var endDate;
	function applyRangeLogic(start, end) {
		var table = $('#example').DataTable();
		var columnIndexStart = start.getMonth() + 9;
		var columnIndexEnd = end.getMonth() + 9;

		for (var colIndex = 9; colIndex <= 20; colIndex++) {
			if (colIndex >= columnIndexStart && colIndex <= columnIndexEnd) {
				table.column(colIndex).visible(true);
			} else {
				table.column(colIndex).visible(false);
			}
		}
	}

	$('#datepicker').datepicker({
		dateFormat: 'yy-mm-dd',
		onSelect: function(dateText, inst) {
			if (!startDate || endDate) {
				startDate = new Date(dateText);
				endDate = null;
			} else {
				endDate = new Date(dateText);

				if (startDate > endDate) {
					var temp = startDate;
					startDate = endDate;
					endDate = temp;
				}

				$('#datepicker').val(
					startDate.getFullYear() + '-' + (startDate.getMonth() + 1) + '-' + startDate.getDate() + ' to ' + endDate.getFullYear() + '-' + (endDate.getMonth() + 1) + '-' + endDate.getDate()
				);

				applyRangeLogic(startDate, endDate);
			}
		}
	});
	
	table.buttons().container().appendTo('#example_wrapper');
});