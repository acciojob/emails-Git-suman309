package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character

       /* if(oldPassword.equals(this.password) && newPassword.length()>=8
                && newPassword.matches(".*[A-Z].*")
                && newPassword.matches(".*[a-z].*")
                && newPassword.matches(".*[0-9].*")
                && newPassword.matches(".*[^a-zA-Z0-9 ].*")){
            this.password=newPassword;
            System.out.println("Password changed successfully");
        } else {
            System.out.println("Your Current Password is not in our database");
        }
    }*/
        //-----------------------------------------------------------
            if (password.equals(oldPassword)) {
                if (passWordValidation(newPassword)) {
                    System.out.println("Password changed successfully");
                    this.password = newPassword;
                } else {
                    System.out.println("The new password is not valid !!!");
                }
            } else {
                System.out.println("Your Current Password is not in our database");
            }
        }

        private boolean passWordValidation (String password){
            return password.length() >= 8 && password.matches(".[A-Z].")
                    && password.matches(".[a-z].") && password.matches(".\\d.")
                    && password.matches(".[^a-zA-Z0-9].");
    }
}


