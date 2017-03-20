<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>feedback / suggestions</h2>
<div>
  <form action="http://www.spicejet.com/FeedbackThanks.asp" method="post" name="frmFeedback" id="frmFeedback">
    <table width="80%" border="0" cellspacing="1" cellpadding="0" align="center">
      <tbody>
        <tr>
          <td width="50%">name*</td>
          <td><input id="txtName" name="txtName" maxlength="50" /></td>
        </tr>
        <tr>
          <td>email address*</td>
          <td><input id="txtEmail" name="txtEmail" maxlength="100" /></td>
        </tr>
        <tr>
          <td>mobile*</td>
          <td><input id="txtPhone" name="txtPhone" maxlength="12" /></td>
        </tr>
        <tr>
          <td>pnr</td>
          <td><input id="txtPNR" name="txtPNR" maxlength="6" /></td>
        </tr>
        <tr>
          <td>feedback / suggestion*</td>
          <td><select id="feedbk" name="feedbk">
             							    
            <option value="main" selected="selected">-- select --</option>
             								
            <option value="sug">suggestions</option>
             								
            <option value="cmplt">complaints</option>
             								
            <option value="srvinfo">service information</option>
             								
            <option value="trvlAg">travel agencies</option>
             								
            <option value="oth">others</option>
             							
          </select></td>
        </tr>
        <tr>
          <td>comments</td>
          <td><textarea id="taFeedback" name="taFeedback" rows="5" cols="20"></textarea></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" value="submit" onclick="javascript: return frmSubmit();" /></td>
        </tr>
      </tbody>
    </table>
  </form>
</div>
<div id="footer" align="center">
<div>
<br />


</body>
</html>