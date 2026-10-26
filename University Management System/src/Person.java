public class Person {
    private String name;
    private String ID;
    private String email;

    // Default Constructor Method
    public Person(String name,String ID, String email) {
     this.name = name;
     this.ID = ID;
     this.email = email;
    }
    // Getters & Setters
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public String getEmail(){
        return email;
    }
    public void setName(String newName){
        this.name = name;
    }
    public void setID(String newID){
        this.ID = newID;
    }
    public void setEmail(String newEmail){
        this.email = email;
    }
    // toString method
    public String getDetails(){
        return "Name: " + name + "\n" + "ID: " + ID + "\n" + "Email: " + email;
    }
}
