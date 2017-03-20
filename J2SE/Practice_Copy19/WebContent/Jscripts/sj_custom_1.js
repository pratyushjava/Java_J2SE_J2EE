
/* 
ADD NEW AIRPORT HERE IN SORTED ORDER AND ADJUST ARRAY INDEX, 
WHENEVER NEW SECTOR IS ADDED IN SKYLIGHTS PREFS
PLEASE MAKE SURE DESTINATION AIRPORT CODES ARE IN ALPHABETIC ORDER IN THEIR FULL FORM
*/



function buildAirports()
{

	var apts	= new Array();

		var dests;
		dests		= new Array('AMD','BLR','MAA','DEL','GAU','HYD','CCU','BOM','PNQ');
		apts[0]		= new airport( false, "IXA", "Agartala", dests,false );

		//dests		= new Array('IXA', 'ATQ', 'IXB','BLR','CCJ','MAA','CJB','DED','DEL','GOI','GAU','HYD','JAI','IXJ','KTM', 'COK','CCU','IXM','IXE','BOM','PNQ','IXZ','RJA','SXR','TRZ','TRV','TCR','VNS','VTZ');
		dests = new Array('IXA', 'ATQ', 'IXB', 'BLR','IXC', 'MAA', 'CJB', 'DED', 'DEL', 'DXB', 'GOI', 'GAU', 'HYD', 'JAI', 'IXJ', 'COK', 'CCU', 'CCJ', 'IXM', 'MLE', 'IXE', 'BOM', 'PNQ', 'IXZ', 'RJA', 'RUH','SXR', 'TRV','TRZ', 'TCR', 'UDR', 'VNS', 'VGA', 'VTZ');
		apts[1]		= new airport( false, "AMD", "Ahmedabad", dests,false );


		dests = new Array('AMD', 'IXB','BLR','MAA', 'DEL','GAU', 'HYD', 'CCU','BOM', 'SXR','STV');
		apts[2]		= new airport( false, "ATQ", "Amritsar", dests,false );

		//Updated by kumar as per the client request on 16 Mar 2012
		//dests = new Array('HYD');
		//NDC Removed by BangaruBabu 0n 17Jul 2012 as per client Request
		dests = new Array('IXA','DEL', 'HYD','CCU', 'BOM', 'TRV');
		apts[3]		= new airport( false, "IXU", "Aurangabad", dests,false );

		dests		= new Array('AMD','ATQ','BLR','MAA','DED','DEL','GAU','HYD','CCU','BOM','PNQ');
		apts[4]		= new airport( false, "IXB", "Bagdogra", dests ,false);

			dests		= new Array('BLR','MAA','DEL');
		apts[5]		= new airport( false, "IXG", "Belgaum", dests ,false);

		//dests		= new Array('IXA','AMD','ATQ', 'IXB','CCJ','MAA','CMB','DED','DEL','GOI','GAU','HYD','JAI','IXJ', 'KTM', 'COK','CCU','IXM','BOM','PNQ','IXZ','RJA','SXR','STV','TRV','VNS','VGA','VTZ');
		dests = new Array('IXA', 'AMD', 'ATQ', 'IXB', 'IXG', 'IXC', 'MAA', 'CJB', 'CMB', 'DED', 'DEL', 'DXB', 'GOI', 'GAU', 'HYD', 'HBX', 'IDR', 'JLR', 'JAI', 'IXJ', 'KBL', 'COK', 'CCU', 'CCJ', 'IXM', 'MLE', 'IXE', 'BOM', 'MYQ', 'PNY', 'PNQ', 'RJA','RUH', 'SXR', 'STV', 'TIR', 'TRV', 'TCR', 'UDR', 'VNS', 'VGA', 'VTZ');
		apts[6]		= new airport( false, "BLR", "Bengaluru", dests ,false);

		dests		= new Array('DEL','HYD','IDR');
		apts[7]		= new airport( false, "BHO", "Bhopal", dests,false );

		dests		= new Array('AMD','IXB','BLR','MAA','DED','DEL','GAU','HYD','CCU', 'BOM','SXR','VTZ');
		apts[8]		= new airport( false, "IXC", "Chandigarh", dests,false );


		dests = new Array('IXA', 'AMD', 'ATQ', 'IXB', 'IXG', 'BLR', 'IXC', 'CJB', 'CMB', 'DED', 'DEL', 'DXB', 'GOI', 'GAU', 'HBX', 'HYD', 'JAI', 'IXJ', 'KBL', 'COK', 'CCU', 'CCJ', 'IXM', 'MLE', 'IXE', 'BOM', 'MYQ','PNQ', 'IXZ', 'RJA', 'SXR', 'STV', 'TRV', 'TRZ', 'TIR', 'TCR', 'UDR', 'VNS', 'VGA', 'VTZ');
		apts[9]		= new airport( false, "MAA", "Chennai", dests ,false);

		dests		= new Array('IXA','AMD','IXU','BLR','IXB','MAA','CMB','DEL','DXB','GOI','HYD','JAI','CCU','IXE','BOM','IXZ','RJA','STV','TIR','VGA');
		apts[10]	= new airport( false, "CJB", "Coimbatore", dests ,false);

		dests = new Array('BLR', 'MAA', 'CJB', 'DEL', 'HYD', 'COK', 'IXM', 'BOM', 'TRV', 'VTZ');
		apts[11]	= new airport( false, "CMB", "Colombo", dests ,true);

		dests		= new Array('AMD','BLR','MAA','DEL','GAU','HYD','CCU','BOM');
		apts[12]	= new airport( false, "DED", "Dehradun", dests,false );

        //Updated by kumar as per the client request on 27 feb 2012
		//dests		= new Array('IXA','AMD','IXB','BLR','BHO','MAA','CJB','CMB','GOI','GAU','HYD','IDR','JAI','IXJ','KTM','COK','CCU','IXM','IXE','BOM','NAG','PNQ','RJA','SXR','STV','TIR','TRZ','TRV','VNS','VGA','VTZ');
		//Updated by kumar as per the client request on 16 Mar 2012
		//dests = new Array('IXA', 'AMD', 'IXB', 'BLR', 'BHO', 'MAA', 'CJB', 'CMB', 'GOI', 'GAU', 'HYD', 'IDR', 'IXJ', 'KTM', 'COK', 'CCU', 'IXM', 'IXE', 'BOM', 'NAG', 'PNQ', 'RJA', 'SXR', 'STV', 'TIR', 'TRZ', 'TRV', 'VNS', 'VGA', 'VTZ');
		//Updated by BangaruBabu as per the client request on 17 Mar 2012
		//dests = new Array('IXA', 'AMD','ATQ', 'IXU', 'IXB', 'BLR', 'BHO','CCJ','IXC','DXB', 'MAA', 'CJB', 'CMB','DED', 'GOI', 'GAU', 'HYD', 'IDR','JAI', 'IXJ','KBL', 'KTM', 'COK', 'CCU', 'IXM', 'IXE', 'BOM', 'NDC', 'PNQ','IXZ', 'RJA', 'SXR', 'STV', 'TIR', 'TRZ', 'TRV', 'VNS', 'VGA', 'VTZ');
		dests = new Array('IXA', 'AMD','IXD','ATQ', 'IXU', 'IXB', 'BLR', 'BHO', 'IXC', 'DXB', 'MAA', 'CJB', 'CMB', 'DED', 'GOI', 'CAN', 'GAU', 'HYD', 'IDR', 'JLR', 'JAI', 'IXJ', 'KBL', 'KTM', 'COK', 'CCU', 'CCJ', 'IXM', 'MLE', 'IXE', 'BOM','MYQ', 'PNY', 'IXZ', 'PNQ', 'RJA', 'RUH', 'SXR', 'STV', 'TRV', 'TRZ','TIR', 'UDR', 'VNS', 'VGA', 'VTZ');
		apts[13]		= new airport( false, "DEL", "Delhi", dests ,false);

		dests		= new Array('AMD','BLR','MAA','CJB','DEL','HYD','KTM','COK','BOM');
		apts[14]		= new airport( false, "DXB", "Dubai", dests ,true);

		dests		= new Array('AMD','BLR','MAA','IXC','CJB','DEL','DXB','HYD','JAI','COK','CCU','BOM','STV','TRV','TIR','VNS','VTZ');
		apts[15] = new airport(false, "GOI", "Goa", dests, false);

		dests = new Array('DEL','CCU','BOM');
		apts[16] = new airport(false, "CAN", "Guangzhou", dests, false);

		dests		= new Array('IXA','AMD','ATQ', 'IXB','BLR','IXC','MAA','DED','DEL','HYD','CCU','BOM','IXZ','PNQ','VNS');
		apts[17]		= new airport( false, "GAU", "Guwahati", dests,false );

		//dests = new Array('IXA', 'AMD', 'ATQ', 'IXU', 'IXB', 'BLR', 'BHO', 'CCJ', 'IXC', 'MAA', 'CJB', 'CMB','DED', 'DEL', 'GOI', 'GAU', 'IDR', 'JAI', 'IXJ', 'KTM', 'COK', 'CCU', 'IXM', 'IXE', 'BOM', 'PNQ', 'IXZ', 'RJA', 'SXR', 'TIR', 'TRV', 'VNS', 'VGA', 'VTZ');
		dests = new Array('IXA', 'AMD', 'ATQ', 'IXU', 'IXB', 'BLR', 'BHO', 'IXC', 'MAA', 'CJB', 'CMB', 'DED', 'DEL', 'GOI', 'GAU', 'HBX', 'IDR','JLR', 'JAI', 'IXJ', 'KBL', 'COK', 'CCU', 'CCJ', 'IXM', 'MLE', 'IXE', 'BOM', 'PNY', 'IXZ', 'PNQ', 'RJA','RUH', 'SXR', 'TRV','TRZ', 'TIR', 'UDR', 'VNS', 'VGA', 'VTZ');
		apts[18]		= new airport( false, "HYD", "Hyderabad", dests,false );

		dests = new Array('BLR','MAA','HYD');
		apts[19]		= new airport( false, "HBX", "Hubli", dests,false );


		dests		= new Array('BHO','DEL','HYD');
		apts[20]		= new airport( false, "IDR", "Indore", dests,false );


		//Added by BangaruBabu on 16-Aug-2012 as per client request
    	dests = new Array('BLR','MAA','DEL','GOI','COK','CCU','BOM','STV');
		apts[21]		= new airport( false, "JLR", "Jabalpur ", dests ,false);


		//Updated by kumar as per the client request on 27 feb 2012
		//dests = new Array('AMD', 'BLR', 'MAA', 'DEL', 'GOI', 'GAU', 'HYD', 'IXJ', 'CCU', 'IXM', 'BOM', 'PNQ', 'VTZ');
		dests = new Array('AMD', 'BLR', 'MAA','CJB','DEL','DXB', 'GOI', 'GAU', 'HYD', 'IXJ', 'COK','CCU', 'IXM', 'BOM', 'PNQ', 'VTZ');
		apts[22]		= new airport( false, "JAI", "Jaipur", dests ,false);

		dests		= new Array('AMD','BLR','MAA','DEL','DXB','GOI','GAU','HYD','JAI','CCU','BOM','PNQ','SXR','VNS');
		apts[23]		= new airport( false, "IXJ", "Jammu", dests ,false);

		dests		= new Array('BLR','MAA','DEL', 'HYD', 'KTM', 'BOM');
		apts[24]		= new airport( false, "KBL", "Kabul", dests,true );

		dests = new Array('DEL', 'DXB', 'KBL');
		apts[25]		= new airport( false, "KTM", "Kathmandu", dests,true );

//		dests		= new Array('AMD','IXU','BLR','BHO','MAA','CMB','DEL','GOI','HYD','IDR','CCU','IXM','BOM','PNQ','TRV','VGA','VTZ');
		dests = new Array('AMD', 'IXU', 'BLR', 'BHO', 'MAA', 'CMB', 'DEL','DXB', 'GOI', 'HYD', 'IDR', 'CCU', 'IXM','MLE', 'BOM','IXZ','PNY', 'PNQ', 'TRV', 'VGA', 'VTZ');
		apts[26]		= new airport( false, "COK", "Kochi", dests,false );

		//dests		= new Array('IXA','AMD','IXB','BLR','MAA','CJB','DEL','GOI','GAU','HYD','JAI','KTM','COK','BOM','PNQ','IXZ','SXR','STV','VNS');
		//dests		= new Array('IXA','AMD','IXB','BLR','MAA','CJB','DEL','GOI','GAU','HYD','JAI','KTM','BOM','PNQ','IXZ','SXR','STV','VNS');
		dests = new Array('IXA', 'AMD', 'ATQ', 'IXB', 'BLR', 'MAA', 'CJB', 'DED', 'DEL', 'DXB', 'GOI', 'CAN','GAU', 'HYD', 'JAI', 'COK', 'IXE', 'BOM', 'PNY', 'IXZ', 'PNQ','RUH', 'SXR', 'STV', 'UDR', 'VNS');
		apts[27] = new airport(false, "CCU", "Kolkata", dests, false);

		dests = new Array('AMD', 'BLR', 'MAA', 'DEL','DXB', 'HYD','JAI','CCU', 'BOM', 'STV','TRV', 'TCR','VGA','VTZ');
		apts[28] = new airport(false, "CCJ", "Kozhikode", dests, false);

		//dests		= new Array('AMD','BLR','MAA','CMB','DEL','GOI','HYD','IXE','BOM','IXZ','TRZ','VGA');
		dests		= new Array('AMD','BLR','MAA','CMB','DEL','GOI','HYD','IXE','BOM','RJA','VGA');
		apts[29]	= new airport( false, "IXM", "Madurai", dests,false );

	//	dests		= new Array('AMD','MAA','CJB','DEL','HYD','COK','CCU','IXM','BOM','IXZ','STV','TRV','VTZ');
		dests		= new Array('AMD','BLR','MAA','CJB','DEL','HYD','COK','CCU','IXM','BOM','IXZ','STV','TRV','VTZ');
		apts[30] = new airport(false, "IXE", "Mangalore", dests, false);

		dests = new Array('AMD', 'BLR', 'MAA', 'DEL', 'HYD', 'COK', 'BOM');
		apts[31] = new airport(false, "MLE", "Male", dests, true);

		//Updated by Kumar on 16 Mar 2012 as per the client request
		//dests = new Array('IXA', 'AMD', 'IXB', 'BLR', 'MAA', 'CJB', 'CMB', 'DEL', 'GOI', 'GAU', 'HYD', 'JAI', 'IXJ', 'KTM', 'COK', 'CCU', 'IXM', 'IXE', 'RJA', 'SXR', 'STV', 'TRZ', 'TCR', 'VNS', 'VGA', 'VTZ');
		//dests = new Array('IXA', 'AMD', 'ATQ', 'IXU', 'IXB', 'BLR', 'CCJ', 'IXC', 'MAA', 'CJB', 'CMB','DED', 'DEL', 'DXB', 'GOI', 'GAU', 'HYD', 'JAI', 'IXJ', 'KTM', 'COK', 'CCU', 'IXM', 'IXE', 'NDC', 'IXZ', 'RJA', 'SXR', 'STV', 'TRZ', 'TRV', 'TCR', 'VNS', 'VGA', 'VTZ');
		dests = new Array('IXA', 'AMD', 'ATQ', 'IXU', 'IXB', 'BLR', 'IXC', 'MAA', 'CJB', 'CMB', 'DED', 'DEL', 'DXB', 'GOI','CAN', 'GAU', 'HYD', 'JLR', 'JAI', 'IXJ', 'KBL', 'COK', 'CCU', 'CCJ', 'IXM', 'MLE', 'IXE','MYQ','PNY', 'IXZ', 'RJA', 'SXR', 'STV', 'TRV','TRZ', 'TCR', 'UDR', 'VNS', 'VGA', 'VTZ');
		apts[32]		= new airport( false, "BOM", "Mumbai", dests,false );

		//dests		= new Array('BLR','DEL','HYD');
		//apts[24] = new airport(false, "NAG", "Nagpur", dests, false);

        //Added by Kumar on 16 Mar 2012 as per the client request
		//Nanded Has been Removed by bangarubabu  17 JUL 2012 as per the client request
		//dests = new Array('IXU', 'DEL', 'BOM', 'TRV');
		//apts[28] = new airport(false, "NDC", "Nanded", dests, false);

		

		dests = new Array('BLR','BOM','DEL','HYD','COK','CCU');
		apts[33] = new airport(false, "PNY", "Pondicherry", dests, false);


		//dests		= new Array('AMD','BLR','MAA','DEL','HYD','CCU','IXM','BOM','TRZ','VTZ');

		dests		= new Array('MAA','DEL','GAU','HYD','CCU','COK');
		apts[34]		= new airport( false, "IXZ", "Port Blair", dests,false );

		dests = new Array('IXA', 'AMD', 'IXB', 'BLR', 'MAA', 'DEL', 'GAU', 'HYD', 'JAI', 'COK', 'CCU', 'SXR', 'TIR', 'VNS');
		apts[35] = new airport(false, "PNQ", "Pune", dests, false);

		dests = new Array('BLR', 'MAA', 'CJB', 'DEL', 'HYD', 'COK', 'BOM','TIR', 'VGA');
		apts[36] = new airport(false, "RJA", "Rajahmundry", dests, false);

		dests = new Array('AMD','BLR','DEL','HYD','CCU','VNS');
		apts[37] = new airport(false, "RUH", "Riyadh", dests, true);

		dests = new Array('AMD', 'ATQ', 'BLR', 'IXC', 'MAA', 'DEL','DXB', 'GOI', 'GAU', 'HYD', 'IDR', 'IXJ', 'CCU', 'BOM', 'PNQ', 'STV','VNS');
		apts[38]		= new airport( false, "SXR", "Srinagar", dests,false );

		dests = new Array('ATQ','BLR','IXC', 'MAA', 'CJB', 'DEL','DXB', 'GOI','HYD','JLR', 'CCU', 'CCJ', 'IXE', 'BOM','SXR', 'TRV','VNS');
		apts[39] = new airport(false, "STV", "Surat", dests, false);

		dests = new Array('IXU', 'AMD', 'BLR', 'MAA','DEL','GOI', 'HYD','JAI', 'COK', 'CCU','CCJ', 'IXE', 'BOM', 'STV');
		apts[40] = new airport(false, "TRV", "Thiruvananthapuram", dests, false);

		dests = new Array('AMD','MAA','DEL','GOI','HYD','BOM');
		apts[41] = new airport(false, "TRZ", "Tiruchirapalli", dests, false);

		dests		= new Array('AMD','IXU','BLR','BHO','MAA','CJB','DEL','GOI','HYD','IDR','COK','CCU','IXM','BOM','PNQ','VGA','VTZ');
		apts[42]		= new airport( false, "TIR", "Tirupati", dests,false );

		//dests		= new Array('AMD','BLR','MAA','CMB','DEL','IXM','BOM','IXZ');
	

		//changed by Kumar on 16 Mar 2012 as per the client request
		//dests = new Array('MAA', 'HYD', 'IXE');
		//dests = new Array('AMD','IXU','BLR','CCJ','MAA','HYD','COK','CCU', 'IXE', 'BOM', 'NDC','STV');
		//dests = new Array('AMD','IXU','BLR','CCJ','MAA','HYD','COK','CCU','IXE', 'BOM','STV');
		//dests = new Array('IXU','BLR','CCJ','MAA','HYD','COK','CCU','IXE', 'BOM','STV');
		

		dests		= new Array('AMD','MAA','BLR','DEL','GOI','COK','BOM');
		apts[43] = new airport(false, "TCR", "Tuticorin", dests, false);

		dests = new Array('AMD', 'BLR', 'MAA', 'DEL', 'HYD', 'CCU', 'BOM');
		apts[44] = new airport(false, "UDR", "Udaipur", dests, true);

		dests		= new Array('AMD','BLR','MAA','DED','DEL','GOI','GAU','HYD','CCU','BOM','PNQ','RUH');
		apts[45]		= new airport( false, "VNS", "Varanasi", dests,false );

		dests		= new Array('AMD','BLR','MAA','CJB','DEL','GOI','HYD','COK','CCU','CCJ','IXM','BOM','PNQ','RJA','TIR');
		apts[46]		= new airport( false, "VGA", "Vijayawada", dests ,false);

		//dests		= new Array('IXA','BLR','CCJ','MAA','CMB','DEL','GOI','HYD','CCU','BOM','IXZ','TIR','VNS');
		//dests		= new Array('IXA','BLR','CCJ','MAA','CMB','DEL','GOI','HYD','CCU','BOM','TIR','VNS');
		dests = new Array('IXA', 'ATQ', 'BLR', 'MAA', 'CMB', 'DED', 'DEL', 'GOI', 'HYD','IXJ','CCU', 'CCJ', 'BOM','PNQ', 'TIR', 'VNS');
		apts[47]		= new airport( false, "VTZ", "Visakhapatnam", dests ,false);

			dests = new Array( 'BLR','MAA','DEL','BOM');
		apts[48]		= new airport( false, "MYQ", "Mysore", dests ,false);
		
		dests = new Array( 'DEL');
		apts[49]		= new airport( false, "IXD", "Allahabad", dests ,false);








				return apts;
    
}

function captureDateText(dateText) {
    dateText.departDatePast = "\nThe date you selected has already passed.\n\nClick OK to reset your date selection.\n";
    dateText.datesNotSameDate = "\nThe dates are not the same.\n";
    dateText.datesNotFutureTime = "\nThe time or date selected maybe the same or overlaps in the past. Please reselect the date or time.\n";
    dateText.datesOverlap1 = "Please make sure that your ";
    dateText.datesOverlap2 = "\nis not earlier than your ";
    dateText.datesOverlap3 = "\n\nClick OK to reset your ";
    dateText.datesOverlapDepart = "depart date";
    dateText.datesOverlapReturn = "return date";
    dateText.datesOverlapDepartCar = "";
    dateText.datesOverlapReturnCar = "";
    dateText.datesOverlapDepartHotel = "";
    dateText.datesOverlapReturnHotel = "";
    dateText.datesOverlapDepartAct = "";
    dateText.datesOverlapReturnAct = "";
    dateText.months = new Array();
    dateText.months[0] = "January";
    dateText.months[1] = "February";
    dateText.months[2] = "March";
    dateText.months[3] = "April";
    dateText.months[4] = "May";
    dateText.months[5] = "June";
    dateText.months[6] = "July";
    dateText.months[7] = "August";
    dateText.months[8] = "September";
    dateText.months[9] = "October";
    dateText.months[10] = "November";
    dateText.months[11] = "December";
    dateText.sameDayWarning = "Your return date is\nthe same as your departure date.\n\nIs such a short trip intentional?";

    // Invalid Date text
    dateText.invalidfromDay = "\n";
    dateText.invalidtoDay = "\n";
    dateText.invaliddepartDay1 = "\nYour departure date is invalid.\n";
    dateText.invaliddepartDay2 = "\nYour return date is invalid.\n";
    dateText.invalidcheckinDay1 = "\nYour checkin date is invalid.\n";
    dateText.invalidcheckoutDay1 = "\nYour checkout date is invalid.\n";
    dateText.invalidcarPickupDay = "\nYour pick-up date is invalid.\n";
    dateText.invalidcarDropoffDay = "\nYour drop-off date is invalid.\n";
    dateText.invalidactivityStartDay1 = "\nYour activity start date is invalid.\n";
    dateText.invalidactivityEndDay1 = "\nYour activity end date is invalid.\n";

    dateText.invalidMonthHasOnly = " has only ";
    dateText.invalidMonthHasOnlyDays = " days.\n";
}


function captureDatePrefs(datePrefs) {
}