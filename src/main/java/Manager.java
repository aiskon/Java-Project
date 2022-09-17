/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Manager {
    private String Username;
    private String FullName;
    private String Password;
    private String Gender;
    
    public Manager(String Username, String FullName, String Password, String Gender){
        this.Username = Username;
        this.FullName = FullName;
        this.Password = Password;
        this.Gender = Gender;
    }

    Manager() {
        
    }
//////////////    
    public void SetUsername(String Username){
        this.Username = Username;
    }
    public void SetFullName(String FullName){
        this.FullName = FullName;
    }
    public void SetPassword(String Password){
        this.Password = Password;
    }
    public void SetGender(String Gender){
        this.Gender = Gender;
    }
///////////////////    
    public String GetUsername(){
        return Username;
    }
    public String GetFullName(){
        return FullName;
    }
    public String GetPassword(){
        return Password;
    }
    public String GetGender(){
        return Gender;
    }
}


