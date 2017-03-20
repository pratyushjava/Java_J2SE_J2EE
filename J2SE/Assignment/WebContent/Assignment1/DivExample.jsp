<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../scripts/jquery-1.6.2.js"></script>
<script type="text/javascript" src="../scripts/jquery/jquery.js"></script>
 <script src="../scripts/jquery-1.9.1.js"></script>
<script src="../scripts/jquery-ui-1.10.2.custom.js"></script>

<script type="text/javascript">
var d=1;
var b=1;
var v="";
$(document).ready(function(){

	
	
	$("div#sgmnt").draggable({helper:"clone"});
	$("div#blk").draggable({helper:"clone"});
	$("#and").draggable({helper:"clone"});
	
	$("#contentholder").droppable({ drop:function(event,ui){
		//$(ui.draggable).clone().appendTo($(this));
		
		var vid=$(ui.draggable).attr("id");
		if(vid=="sgmnt")
			{
			//alert("in segment");
			$(this).append(" <div id='innersegment"+ d +"'class='isgmnt' style='  border: 1px hidden;  max-width: 450px;height: 50px;margin: auto; position: relative;'onmouseover='changeColorOvr(this.id)' onmouseout='changeColorOt(this.id)'>"+
			"<img id='img"+d+"' src='../images/final.png' style='margin-right: 0px;float: right;display: none;' onclick='deleteSegment(this.id)'>"+
            "<div id='vbl"+d+"' class='variable' style='width: 90px;background-color: #EEEEEE;margin-top: 5px;margin-left: 5px;font-size:x-large ;height: 35px;float: left;border: 1px groove activeborder;' onclick='showdrop(this.id);'>variable </div>"+
            "  <div style=' left: 96px;  top: 19px;  width: 82px;  border-top: 1px solid; position: absolute;'></div>"+
            " <div id='condition'  style='width: 90px;background-color: #EEEEEE;height: 35px;margin-top: 5px;margin-left: 80px;font-size: x-large;border: 1px groove activeborder;float: left;'>condition</div> " +
            " <div style=' left: 268px;  top: 19px;  width: 72px;  border-top: 1px solid; position: absolute;'></div>"+
            " <div id='vbl"+d+"' class='variable'  style='width: 80px;background-color: #EEEEEE;height: 35px;margin-top: 5px;font-size: x-large;float: left;border: 1px groove activeborder;margin-right:5 px;margin-left:65px'>variable</div>"+  
	        "</div>");
			
			$(".isgmnt").draggable({revert:"valid"});
			//$( "#draggable2" ).draggable({ revert: "invalid" });
        
			d++;
			
		
			}
		
		if(vid=="and")
			{
			  $(ui.draggable).clone().appendTo($(this));
			$(ui.draggable).draggable();
			
		
			}
		
		if(vid=="blk")
			{
$(this).append("<div id='tempblock'class='blockclass' style='  border: 1px solid black ;  max-width: 600px;margin: 10px auto ; min-width: 400px;background-color: cyan;min-height: 100px 'onmouseover='changeOvr(this.id)' onmouseout='changeOt(this.id)'>"+
 "<img id='imgvbl11' src='../images/final.png' style='float: right;display: none' onclick='deleteSegment(this.id);'/>"+
"<div id='blkinner"+b+"' style='  border: 1px hidden;  max-width: 440px;height: 50px;margin: 10px auto ; position: relative;min-width: 300px'  onmouseover='changeColorOvr(this.id)' onmouseout='changeColorOt(this.id)'>"+
"<img id='imgvbl22' src='../images/final.png' style='float: right;display: none' onclick='deleteSegment(this.id);'/>"+
 "<div id='blkvbl"+b+"' class='variable' style='width: 90px;background-color: #EEEEEE;margin-top: 5px;margin-left: 5px;font-size:x-large ;height: 35px;float: left;border: 1px groove activeborder;' onclick='showdrop(this.id);'>variable </div>"+
"<div style=' left: 96px;  top: 19px;  width: 78px;  border-top: 1px solid; position: absolute;'></div>"+
"<div id='blkcondition"+b+"'  style='width: 90px;background-color: #EEEEEE;height: 35px;margin-top: 5px;margin-left: 75px;font-size: x-large;border: 1px groove activeborder;float: left;'>condition</div>"+ 
"<div style=' left: 265px;  top: 19px;  width: 68px;  border-top: 1px solid; position: absolute;'></div>"+			            
"<div id='blkvbl"+b+"' class='variable'  style='width: 80px;background-color: #EEEEEE;height: 35px;margin-top: 5px;font-size: x-large;float: left;border: 1px groove activeborder;margin-right: 5px;margin-left: 65px'>variable</div>"+  
"</div></div>");  

/*  $("<div id='tempblock'class='blockclass' style='  border: 1px solid black ;  max-width: 600px;margin: 10px auto ; min-width: 400px;background-color: cyan;min-height: 100px 'onmouseover='changeOvr(this.id)' onmouseout='changeOt(this.id)'>"+
"<img id='imgvbl11' src='../images/final.png' style='float: right;display: none' onclick='deleteSegment(this.id);'/>"+
"<div id='blkinner"+b+"' style='  border: 1px hidden;  max-width: 440px;height: 50px;margin: 10px auto ; position: relative;min-width: 300px'  onmouseover='changeColorOvr(this.id)' onmouseout='changeColorOt(this.id)'>"+
"<img id='imgvbl22' src='../images/final.png' style='float: right;display: none' onclick='deleteSegment(this.id);'/>"+
"<div id='blkvbl"+b+"' class='variable' style='width: 90px;background-color: #EEEEEE;margin-top: 5px;margin-left: 5px;font-size:x-large ;height: 35px;float: left;border: 1px groove activeborder;' onclick='showdrop(this.id);'>variable </div>"+
"<div style=' left: 96px;  top: 19px;  width: 78px;  border-top: 1px solid; position: absolute;'></div>"+
"<div id='blkcondition"+b+"'  style='width: 90px;background-color: #EEEEEE;height: 35px;margin-top: 5px;margin-left: 75px;font-size: x-large;border: 1px groove activeborder;float: left;'>condition</div>"+ 
"<div style=' left: 265px;  top: 19px;  width: 68px;  border-top: 1px solid; position: absolute;'></div>"+			            
"<div id='blkvbl"+b+"' class='variable'  style='width: 80px;background-color: #EEEEEE;height: 35px;margin-top: 5px;font-size: x-large;float: left;border: 1px groove activeborder;margin-right: 5px;margin-left: 65px'>variable</div>"+  
"</div></div>").droppable({drop:function(event,ui){
	alert("hi");
}}).appendTo($(this)); */


b++;
//$(".blockclass").draggable();
/*  $( ".blockclass" ).droppable( {drop: function( event, ui ) {
	alert(ui.draggable);
	
} }) */

/* alert($(this).find(".blockclass").attr("id"));
v=$(this).find(".blockclass").attr("id");
alert("the id is"+v);
 */

}
		/*  $(this).find(".blockclass").droppable( { drop:function(event,ui){
			 alert(ui.draggable)
		 }}); 
		 */
		/*  if(v=="tempblock")
			 {
		      alert("before droppable"+v);
		      $("#"+v).droppable({drop:function(event,ui){
			  $("#"+v).append("<h1>hello</h1>");
			   
			}});
			 } */
					
		
	}});
	
	
	

	
	//code to make block droppable
	/* $("#tempblock").droppable({ drop:function(event,ui){
		alert("hi");
		$(ui.draggable).clone().appendTo($(this))
		var vid=$(ui.draggable).attr("id");
		alert(vid);
		alert($(this).attr("id"));
		if(vid=="sgmnt")
			{
			//alert("in segment");
			$("#tempblock").append(" <div id='blkinnersegment"+ b +"' style='  border: 1px hidden;  max-width: 450px;height: 50px;margin: auto; position: relative;'onmouseover='changeColorOvr(this.id)' onmouseout='changeColorOt(this.id)'>"+
			"<img id='blkimg"+b+"' src='../images/final.png' style='margin-right: 0px;float: right;display: none;' onclick='deleteSegment(this.id)'>"+
            "<div id='blkvbl"+b+"' class='variable' style='width: 90px;background-color: #EEEEEE;margin-top: 5px;margin-left: 5px;font-size:x-large ;height: 35px;float: left;border: 1px groove activeborder;' onclick='showdrop(this.id);'>variable </div>"+
            "  <div style=' left: 96px;  top: 19px;  width: 82px;  border-top: 1px solid; position: absolute;'></div>"+
            " <div id='condition'  style='width: 90px;background-color: #EEEEEE;height: 35px;margin-top: 5px;margin-left: 80px;font-size: x-large;border: 1px groove activeborder;float: left;'>condition</div> " +
            " <div style=' left: 268px;  top: 19px;  width: 72px;  border-top: 1px solid; position: absolute;'></div>"+
            " <div id='blkvbl"+b+"' class='variable'  style='width: 80px;background-color: #EEEEEE;height: 35px;margin-top: 5px;font-size: x-large;float: left;border: 1px groove activeborder;margin-right:5 px;margin-left:65px'>variable</div>"+  
	           
            
           
         "</div>"
         /* " <div id='ddbar' style='display: none;border: 1px solid black;width: 150px;background-color: #EFC19B'>"+
         "<div style='margin: 5px ;background-color: black ;color: white;' align='center'>Available Option</div>"+
         "<div id='ev' class='v' style='margin: 5px ;background-color: blue ;color: white;' onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' align='center'>Enter Value</div>"+
         "<div id='sr' class='v' style='margin: 5px ;background-color: blue ;color: white;'  onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' align='center'>store Rating</div>"+
         "<div id='im' class='v' style='margin: 5px ;background-color: blue ;color: white;'  onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' align='center'>Input Message</div>"+
         "<div id='sq' class='v' style='margin: 5px ;background-color: blue ;color: white;'  onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' align='center'>Store Quantity</div>"+
        
      "</div>" */ //);
		/* 	b++;
			}
		
		if(vid=="and")
			{
			$(ui.draggable).clone().appendTo($(this));
			}
		
			}}); */
 
	
	
/* 	$("#contentholder").droppable({ drop:function(event,ui){
		$(ui.draggable).clone().appendTo($(this));
	}});
	 */
	
/* 	$("div#innersegment").mouseover(function(){
		$("div#innersegment").css("background-color","Gray");
		$("#cross").css("display","inline");
	}); */
	/*  $("div#innersegment").mouseout(function(){
		$("div#innersegment").css("background-color","");
		$("#cross").css("display","none");
	});  */
	
	
	/* $(".blockclass").droppable({drop:function(event,ui){
		$(ui.draggable).clone().appendTo($(this));
	}}); */
	
	//$( ".blockclass" ).live( "drop", function( event, ui ) {alert("hi");} );
	
	
});
	
function myEventHandler(e)
{
    if (!e)
      e = window.event;

    if (e.cancelBubble)
      e.cancelBubble = true;
    else
      e.stopPropagation();
}
	
	

function changeColorOver(id)
{
	$("div#"+id).css("background-color","#00008B");
}
function changeColorOut(id)
{
	
	$("div#"+id).css("background-color","blue");
     
}

function changeOvr(id)
{
  $("#"+id+">img").css("display","block");	
}

function changeOt(id)
{
  $("#"+id+">img").css("display","none");	
}

function changeColorOvr(id)
{
	//alert(id);
	$("div#"+id).css("background-color","Gray");
	$("div#"+id+">img").css("display","block");
	var id1="tempblock"+b;
	if(id=="tempblock")
		{
		
		}
	
	
	}
function changeColorOt(id)
{
	
	$("div#"+id).css("background-color","");
	$("div#"+id+">img").css("display","none");
	
	}

function showdrop(id)
{
showelement(id);
}
	
	function showelement(id)
	{
		
		//alert(id);
		
		var v=$("#"+id).children(".tb").attr("class");
	
		if(v!="tb")
			{
	
			$("#"+id).append("<br/><div id='tbbar"+id+"' class='tb' style='display:none'><table id='ddbar'class='dbr'>"+
				    "<tr class='t'><td style='background-color:#EFC19B;width:900px;'><div style='margin: 5px ;width:200px;background-color: black ;color: white;' align='center'>Available Option</div>"+
				    "<tr class='t'><td id='evtd'style='background-color:#EFC19B'><div id='ev' class='v' style='margin: 5px ;background-color: blue ;color: white;' onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' onclick='myEventHandler(event);changetextStore(this.id);' align='center'>Enter Value</div>"+
				    "<td id='txtBox'style='display:none'>"+
				   "<input type='text' id='t1' onclick='myEventHandler(event);txtClick(this.id);'>&nbsp<img src='../images/tick.jpg'>&nbsp<img id='cancel' src='../images/cancel.jpg' onclick='myEventHandler(event); cancelClick(this.id);'>"+
				    "<tr class='t'><td style='background-color:#EFC19B'><div id='sr' class='v' style='margin: 5px ;background-color: blue ;color: white;'  onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' onclick='myEventHandler(event);changetextStore(this.id);' align='center'>store Rating</div>"+
				    "<tr class='t'><td style='background-color:#EFC19B'><div id='im' class='v' style='margin: 5px ;background-color: blue ;color: white;'  onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' onclick='myEventHandler(event);changetextStore(this.id);' align='center'>Input Message</div>"+
				    "<tr class='t'><td style='background-color:#EFC19B'><div id='sq' class='v' style='margin: 5px ;background-color: blue ;color: white;'  onmouseover='changeColorOver(this.id);' onmouseout='changeColorOut(this.id);' onclick='myEventHandler(event);changetextStore(this.id);' align='center'>Store Quantity</div>"+
				   
				 "</table></div>"
				 
			);
			var vid=$("#"+id).children(".tb").attr("id");
			//alert("variable children id "+vid);
			
			$("#"+vid).toggle();
		
			
			return;
		
			}
		var vid=$("#"+id).children(".tb").attr("id");
		$("#"+vid).toggle();
	
	}
	
	
	
	function txtClick(id)
	{
		//var v=$("#"+id).parent().attr("id");
		//var v1=$("#"+id).parent().parent().parent().parent().parent().attr("id");
		//$("#"+v).css("display","none");
		//$("#"+v1).toggle();
	}
	
	function cancelClick(id)
	{
		//alert(id);
		//$("#"+t1).text("");
		//alert($("#"+id).parent().parent().parent().parent().parent().attr("id"));
		var v=$("#"+id).parent().parent().parent().parent().parent().attr("id");
		var v1=$("#"+id).parent().attr("id");
		//$("#"+t1).text("");
		$("#"+v1).css("display","none");
		$("#"+v).toggle();
	}
	
	function deleteSegment(id)
	{
		
		$("#"+id).parent().remove();
		
	}
	
	function changetextStore(id1)
	{
	
		//alert("the clicked element id "+id1);
	
		//alert("in change text store");
		var pid=$("#"+id1).parent().parent().parent().parent().parent().attr("id");
		var ppid=$("#"+id1).parent().parent().parent().parent().parent().parent().attr("id");
		//alert("the elemnt id "+pid);
		//alert("the parent element id "+ppid);
		if(id1=="sr")
			{
			

		$("#"+pid).toggle();	
		 $("#"+ppid).css("background-color","green");
		    $("#"+ppid).text("store rating");
		    $("#"+ppid).css("font-size","20px");
			
			
			}
		
		if(id1=="im")
		{
		$("#"+pid).toggle();	
		
	    $("#"+ppid).css("background-color","green");
	    $("#"+ppid).text("input msg");
	    $("#"+ppid).css("font-size","20px");
        
		
		}
		if(id1=="sq")
		{
			$("#"+pid).toggle();	
			 $("#"+ppid).css("background-color","green");
			    $("#"+ppid).text("store qnty");
			    $("#"+ppid).css("font-size","20px");
		}
		
		if(id1=="ev")
		{
		//	$("#"+pid).toggle();	
			// $("#"+ppid).css("background-color","green");
			  //  $("#"+ppid).text("store qnty");
			  //  $("#"+ppid).css("font-size","20px");
			  $("#txtBox").css("display","block");
		}
		 
		   
			
		
		
	
	}



</script>
</head>
<body>
<form>
<div style="height: 100%" id="main">
	<div style="height: 10%" id="upper" >
		<table width="100%" border="0">
		<tr style="border: 1px solid black;">
			<td width="20%"><div align="center"><img src="../images/notifier.png" height="30%" width="30%"></div>
			<td width="80%"><div align="left"><h1>Reflexis Adaptive Notification Subsystem Manage</h1></div>
			<td><div align="center">Logout</div>	 
		<tr>
		   <div>
			   <table cellspacing="0" width="100%" id="hbar">
				   <tr>
				   <td width="20%"><div align="center">Monitor</div>
				   <td width="20%"><div align="center">Vendor</div>
				   <td width="20%"><div align="center">EntitySetup</div>
				   <td width="20%"><div align="center">Configuration</div>
				   <td width="20%"><div align="center">TestTools</div>
				   </td>
				   </tr>
			   </table>
		   </div>
		</table>
	</div>
	<br>
	<div id="lower" style="width: 99%;border: 1px groove activeborder;height: 600px">
	
	 <div id="sitemap" style="margin-left: 40px;float: left;" >Entity>store>manager</div><br>
	 <div id="" style="margin-left: 200px ;border: 1px solid black;margin-right: 100px;height: 500px">
	     <div id="toolbar" style="margin-left: 20px;margin-top: 20px;border: 1px solid gray;width: 10%;float: left;height: 50%">
	       <div id="tbar" style="width: 100%;background-color: #1F497D;color: white;" align="center">ToolBar</div><br>
	       <div id="sgmnt" style="background-color: #EEEEEE; text-align: center;  cursor: -moz-grab;width: 80px;  font-size: 12px; margin: 10px auto;border: 1px groove activeborder;  padding: 5px 0;
    position: relative;" align="center">Segment</div><br>
	       <div id="blk" style=" text-align: center;  cursor: -moz-grab;width: 80px;  font-size: 12px;background-color: cyan; margin: 10px auto;border: 1px groove activeborder;  padding: 5px 0;
    position: relative;" align="center">Block</div><br>
	       <!-- <div id="and" style="width: 80px;background-color: #00FF00;height: 30px;margin-top: 2px;margin-left: 5px;border: 1px groove activeborder;" align="center">AND</div><br> -->
	       <div id="and" style=" text-align: center;  cursor: -moz-grab;width: 80px;  font-size: 12px;background-color: #00FF00; margin: 10px auto;border: 1px groove activeborder;  padding: 5px 0;
    position: relative;" align="center">AND</div><br>
	       
	     
	     </div>
	     <div id="figure" style="border: 1px solid aqua;width: 500px;height:400px;margin-top: 20px;float:right;margin-right: 300px">
	      <div id="start">
	         <div id="strt" style="width: 70px;background-color: green;min-height: 25px;margin-left: 10px;margin-top: 10px;text-align: center;font-size: 20px ;">Start</div>
	     
	  </div>
	       
	       
	  
	        <div id="contentholder" style="  max-width: 820px;background-color:#FFFACD;margin: 10px auto 0; border: 1px none; padding: 5px 0;min-height: 60px" align="center">
	    
   
 
  
 
   
  
   
   
	         <div id="innersegment" style="  border: 1px hidden;  max-width: 440px;height: 50px;margin: 10px auto ; position: relative;min-width: 300px"  onmouseover="changeColorOvr(this.id)" onmouseout="changeColorOt(this.id)">
	         <img id="imgvbl" src="../images/final.png" style="float: right;display: none" onclick="deleteSegment(this.id);"/>
	            <div id="vbl" class="variable" style="width: 90px;background-color: #EEEEEE;margin-top: 5px;margin-left: 5px;font-size:x-large ;height: 35px;float: left;border: 1px groove activeborder;" onclick="showdrop(this.id);">variable </div>
	           
	           
	            <div style=" left: 96px;  top: 19px;  width: 78px;  border-top: 1px solid; position: absolute;"></div>
	            
	          
   
   
   
  
  
	            <div id="condition"  style="width: 90px;background-color: #EEEEEE;height: 35px;margin-top: 5px;margin-left: 75px;font-size: x-large;border: 1px groove activeborder;float: left;">condition</div> 
	            
	          
	            <div style=" left: 265px;  top: 19px;  width: 68px;  border-top: 1px solid; position: absolute;"></div>
	             
	          
   
   
   
  
  
	            <div id="vbl" class="variable"  style="width: 80px;background-color: #EEEEEE;height: 35px;margin-top: 5px;font-size: x-large;float: left;border: 1px groove activeborder;margin-right: 5px;margin-left: 65px">variable</div>  
	           
	        
               
	         </div>
	        
	         
	       </div>
	     <!--   <div id="dropbar" style="">
	       <div><img src="../images/canvas.png"></img></div>
	  <div id="ddbar" style="display: none;border: 1px solid black;width: 200px;background-color: #EFC19B">
	              <div style="margin: 5px ;background-color: black ;color: white;" align="center">Available Option</div>
	               <div id="ev" class="v" style="margin: 5px ;background-color: blue ;color: white;" onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">Enter Value</div>
	               <div id="sr" class="v" style="margin: 5px ;background-color: blue ;color: white;"  onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id); " onclick="changetextStore(this.id);" align="center">store Rating</div>
	               <div id="im" class="v" style="margin: 5px ;background-color: blue ;color: white;"  onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">Input Message</div>
	               <div id="sq" class="v" style="margin: 5px ;background-color: blue ;color: white;"  onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">Store Quantity</div>
	              
	            </div> 
	       </div> -->
	       <br>
	  <!--      <div id="temp" class="tt" style="width: 550px;border: 1px solid black ;min-height: 100px">
	      
	      <div id="tempblock" style="  border: 1px solid black ;  max-width: 440px;margin: 10px auto ; position: relative;min-width: 300px;background-color: cyan;min-height: 100px ">
	       <img id="imgvbl11" src="../images/final.png" style="float: right;display: none" onclick="deleteSegment(this.id);"/>
	       <div id="blkinner" style="  border: 1px hidden;  max-width: 440px;height: 50px;margin: 10px auto ; position: relative;min-width: 300px"  onmouseover="changeColorOvr(this.id)" onmouseout="changeColorOt(this.id)">
	         <img id="imgvbl22" src="../images/final.png" style="float: right;display: none" onclick="deleteSegment(this.id);"/>
	            <div id="vbl" class="variable" style="width: 90px;background-color: #EEEEEE;margin-top: 5px;margin-left: 5px;font-size:x-large ;height: 35px;float: left;border: 1px groove activeborder;" onclick="showdrop(this.id);">variable </div>
	           
	           
	            <div style=" left: 96px;  top: 19px;  width: 78px;  border-top: 1px solid; position: absolute;"></div>
	            
	          
   
   
   
  
  
	            <div id="condition"  style="width: 90px;background-color: #EEEEEE;height: 35px;margin-top: 5px;margin-left: 75px;font-size: x-large;border: 1px groove activeborder;float: left;">condition</div> 
	            
	          
	            <div style=" left: 265px;  top: 19px;  width: 68px;  border-top: 1px solid; position: absolute;"></div>
	             
	          
   
   
   
  
  
	            <div id="vbl" class="variable"  style="width: 80px;background-color: #EEEEEE;height: 35px;margin-top: 5px;font-size: x-large;float: left;border: 1px groove activeborder;margin-right: 5px;margin-left: 65px">variable</div>  
	           
	        
               
	         </div>
	      
	      </div>
	      
	       </div> -->
		      
		       
		     <!--    <div id="end">
	         <div id="end" style="width: 70px;background-color: green;min-height: 25px;text-align: center;font-size: 20px ;margin: 6px auto;">End</div>
	       </div> -->
		       <!-- <div id="tmp" style="width: 200px;height: 50px;border: 1px solid black;">
	                
	            <input type="text" onclick="alert('click');" onchange="alert('hi');">   
	            </div>
	  -->
		       
		   </div>
	     </div>
	 </div>
	 
	</div>
	
		  
	          
</div>

<!--  <div id="ddbar" style="display: none;border: 1px solid black;width: 150px;background-color: #EFC19B">
	              <div style="margin: 5px ;background-color: black ;color: white;" align="center">Available Option</div>
	               <div id="ev" class="v" style="margin: 5px ;background-color: blue ;color: white;" onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">Enter Value</div>
	               <div id="sr" class="v" style="margin: 5px ;background-color: blue ;color: white;"  onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">store Rating</div>
	               <div id="im" class="v" style="margin: 5px ;background-color: blue ;color: white;"  onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">Input Message</div>
	               <div id="sq" class="v" style="margin: 5px ;background-color: blue ;color: white;"  onmouseover="changeColorOver(this.id);" onmouseout="changeColorOut(this.id);" align="center">Store Quantity</div>
	              
	            </div> -->
	          
	            </form>

</body>

</html>