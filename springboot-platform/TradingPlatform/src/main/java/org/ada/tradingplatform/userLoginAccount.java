package org.ada.tradingplatform;

public class userLoginAccount {
    // variables
    private String username;
    private String password;
    private String email;

    // constructor
    public userLoginAccount(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // setter
    public void setUsername(String username){this.username = username;}
    public void setPassword(String password){this.password = password;}
    public void setEmail(String email){this.email = password;}

    // getter
    public String getUsername(){return this.username;}
    public String getPassword(){return this.password;}
    public String getEmail(){return this.email;}
}
