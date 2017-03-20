// JQuery scripts

$(function() {
    // CHANGE MAX END DATE HERE
    // HARDCODED TO END DATE 24-MAR-2011. 
    // NOTE: MONTH IS 0 INDEX BASED. EX: JAN=0, FEB=1
  //  var MAX_END_DATE = new Date(2011, 09, 29);
   // var MAX_END_DATE = new Date(2012, 02, 24);
   //var MAX_END_DATE = new Date(2013, 02, 30);
   var MAX_END_DATE = new Date(2013, 09, 26);

    // INITIALIZE START DATE CALENDAR DATEPICKER 
    $("#departDate1text").datepicker({
        onSelect: function(dateText, inst) {
            // PARSE YYYYMM & DD INTO TWO DIFFERENT VARIABLES
            var date1 = new Date(Date.parse($(this).datepicker('getDate')));
            var date2 = new Date(Date.parse($("#departDate2text").datepicker('getDate')));

            $("#departMonth1Select").val($.datepicker.formatDate('yymm', date1));
            $("#departDay1Select").val($.datepicker.formatDate('dd', date1));

            //alert("Date1 selector");
            //alert(date1);
            //alert(date2);

            $("#departDate2text").datepicker("option", "minDate", date1);

            // SET MIN DATE OF TO CALENDAR
            if (date2 < date1) {
                //alert("Date2 less than Date1");
                $("#departDate2text").val($.datepicker.formatDate('dd-mm-yy', date1));
                $("#departMonth2Select").val($.datepicker.formatDate('yymm', date1));
                $("#departDay2Select").val($.datepicker.formatDate('dd', date1));
            }

        }
    });

    $("#departDate1text").datepicker("option", "dateFormat", 'dd-mm-yy');
    $("#departDate1text").datepicker("option", "maxDate", MAX_END_DATE);
    //$("#departDate1text").datepicker("option", "showOtherMonths", false);
//    $("#departDate1text").datepicker("option", "numberOfMonths", [1, 2]);
    $("#departDate1text").datepicker("option", "numberOfMonths", 1);
    $("#departDate1text").datepicker("option", "minDate", new Date());
    $("#departDate1text").datepicker("option", "hideIfNoPrevNext", true);
    //$("#departDate1text").datepicker( "option", "changeMonth", true );
    //$("#departDate1text").datepicker( "option", "changeYear", true );

	 $("#departDate1text").datepicker("option", "changeMonth", true);
    $("#departDate1text").datepicker("option", "changeYear", true);

    // INITIALIZE END DATE CALENDAR DATEPICKER 
    $("#departDate2text").datepicker({
        onSelect: function(dateText, inst) {
            //alert("First date selected.");
            //$("#departDate1text").datepicker( "option", "maxDate", dateText );

            var theDate = new Date(Date.parse($(this).datepicker('getDate')));
            $("#departMonth2Select").val($.datepicker.formatDate('yymm', theDate));
            $("#departDay2Select").val($.datepicker.formatDate('dd', theDate));
        }
    });
    $("#departDate2text").datepicker("option", "dateFormat", 'dd-mm-yy');
    $("#departDate2text").datepicker("option", "maxDate", MAX_END_DATE);
    $("#departDate2text").datepicker("option", "showOtherMonths", false);
 //   $("#departDate2text").datepicker("option", "numberOfMonths", [1, 2]);
    $("#departDate2text").datepicker("option", "numberOfMonths", 1);
    $("#departDate2text").datepicker("option", "minDate", new Date());
    $("#departDate2text").datepicker("option", "hideIfNoPrevNext", true);
    //$("#departDate2text").datepicker( "option", "changeMonth", true );
    //$("#departDate2text").datepicker( "option", "changeYear", true );

	$("#departDate2text").datepicker("option", "changeMonth", true);
    $("#departDate2text").datepicker("option", "changeYear", true);

    // ON LOAD INITIALIZE WITH TODAY'S DATE		
    //    var todayDate = new Date();
    //    $("#departDate1text").val($.datepicker.formatDate('dd-mm-yy', todayDate));
    //    $("#departDate2text").val($.datepicker.formatDate('dd-mm-yy', todayDate));
    //    $("#departMonth1Select").val($.datepicker.formatDate('yymm', todayDate));
    //    $("#departDay1Select").val($.datepicker.formatDate('dd', todayDate));
    //    $("#departMonth2Select").val($.datepicker.formatDate('yymm', todayDate));
    //    $("#departDay2Select").val($.datepicker.formatDate('dd', todayDate));

    setToDate();
    setFromDate();

//    $("#from1Select").change();
//Commented by Mallik on 19DEC2012 to fix the destination page dropdown issue

    // FROM DROP DOWN CHANGE EVENT HANDLER
    $("#from1Select").change(function() {
        hideDefence(getAirport($(this).val()), getAirport($("#to1Select").val()));
        //alert("From changed");
    });

    // TO DROPDOWN CHANGE EVENT HANDLER
    $("#to1Select").change(function() {
        hideDefence(getAirport($("#from1Select").val()), getAirport($(this).val()));
        //alert("To changed");
    });

    // ROUNTRIP RADIO BUTTON CLICK EVENT HANDLER
    $("#roundTripRadio").click(function(event) {
        $("#departDate2text").attr("disabled", false);
        $("#numberMarkets").val($(this).val());
    });

    // ONE WAY RADIO BUTTON CLICK EVENT HANDLER
    $("#oneWayRadio").click(function(event) {
        $("#departDate2text").attr("disabled", true);
        $("#numberMarkets").val($(this).val());

        $("#departDate1text").datepicker("option", "maxDate", MAX_END_DATE);
    });

    hideDefence(getAirport($("#from1Select").val()), getAirport($("#to1Select").val()));

});

// FUNCTION TO SHOW/HIDE THE DISCOUNT FOR DEFENCE BLOCK
function hideDefence(fromAirport, toAirport) {

    //var toAirport = element[element.selectedIndex].text;
    //var fromAirport = fromElement[fromElement.selectedIndex].text;

    /*
    if(typeof(toAirport)!="undefined" && typeof(fromAirport)!="undefined")
    alert("From: " + toAirport.name + "\r\nTo: " + fromAirport.name);
    else if(typeof(toAirport)=="undefined" && typeof(fromAirport)!="undefined")
    alert("From: undefined" + "\r\nTo: " + fromAirport.name);
    else if(typeof(toAirport)!="undefined" && typeof(fromAirport)=="undefined")
    alert("From: " + toAirport.name + "\r\nTo: undefined");
    else
    alert("From: undefined\r\nTo: undefined");
    */

    /*
    if((typeof(toAirport)=="undefined") || (typeof(fromAirport)=="undefined"))
    $(".chkindian").show();
    else if(toAirport.international || fromAirport.international)
    $(".chkindian").hide();
    else
    $(".chkindian").show();
    */

//    alert("Hide defence called");

    if ((typeof (toAirport) == "undefined") && (typeof (fromAirport) == "undefined")) {
        $(".chkindian").show();
    }
    else if ((typeof (toAirport) == "undefined") && (typeof (fromAirport) != "undefined")) {
        if (fromAirport.international) {
            $("#chkDefense").attr("checked", false);
            $(".chkindian").hide();
        }
        else
            $(".chkindian").show();
    }
    else if ((typeof (toAirport) != "undefined") && (typeof (fromAirport) == "undefined")) {
        if (toAirport.international) {
            $("#chkDefense").attr("checked", false);
            $(".chkindian").hide();
        }
        else
            $(".chkindian").show();
    }
    else if ((typeof (toAirport) != "undefined") && (typeof (fromAirport) != "undefined")) {
        if (toAirport.international || fromAirport.international) {
            $("#chkDefense").attr("checked", false);
            $(".chkindian").hide();
        }
        else
            $(".chkindian").show();
    }

}

// FUNCTION TO LOAD DATE FROM HIDDEN VAR OR SET DEFAULT DATE
function setToDate() {

    if ($("#departDate1text").val() != "")
        return;
    
    var newdate = new Date();

//    alert($("#departMonth1Select").val());
//    alert($("#departDay1Select").val());

    if (typeof ($("#departMonth1Select").val()) != "undefined"
        && typeof ($("#departDay1Select").val()) != "undefined"
        && ($("#departMonth1Select").val().length > 0)
        && ($("#departDay1Select").val().length > 0)) {

        var yy = Number($("#departMonth1Select").val().substring(0, 4));
        var mm = Number($("#departMonth1Select").val().substring(4, 6));
        var dd = Number($("#departDay1Select").val());

//        alert("set to date");
//        alert(yy);
//        alert(mm);
//        alert(dd);

        newdate = new Date(yy, mm - 1, dd, 0, 0, 0);
    }

//    alert("new date");
//    alert(newdate);

    $("#departDate1text").val($.datepicker.formatDate('dd-mm-yy', newdate));
    $("#departMonth1Select").val($.datepicker.formatDate('yymm', newdate));
    $("#departDay1Select").val($.datepicker.formatDate('dd', newdate));
}

// FUNCTION TO LOAD DATE FROM HIDDEN VAR OR SET DEFAULT DATE
function setFromDate() {

    if ($("#departDate2text").val() != "")
        return;

    var newdate = new Date();

//    alert($("#departMonth2Select").val());
//    alert($("#departDay2Select").val());

    if (typeof ($("#departMonth2Select").val()) != "undefined"
        && typeof ($("#departDay2Select").val()) != "undefined"
        && ($("#departMonth2Select").val().length > 0)
        && ($("#departDay2Select").val().length > 0)) {

        var yy = Number($("#departMonth2Select").val().substring(0, 4));
        var mm = Number($("#departMonth2Select").val().substring(4, 6));
        var dd = Number($("#departDay2Select").val());

//        alert("set from date");
//        alert(yy);
//        alert(mm);
//        alert(dd);

        newdate = new Date(yy, mm - 1, dd, 0, 0, 0);
    }

//    alert("new date");
//    alert(newdate);

    $("#departDate2text").val($.datepicker.formatDate('dd-mm-yy', newdate));
    $("#departMonth2Select").val($.datepicker.formatDate('yymm', newdate));
    $("#departDay2Select").val($.datepicker.formatDate('dd', newdate));
}
