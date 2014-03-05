


$(document).ready(function() {
    $(".dsat-analyses-type-select > .dropdown-menu a").on("click", function(event) {
        var _clickedItem = $(this);
        var _dropdownButton = _clickedItem.parent().parent().parent();
        //console.log(_clickedItem.html());

        _dropdownButton.find(".dsat-analysis-type-text").text(_clickedItem.text());
        event.preventDefault();
    });

    //$(".dsat-select-column .multiselect").multiselect();
});
