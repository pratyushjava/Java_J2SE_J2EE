<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<div>
  <table border="0" cellspacing="0" cellpadding="0" align="center">
    <tbody>
    <tr><td><center><h1>Agency Login</h1></center></td></tr>
      <tr>
      
        <td><label for="iataText" id="iataLabel">agency/corporate id number:</label></td>
        <td><input type="text" name="iata" maxlength="10" id="iataText" onblur="fieldToUpper(this)" onchange="fieldToUpper(this)" />
          <br /></td>
      </tr>
      <tr>
        <td><label for="iata_pwText" id="iata_pwLabel">agency/corporate password:</label></td>
        <td><input name="iata_pw" type="password" maxlength="8" id="iata_pwText" onblur="fieldToUpper(this)" onchange="fieldToUpper(this)" /></td>
      </tr>
      <tr>
        <td colspan="2"><table border="0" cellpadding="0" cellspacing="0" width="100%">
          <tbody>
            <tr>
              <th align="left">Log In Now</th>
            </tr>
            <tr>
              <td>Enter your agency/corporate ID number and password and click to log in.
                <div margin-right:12px="">
                  <input type="button" name="b_login" id="b_login" alt="Log-In" value="login" onclick="javascript:submitForm()" />
                </div></td>
            </tr>
          </tbody>
        </table></td>
      </tr>
    </tbody>
  </table>
  <table border="0" cellpadding="0" cellspacing="0" width="100%">
    <tbody>
      <tr>
        <th>Register Your Agency</th>
      </tr>
      <tr>
        <td>If you haven't already registered with us, fill out an application here.
          <div margin-right:8px;=""><a href="http://www.spicejet.com/AgencyRegistration.asp"><img src="https://book.spicejet.com/skylights/images/AG/b-register.gif" alt="Register" name="b_register" width="130" height="24" border="0" id="b_register" /></a></div></td>
      </tr>
    </tbody>
  </table>
  <table align="center" border="0" cellpadding="0" cellspacing="0" width="692">
    <tbody>
      <tr>
        <th>New Cash Deposit Slip</th>
      </tr>
      <tr>
        <td><p>Dear Travel Partner</p>
          <p>We have initiated an automated Cash Management System in partnership with ICICI Bank. From now onwards all<strong>CASH</strong> deposits made by you will have to be made in the special cash deposit slip that can be downloaded by pressing the download button below.</p>
          <p font-weight:bold="">Please note that from now onwards all Cash deposits have to be made using this Deposit slip only.</p>
          <p>Though the deposit slip can be downloaded from the website, in case you still need it please e-mail us at<a href="mailto:salesdesk@spicejet.com">salesdesk@skyrush.com</a> with your Agency ID.</p>
          <p>Kindly continue to adopt the current procedure of faxing a receipt of the deposit slip to us in the prescribed format.</p>
          <p>Regards,<br />
            <strong>skyrush sales team</strong></p>
          <center>
            <strong><a href="http://www.spicejet.com/SpiceJet%20Cash%20Deposit%20Slip%20Soft%20CopyV1.0.doc"><img src="https://book.spicejet.com/skylights/images/AG/download.gif" alt="" border="0" /></a></strong>
          </center></td>
      </tr>
    </tbody>
  </table>
  <p>&nbsp;</p>
</div>

</body>
</html>