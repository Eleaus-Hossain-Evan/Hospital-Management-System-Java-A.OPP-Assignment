/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aoppassignment;

/**
 *
 * @author User
 */
public abstract class Person {
    protected int Id;
    protected String Name;
    protected int Age;
    protected String PhoneNumber;
    protected String Email;
    protected String Username;
    protected String Password;
    protected String Address;
    
    
    //--inheritance--
    public void setId(int Id){
        this.Id = Id;
        
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }
    
    public int getAge() {
        return Age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getAddress() {
        return Address;
    }
    //--inheritance--
    
    void LogOn() {
        
    }
}
