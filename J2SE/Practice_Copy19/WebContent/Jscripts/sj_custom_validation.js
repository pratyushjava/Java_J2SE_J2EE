// Custom booking component validation

var Airports	= buildAirports();
var searchText 	= new Object();
var searchPrefs	= new Object();
captureSearchText(searchText);
captureSearchPrefs(searchPrefs);

function SetDefenseMode()
{
	if(document.skylightsForm.chkDefense.checked)
	{
		document.skylightsForm.mode.value	= 'DEFENSE';
	}
	else
	{
		document.skylightsForm.mode.value	= 'RFSO';
	}    
}

//  Parameter: 
//	mkt : 1 - outbound
//	      2 - Inbound

function SetMarket(market)
{
    document.skylightsForm.numberMarkets.value = market;
    
    if(market == 1)
    {
        document.skylightsForm.departDate2text.disabled = "disabled";
    }
    else
    {
        document.skylightsForm.departDate2text.disabled = "";
    }
}

function getDestinations(mkt)
{
	var fromList		= document.getElementById( "from" + mkt + "Select" );

	//one roundtrip, this is called for market2, but we have hidden the controls
	if (!fromList)
	{
		return;
	}

	var toList		= document.getElementById( "to" + mkt + "Select" );
	var orig		= fromList.options[ fromList.selectedIndex ].value;
	//var dest		= toList.options[ toList.selectedIndex ].value;
	var dest		= eval( "document.skylightsForm.toCity" + mkt + ".value" );
	
	toList.length	= 1;
	//toList.options[0]		= new Option("Destination");
	toList.options[0]		= new Option("to");
	toList.options[0].value	= "???"
	/* modified with style property */
    toList.options[0].style.color = "gray"

	if ( fromList.selectedIndex == 0 )
	{
		for (var i = 0; i < Airports.length; i++)
		{
			toList.length	+= 1;
			var l_ix		= toList.length - 1;
			var opt_str		= Airports[i].name;

			toList.options[l_ix]	= new Option( opt_str );
			toList.options[l_ix].value	= Airports[i].code;

			if ( dest == Airports[i].code )
			{
				toList.selectedIndex	= l_ix;
			}
		}
	}
	else
	{
		var air		= getAirport( orig );
		for (var i = 0; i < air.dests.length; i++)
		{
			dest_air		= getAirport( air.dests[i] );
			toList.length	+= 1;
			var l_ix		= toList.length - 1;
			var opt_str		= dest_air.name;

			toList.options[l_ix]	= new Option( opt_str );
			toList.options[l_ix].value	= dest_air.code;

			if ( dest == dest_air.code )
			{
				toList.selectedIndex	= l_ix;
			}
		}
	}
}

function setDestination(mkt)
{
    var toList		= document.getElementById( "to" + mkt + "Select" );
    eval( "document.skylightsForm.toCity" + mkt + ".value = toList.value");
}

	function validCities()
	{
		var is_valid	= true;
		if ( document.skylightsForm.from1.selectedIndex == 0 )
		{
			alert( searchText.missingDepartCity );
			is_valid	= false;
		}
		else if ( document.skylightsForm.to1.selectedIndex == 0 )
		{
			alert( searchText.missingArriveCity );
			is_valid	= false;
		}
		else if ((searchPrefs.OFFER_OPEN_JAW_ROUTES == "true") && (document.skylightsForm.travel[2].checked))
		{
			is_valid = validateOpenJawConnections();
		}
		
		return is_valid;
	}

	function validPax()
	{
		var adults = document.skylightsForm.ADULT.value;
		var infants = document.skylightsForm.INFANT.value;
		var paxTotal = 0;
		
		for (i = 0; i < searchPrefs.paxTypes.length; i++)
		{
			var paxType 	= searchPrefs.paxTypes[i];
			var paxSelect	= document.getElementById(paxType +"Select");
			paxTotal		= eval(paxTotal) + eval(paxSelect.options[paxSelect.selectedIndex].value);
		}
		if(searchText.member_check == "on")
		{
			if(document.skylightsForm.chkVoucher)
			{
				if(document.skylightsForm.chkVoucher.checked)
				{
					if(paxTotal > 4)
					{
						alert("Maximum of 4 passengers(Adults + Children) are allowed for voucher booking");
						return false;
					}

				}
			}
		}
		else
		{
			if ((paxTotal > searchPrefs.MAX_PASSENGERS_ALLOWED) && ( searchPrefs.MAX_PASSENGERS_ALLOWED > 0 ))
			{
				alert("\n"	+ searchText.popup_max_passenger_amount_1
							+ searchPrefs.MAX_PASSENGERS_ALLOWED
							+ searchText.popup_max_passenger_amount_2 + "\n");
				return false;
			}

			if ( paxTotal < 1)
			{
				alert(searchText.popup_missing_passenger_amount);
				return false;
			}

			if ( (adults  / infants) < 1 )
			{
				alert(searchText.popup_too_many_infants);
				document.skylightsForm.INFANT.focus();
				/*
				// If there is a default, reset it
				if( document.skylightsForm.defaultADULT.value > -1 )
				{
					var adultSelect = document.skylightsForm.ADULT;
					for(x1=0; x1 < adultSelect.length; x1++)
					{
						if( adultSelect[x1].value == document.skylightsForm.defaultADULT.value )
						{
							document.skylightsForm.ADULT.selectedIndex = x1;
							break;
						}
					}
				}
				
				var infantSelect = document.skylightsForm.INFANT;
				for(x2=0; x2 < infantSelect.length; x2++)
				{
					if( (document.skylightsForm.defaultINFANT.value == -1 && infantSelect[x2].value == 0) || 
						(document.skylightsForm.defaultINFANT.value != -1 && infantSelect[x2].value == document.skylightsForm.defaultINFANT.value) )
					{
						document.skylightsForm.INFANT.selectedIndex = x2;
						break;
					}
				}*/	
				return false;
		}
			
		}

		return true;
	}
	
	function validateDates(beginDate, endDate)
	{
		var is_valid			= true;
		var beginDateString		= new String (beginDate);
		var endDateString		= new String (endDate);
		
		var fromDate = document.getElementById("departDate1text");
		var toDate = document.getElementById("departDate2text");
		
		//alert(fromDate.value);
		//alert(toDate.value);
		
		if(fromDate.value == "")
		{
		    alert("Please enter begin date");
		    is_valid = false;
		}
		else if(isRoundTrip() && (toDate.value == ""))
		{
		    alert("Please enter end date");
		    is_valid = false;
		}
		
		if(isRoundTrip() && (fromDate == toDate))
		{
            is_valid = confirm( searchText.sameDayWarning );
		}
		
		return is_valid;
	}

	function validDates(beginDate, endDate)
	{
		var is_valid			= true;
		var beginDateString		= new String (beginDate);
		var endDateString		= new String (endDate);


		var departDateString	= captureDateString("departDay1", "departMonth1");
		var arriveDateString	= captureDateString("departDay2", "departMonth2");

		date_message = searchText.popup_pre_flight_date_1 +
						searchText.popup_initial_flight_date +
						searchText.popup_pre_flight_date_2;
						
		if ( departDateString < beginDateString )
		{
			alert( date_message );
			setDate( "departDay1", "departMonth1", beginDateString );
			if( isRoundTrip() && arriveDateString < beginDateString )
				setDate( "departDay2", "departMonth2", beginDateString );
			return false;
		}

		if ( searchPrefs.final_date_used )
		{
			if( departDateString > endDateString )
			{
				is_valid = false;
				setDate( "departDay1", "departMonth1", endDateString );
			}
			if( isRoundTrip() && ( arriveDateString > endDateString ) )
			{
				is_valid = false;
				setDate( "departDay2", "departMonth2", endDateString );
			}
			if( !is_valid )
			{
				alert( searchText.popup_post_live_flight_date_1 +
						searchText.popup_final_flight_date +
						searchText.popup_post_live_flight_date_2 );
				return false;
			}
		}

		// check that dates are valid calandar dates
		if(!validateCalendarDate("departDay1", "departMonth1", true, true))
		{
			if( isRoundTrip() || ( !isOneWay() && searchPrefs.OFFER_OPEN_JAW_ROUTES == 'true' ) )
			{
				validateCalendarDate("departDay2", "departMonth2", false, true);
			}
			return false;
		}
		if(	( isRoundTrip() || ( !isOneWay() && searchPrefs.OFFER_OPEN_JAW_ROUTES == 'true' ) ) && !validateCalendarDate("departDay2", "departMonth2", true, true) )
		{
			return false;
		}

		if ( isRoundTrip() || ( !isOneWay() && searchPrefs.OFFER_OPEN_JAW_ROUTES == 'true' ) )
		{
			if ( !validateDateOverlap("departDay1", "departMonth1", "departDay2", "departMonth2", true, true) )
			{
				return false;
			}
			else if ( searchText.sameDayWarning && arriveDateString == '' + departDateString )
			{
				is_valid		= confirm( searchText.sameDayWarning );
			}
		}
		
		return is_valid;
	}

function isOneWay()
{
	return ( document.skylightsForm.travel[1].checked );
}

function isRoundTrip()
{
	return ( document.skylightsForm.travel[0].checked );
}


function captureSearchText(searchText)
	{
		searchText.missingDepartCity 			= "\nPlease select the city you will be departing from.\n";
		searchText.missingArriveCity 			= "\nPlease select the city you will be arriving to.\n";
		searchText.popup_max_passenger_amount_1	= "You are allowed a maximum of ";
		searchText.popup_max_passenger_amount_2	= " passengers\nper booking online. If your party is larger\nthan this, please call our reservation center.";
		searchText.popup_missing_passenger_amount = "You must enter at least one passenger.";	
		searchText.popup_too_many_infants	= "If you wish to book a greater number of\nInfants than Adults, please contact our\nreservation center for possible arrangements.";
		searchText.popup_illogical_open_jaw	= "The selected outbound and return city pairs\nare not logical. You should either return to the \nsame city you fly out from, or return from the\nsame city you fly into.\n";
		searchText.popup_pre_flight_date_1 = "Please select a flight departing \non ";
		searchText.popup_pre_flight_date_2 = " or later. \n\nClick OK to reset your date selection.";
		searchText.popup_post_live_flight_date_1 = "All flights are currently scheduled for\n";
		searchText.popup_post_live_flight_date_2 = " or earlier. \n\nClick OK to reset your date selection.";
		searchText.popup_initial_flight_date	= "Tuesday, 31 August 2010";
		searchText.popup_final_flight_date		= "Thursday, 30 June 2011";
		searchText.popup_flight_or_orig_dest	= "Please enter a flight number or\nselect cities of origin and/or destination.";
		searchText.popup_invalid_city_pair		= "Your origin and destination cities\nare the same. Please change one or\nthe other.";
		searchText.popup_oneway				= "This mode allows only one way tickets to be booked.";
		searchText.popup_roundtrip				= "This mode allows only round trip tickets to be booked.";
		searchText.months 						= new Array();
		searchText.months[0]					= "January";
		searchText.months[1]					= "February";
		searchText.months[2]					= "March";
		searchText.months[3]					= "April";
		searchText.months[4]					= "May";
		searchText.months[5]					= "June";
		searchText.months[6]					= "July";
		searchText.months[7]					= "August";
		searchText.months[8] 					= "September";
		searchText.months[9]					= "October";
		searchText.months[10]					= "November";
		searchText.months[11]					= "December";
		searchText.sameDayWarning	 			= 		"\nYour return date is\nthe same as your departure date.\n\nIs such a short trip intentional?\n";
		searchText.popup_traveldates_missing		= ""; 

		
		searchText.member_check 	= "off";
		
	}
	
	
function captureSearchPrefs(searchPrefs)
	{
		searchPrefs.ALLOWED_TRAVEL_TYPES = 'STANDARD';
		searchPrefs.OFFER_OPEN_JAW_ROUTES 		= 'false';
		searchPrefs.DISPLAY_AIRPORT_CITY_CODES 	= 'false';
		searchPrefs.MAX_PASSENGERS_ALLOWED 		= '9';
		searchPrefs.paxTypes					= [];
		searchPrefs.initial_date_used			= '';
		searchPrefs.final_date_used				= '';
		searchPrefs.allow_todays_date			= 'true';
		
		searchPrefs.paxTypes.push("ADULT");
		searchPrefs.paxTypes.push("CHILD");
	}

function AlertToday()
{
    var dd, mm, yyyy;
    
    var beginDate = document.skylightsForm.departDate1text.value;
    
    if(beginDate != "")
    {
        dd = new Number(beginDate.substr(0,2));
        mm = new Number(beginDate.substr(3,2));
        yyyy = new Number(beginDate.substr(6,4));
    }
    
    var today = new Date();
    
    if((today.getDate() == dd) && ((today.getMonth()+1) == mm) && (today.getFullYear() == yyyy))
    {
        alert("\nBecause today\'s date has been selected, only \nflights that leave today at least 2 hours 00 minutes\nfrom the current time will be shown on the next page.\n");
    }    
}	


function validateAndSubmit(beginDate, endDate)
{
    //DebugDates();
    var roundtrip = "";

    if (validCities() && validateDates(beginDate, endDate) && validPax())
    {
        AlertToday();
    
        if(isOneWay() && (!document.skylightsForm.chkDefense.checked) && (document.skylightsForm.hdnLTC.value != 'true') && (document.skylightsForm.hdnTBF.value != 'true'))
        {
            roundtrip = confirm("Book a return flight and save up to Rs. 1000.\nClick ‘OK’ to proceed with your selection or 'Cancel' to modify and avail of this limited period offer.");
        }
        else
        {
            roundtrip = "true";
        }

        if(roundtrip)
        {
            document.skylightsForm.page.value 	= 'SEARCH';
            document.skylightsForm.module.value	= 'SB';

            if(document.skylightsForm.chkDefense.checked)
            {
                document.skylightsForm.mode.value	= 'DEFENSE';
            }
            else if( document.skylightsForm.hdnCorporate.value == 'true')
            {
                document.skylightsForm.mode.value	= 'CORPORATE';
            }
            else if( document.skylightsForm.hdnTBF.value == 'true')
            {
                document.skylightsForm.mode.value	= 'TBF';
            }
            else if( document.skylightsForm.hdnLTC.value == 'true')
            {
                document.skylightsForm.mode.value	= 'LTC';
            }
            else if( document.skylightsForm.hdnSPCP.value == 'true')
            {
                document.skylightsForm.mode.value = 'SPCP';
            }
            else if( document.skylightsForm.roundTripRadio.checked)
            {
                document.skylightsForm.mode.value = 'RFSO';
            }

            /************************************************************/
            else
            {
                document.skylightsForm.mode.value	= '';
            }
            
            //DebugDates();

            document.skylightsForm.event.value 	= 'search';
            document.skylightsForm.submit();
        }
        else
        {
            return false;
        }
    }
    else
    {
        return false;
    }
    
}

function DebugDates()
{
    var str = "departDate1text = " + document.skylightsForm.departDate1text.value;
    str = str + "\ndepartDay1 = " + document.skylightsForm.departDay1.value;
    str = str + "\ndepartMonth1 = " + document.skylightsForm.departMonth1.value;
    str = str + "\ndepartDate2text = " + document.skylightsForm.departDate2text.value;
    str = str + "\ndepartDay2 = " + document.skylightsForm.departDay2.value;
    str = str + "\ndepartMonth2 = " + document.skylightsForm.departMonth2.value;
    alert(str);
}
