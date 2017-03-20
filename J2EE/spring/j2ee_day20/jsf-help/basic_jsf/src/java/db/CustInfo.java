package db;
public class CustInfo {

String subId;
String firstName;
String lastName;


public CustInfo(String f1,String f2,String f3) {
subId = f1;
firstName = f2;
lastName =f3;

}

public String getSubId() {
return subId;
}

public String getFirstName() {
return firstName;
}

public String getLastName() {
return lastName;
}

}
