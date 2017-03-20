

package guess;

import java.util.Random;


public class MyGuesserBean {
    private int userNumber;
    private int randomInt;
    private String response;
    private int maximum;
   // private boolean maximumSet;
    private int minimum;
 //   private boolean minimumSet;

    public MyGuesserBean() {
        Random randomGR = new Random();
        randomInt = randomGR.nextInt(10)+1;
        System.out.println("Duke's number: " + randomInt);
    }

    public void setUserNumber(int user_number) {
        userNumber = user_number;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public String getResponse() {
        if (userNumber == randomInt) {
            return "Yes! You got it!";
        } else {
            return "Sorry, " + userNumber + " is incorrect.";
        }
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
		System.out.println("in set max"+maximum);
     //   this.maximumSet = true;
    }

    public int getMinimum() {
        return (minimum);
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
        //this.minimumSet = true;
    }
}
