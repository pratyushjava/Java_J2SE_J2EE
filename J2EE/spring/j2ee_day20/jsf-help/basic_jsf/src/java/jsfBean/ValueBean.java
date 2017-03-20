package jsfBean;

import java.util.*;
import javax.swing.*;
import javax.faces.event.*;

public class ValueBean implements ValueChangeListener{
String som = "";
private Date today = new Date();

public void processValueChange(ValueChangeEvent ce){

System.out.println("in valueChange fired on : Component   "+ ce.getComponent().getId() +"  New Val=  " +ce.getNewValue());
}

public String getSom(){
return som;
}

public void setSom(String som){
this.som = som;
}

public Date getToday(){
return today;
}

public void setToday(Date today) {
this.today = today;
}
}