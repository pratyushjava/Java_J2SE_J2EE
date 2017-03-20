/*#############################################################################

FILE:	dateValidation.js

	Copyright (c) 2005 Navitaire Inc. All rights reserved.

	This source code is (i) proprietary to and a trade secret of Navitaire Inc.
	and (ii) protected by copyright law and international treaties.
	Unauthorized disclosure, reproduction, distribution or alteration of this
	source code, or any portion of it, may result in severe civil and criminal
	penalties and will be prosecuted to the maximum extent possible under
	the law.

	www.navitaire.com

DESCRIPTION:

	Contains javascript for dates on the various search forms.

#############################################################################*/

var dateText 	= new Object();
var datePrefs	= new Object();
captureDateText(dateText);
captureDatePrefs(datePrefs);


/*#####################################################################################
# Function: setDate()
#
# Description:
#	Sets the value of a date control dropdown.
#
# Parameters:
#	dayControlName		- Name of a control whose value will be a day of
#					the month. ie '01'
#	monthControlName	- Name of a control whose value will be a month and
#					year in the format yyyyMM. ie '200501'
#	date_str		- The value the controls are going to be set to. ie '20060218'
#
*/
function setDate( dayControlName, monthControlName, date_str )
{
	var mon			= date_str.substr(0,6);
	var day			= date_str.substr(6,2);
	var day_elem	= eval ('document.skylightsForm.' + dayControlName);
	var mon_elem	= eval ('document.skylightsForm.' + monthControlName);

	for (var i=0; i < mon_elem.options.length; i++)
	{
		if ( mon_elem.options[i].value == mon )
		{
			mon_elem.options[i].selected = true;
			break;
		}
	}
	for (var i=0; i < day_elem.options.length; i++)
	{
		if ( day_elem.options[i].value == day )
		{
			day_elem.options[i].selected = true;
			break;
		}
	}
}

/*#####################################################################################
# Function: captureDateString()
#
# Description:
#	Captures the values of the month and day dropdowns and combine them 
#	to be returned as a string.
#
# Parameters:
#	dayControlName		- Name of a control whose value will be a day of
#					the month. ie '01'
#	monthControlName	- Name of a control whose value will be a month and
#					year in the format yyyyMM. ie '200501'
# Returns:
#	date_string		- Date formatted as string. ie '20060208'
#
*/
function captureDateString( dayControlName, monthControlName )
{
	var dateArray	= captureDateArray( dayControlName, monthControlName );
	var date_string	= new String( dateArray[0] + dateArray[1] + dateArray[2] );
	return date_string;
}

/*#####################################################################################
# Function: captureDateArray()
#
# Description:
#	Returns an array with the contents of the date dropdown.
#
# Parameters:
#	dayControlName		- name of a control whose value will be a day of
#					the month. ie '01'
#	monthControlName	- name of a control whose value will be a month and
#					year in the format yyyyMM. ie '200501'
#
# Returns:
#	an Array with the following elements:
#		0: year
#		1: month
#		2: day
*/
function captureDateArray( dayControlName, monthControlName )
{
	var day_elem	= eval ('document.skylightsForm.' + dayControlName);
	var mon_elem	= eval ('document.skylightsForm.' + monthControlName);
	var dateArray	= [];
	dateArray[0]	= mon_elem.options[ mon_elem.selectedIndex ].value.substr(0,4);
	dateArray[1]	= mon_elem.options[ mon_elem.selectedIndex ].value.substr(4,2);
	dateArray[2]	= day_elem.options[ day_elem.selectedIndex ].value;
	
	return dateArray;
}

/*################################################################
#
# Function: isLeapYear()
#
# Description:
#	Checks if a year falls on a leap year.
#
# Parameters:
#	year: The year to be checked.
#
# Returns:
#	0 - Not leap year
#	1 - leap year
#
*/
function isLeapYear(year)
{
	return ( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0 ) );
}

/*#########################################################
#
# Function: numDays()
#
# Description:
#	Returns the number of days in the month
#
# Parameters:
#	month	: The month.
#	year	: The year.
#
# Returns:
#	days: The number of days for the month and year passed.
#
*/
function numDays(month,year)
{
	var leapYear 	= isLeapYear(year);
	var days		= 31;

	if ( month == 2 && days > 29 && leapYear )
	{
		days		= 29;
	}
	else if ( month == 2 && days > 28 && !leapYear)
	{
		days		= 28;
	}
	else if ( month == 4 || month == 6 || month == 9 || month == 11 )
	{
		days		= 30;
	}
	return days;
}


/*#########################################################
#
# Function: isDateValid()
#
# Description:
#	Checks if the date passed is valid.
#
# Parameters:
#	day	: day to check.
#	month	: month to check.
#	year	: year to check.
#
# Returns:
#	okay: 	0 - invalid
#		1 - valid
#
*/
function isDateValid(day,month,year)
{
	var okay = true;
	var leapYear = isLeapYear(year);

	if (day > numDays(month, year))
	{
		okay = false;
	}

	return okay;
}


/*#########################################################
#
# Function: checkCalendarDate()
#
# Description:
#	Checks if the date passed is valid.
#
# Parameters:
#	day	: day to check
#	month	: month to check
#	year	: year to check
# 	errorMsg: optional text to show in error message
#
# Returns:
#	okay: 	0 - invalid
#		1 - valid
#
*/
function checkCalendarDate(day,month,year,errorMsg)
{
	var okay = true;
	if (!isDateValid(day, month, year))
	{
		if (errorMsg != '')
		{
			alert(errorMsg);
		}
		okay = false;
	}
	return okay;
}


/*#########################################################
#
# Function: validateCalendarDate()
#
# Description:
#	Checks if the calendar date is valid.
#
# Parameters:
#	dayControlName		: name of day control to validate
#	monthControlName	: name of month control to validate
#	showError		: true if an error should be show
#	resetDay		: true if day should be reset to a valid value
#
# Returns:
#	okay:	0 - invalid
#		1 - valid
#
*/
function validateCalendarDate(dayControlName, monthControlName, showError, resetDay)
{
	var okay 			= true;
	var dateArray		= captureDateArray(dayControlName, monthControlName);
	var day				= dateArray[2];
	var month			= dateArray[1];
	var year			= dateArray[0];

	if (!isDateValid(day, month, year))
	{
		var maxDays = numDays(month, year);

		if (showError)
		{
			formattedError = eval( "dateText.invalid" + dayControlName ) +
								dateText.months[month-1] +
								dateText.invalidMonthHasOnly + maxDays +
								dateText.invalidMonthHasOnlyDays;

			alert(formattedError);
		}
		if (resetDay)
		{
			var dayControl	= eval ('document.skylightsForm.' + dayControlName);
			dayControl.selectedIndex = maxDays - 1;
		}

		okay = false;
	}
	return okay;
}


/*#########################################################
#
# Function: validateFutureDate()
#
# Description:
#	Validates that the date set it the given controls is after
#	the date in the beginDate string.
#
# Parameters:
#	dayControlName		: name of day control to validate
#	monthControlName	: name of month control to validate
#	beginDate			: date string in format yyyyMMdd to validate against
#	showError			: true if an error should be show
#	resetDay			: true if day should be reset to a valid value
#
# Returns:
#	okay:	0 - invalid
#		1 - valid
#
*/
function validateFutureDate(dayControlName, monthControlName, beginDate, showError, resetDay)
{
	var okay 			= true;
	var beginDateString		= new String (beginDate);
	var departDateString	= captureDateString(dayControlName, monthControlName);

	if ( departDateString < beginDateString )
	{
		if (showError)
		{
			alert( dateText.departDatePast );
		}
		if (resetDay)
		{
			setDate( dayControlName, monthControlName, beginDateString );
		}
		okay		= false;
	}

	return okay;
}

/*#########################################################
#
#
# Function: validateSameDate()
#
# Description:
#	Checks if the outbound and return dates are the same.
#
# Parameters:
#	dayControlName1		: name of day control to validate
#	monthControlName1	: name of month control to validate
#	dayControlName2		: name of day control to validate
#	monthControlName2	: name of month control to validate
#	showError		: true if an error should be shown
#
# Returns:
#	okay:	0 - different date
#		1 - same date
#
*/
function validateSameDate(dayControlName1, monthControlName1, dayControlName2, monthControlName2, showError)
{
	var okay 			= true;
	var firstDateString		= new String (captureDateString(dayControlName1, monthControlName1));
	var secondDateString		= new String (captureDateString(dayControlName2, monthControlName2));
	
	if ( firstDateString.toString() != secondDateString.toString() )
	{
		if (showError)
		{
			alert( 	dateText.datesNotSameDate );
		}
		okay		= false;
	}
	return okay;
}

/*#########################################################
#
#
# Function: validateFutureTime()
#
# Description:
#	Checks if the 2nd time parameter passed occurs in the future
#	with respect to the 1st time parameter.
#	ex. 
#		time 1	time 2	result
#		------	------	------
#		1500	1500	0
#		1500	1700	1
#		1500	1400	0
#
# Parameters:
#	timeValue1		: 1st time parameter (HHMM format)
#	timeValue2		: 2nd time parameter (HHMM format)
#	showError		: true if an error should be shown
#
# Returns:
#	okay:	0 - 2nd time parameter value not a future time
#		1 - 2nd time parameter value is a future time
#
*/
function validateFutureTime(timeValue1, timeValue2, showError)
{
	var okay 			= true;	

	if ( timeValue2 <= timeValue1 )
	{
		if (showError)
		{
			alert( 	dateText.datesNotFutureTime );
		}
		okay		= false;
	}

	return okay;
}

/*#########################################################
#
#
# Function: validateDateOverlap()
#
# Description:
#	Checks if the outbound and return dates overlap.
#
# Parameters:
#	dayControlName1		: name of day control to validate
#	monthControlName1	: name of month control to validate
#	dayControlName2		: name of day control to validate
#	monthControlName2	: name of month control to validate
#	showError		: true if an error should be shown
#	resetDate		: true if second date should be reset to a valid value
#
# Returns:
#	okay:	0 - invalid
#		1 - valid
#
*/
function validateDateOverlap(dayControlName1, monthControlName1, dayControlName2, monthControlName2, showError, resetDate)
{
	var okay 			= true;
	var firstDateString		= captureDateString(dayControlName1, monthControlName1);
	var secondDateString	= captureDateString(dayControlName2, monthControlName2);

	if ( firstDateString > secondDateString )
	{
		if (showError)
		{
			alert( 	dateText.datesOverlap1 + dateText.datesOverlapReturn +
					dateText.datesOverlap2 + dateText.datesOverlapDepart +
					dateText.datesOverlap3 + dateText.datesOverlapReturn );
		}
		if (resetDate)
		{
			setDate( dayControlName2, monthControlName2, firstDateString );
		}
		okay		= false;
	}

	return okay;
}