
$('.datepick').each(function(){
	$(this).datepicker({
        changeMonth: true,
        changeYear: true,
        showButtonPanel: true,
        dateFormat: 'yymm',
        onClose: function() {
            var iMonth = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
            var iYear = $("#ui-datepicker-div .ui-datepicker-year :selected").val();

            $(this).datepicker('setDate', new Date(iYear, iMonth, 1));
        }
    });
});   

   
   
   
   




