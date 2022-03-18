package org.launchcode.javawebdevtechjobsauthentication.models.dto;

public class RegisterFormDTO extends LoginDtoForm {

    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

    public String getPassword() {
        return null;
    }
}