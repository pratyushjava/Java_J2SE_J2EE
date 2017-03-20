/*#############################################################################

FILE:	airports.js

	Copyright (c) 2005 Navitaire Inc. All rights reserved.

	This source code is (i) proprietary to and a trade secret of Navitaire Inc.
	and (ii) protected by copyright law and international treaties.
	Unauthorized disclosure, reproduction, distribution or alteration of this
	source code, or any portion of it, may result in severe civil and criminal
	penalties and will be prosecuted to the maximum extent possible under
	the law.

	www.navitaire.com

DESCRIPTION:

	Provides javascript to work with airport objects.  Note that this file relies on
	javascript from the jAirports.wld template.

#############################################################################*/

	var Airports	= buildAirports();
	/*##############################################
	#
	# Function: airport()
	#	
	# Parameter: 
	#		m: mac airport 
	#		c: origin Airport code
	#		n: origin airport name
	#		d: destination city
	#       i: Is International
	#
	# Description: 
	#	       Collects the airport information and
	#	       stores it in a single string.
	#	       
	#*/
	function airport(m, c, n, d, i)
	{
		this.mac		= m;
		this.code	= c;
		this.name	= n;
		this.dests	= d;
		this.international = i;

		this.display	= function ()
		{
			var msg		=  "Airport: "
						+ "\n   code: " + this.code
						+ "\n   name: " + this.name
						+ "\n   international: " + this.international
						+ "\n   dests: ";
			for (var i=0; i < this.dests.length; i++)
			{
				msg		+= "'" + this.dests[i] + "', ";
			}
			alert( msg );
		};
	}
	/*##############################################
	#
	# Function: getAirport()
	#	
	# Parameter: 
	#		code: mac airport 
	#		
	#
	# Description: 
	#	       Returns the hash information of a specific airport requested.
	#	       
	#*/
	function getAirport( code )
	{
		var air;
		for (var i=0; i < Airports.length; i++)
		{
			if ( Airports[i].code == code )
			{
				air		= Airports[i];
				break;
			}
		}
		return air;
	}