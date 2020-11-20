package com.example.lav;

import android.content.Context;
import android.widget.Toast;

import java.util.regex.Pattern;

public class CredentialsChecker {

    final static int PASSWORD_MINIMAL_LENGTH = 6;
    final static int PASSWORD_MAXIMAL_LENGTH = 12;

    final static String EMAIL_EMPTY_MASSAGE = "Please Enter An Email Address";
    final static String INVALID_EMAIL_ADRESS = "The e-mail Address Does Not Follow The Requirements." +
            "For Example: example@gmail.com";
    final static String PASSWORD_EMPTY_MASSAGE = "Please Enter A Password";
    final static String PASSWORD_LENGTH_MASSAGE = "The Password's Length Has To Be Between 6 to 12 Characters\"";
    final static String PASSWORD_UPPER_AND_LOWER_CASE_MASSAGE = "The Password Has To Contain At Least One Lowercase Character And One Uppercase Character";
    final static String PASSWORD_DIGIT_CASE_MASSAGE = "The Password Has To Contain At Least One Digit";
    final static String REGISTERATION_SUCCEEDED_CASE_MASSAGE = "Registration Succeded";


    /**
     * CredentialsChecker checks the validity of the user credentials.
     * <p>
     * It checks and updates checkerStatus accordingly.
     * The check is going "top down" (from the first TextField to last).
     */
    private boolean is_email_ok;
    private boolean is_password_ok;
    private Context context;

    /**
     * <h4>Initializes the current Activity you want to test.</h4>
     * <div>Use checkEmail or checkPassword to check to input text.</div>
     * <div>this class will represent a toast massage according to the input text</div>
     *<div>The requirements are universal requirements for registering a new user</div>
     */
    public CredentialsChecker(Context c) {
        context=c;
    }
    /**
     * .
     * </h4>Checks whether the e-mail address is valid according to the requirements</h4>
     * <diV>for example:</diV>
     * <div>example@gmail.com</div>
     * <div>example123@gmail.com</div>
     * Example@gmail.com
     */
    public  boolean checkEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (email == null || email.isEmpty()) {
            // this.checkerStatus = EMPTY_EMAIL_MESSAGE;
            showToast(EMAIL_EMPTY_MASSAGE);
            return false;
        }

        boolean isEmailValid = pattern.matcher(email).matches();
        if (!isEmailValid) {
            //  this.checkerStatus = INVALID_EMAIL_MESSAGE;
            showToast(INVALID_EMAIL_ADRESS);
            return false;
        }
        is_email_ok=true;
        createNewUserMassage(REGISTERATION_SUCCEEDED_CASE_MASSAGE);
        return true;
    }
    /**
     * <h4>password needs to meet the following conditions:</h4>
     * 1. <div>Password's length has to be between 6 to 12 characters</div>
     * 2. <div>Password must contain at least one uppercase and one lowercase character</div>
     * 3.<div> Password must contain a Digit</div>
     * 4.<div> Password must not contain the email address</div>
     */
    public  boolean checkPassword(String password) {

        if (password == null || password.isEmpty()) {

            showToast(PASSWORD_EMPTY_MASSAGE);
            return false;
        }
        if (password.length() < PASSWORD_MINIMAL_LENGTH || password.length() > PASSWORD_MAXIMAL_LENGTH) {


            showToast(PASSWORD_LENGTH_MASSAGE);
            return false;
        }
        if (!doesThePasswordHasAtLeastOneUpperAndLowercase(password)) {
            showToast(PASSWORD_UPPER_AND_LOWER_CASE_MASSAGE);
            return false;
        }

        if(!doesThePasswordHasAtLeastOnedigit(password)){
            showToast(PASSWORD_DIGIT_CASE_MASSAGE);
            return false;
        }

        is_password_ok=true;
        createNewUserMassage(REGISTERATION_SUCCEEDED_CASE_MASSAGE);
        return true;
    }

    private  boolean doesThePasswordHasAtLeastOneUpperAndLowercase(String password) {
        boolean containsLower = false;
        boolean containsUpper = false;
        char currentChar;

        for (int i = 0; i < password.length(); i++) {
            currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar))
                containsUpper = true;
            else if (Character.isLowerCase(currentChar))
                containsLower = true;
        }
        return containsLower && containsUpper;

    }
    private boolean doesThePasswordHasAtLeastOnedigit(String password) {
        char currentChar;
        for (int i = 0; i < password.length(); i++) {
            currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                return true;
            }
        }
        return false;
    }
    private  CharSequence extractUsernameFrom(String email) {
        // From our perspective, username = the part before the @ sign.

        int atIndex = 0;
        for (int index = 0; index < email.length(); index++) {
            if (email.charAt(index) != '@')
                atIndex++;
            else
                return email.substring(0, atIndex);
        }
        return "";
    }
    private  void showToast(String massage) {
        Toast.makeText(context, massage, Toast.LENGTH_LONG).show();
    }

    private void createNewUserMassage(String massage){
        if(is_email_ok &&is_password_ok){
            Toast.makeText(context, massage, Toast.LENGTH_LONG).show();
        }
    }
}
