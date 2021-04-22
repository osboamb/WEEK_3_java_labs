public class Employee { 
    private String name; 
    private int idNumber;
    private String department;
    private String position; 

//CONSTRUCTOR
    public Employee(String inName, int inIdNumber, String inDepartment, String inPosition) {
        name = inName;
        idNumber = inIdNumber;
        department = inDepartment;
        position = inPosition;
    }

//GETTERS

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment(){
        return department;
    }

    public String getPosition(){
        return position;
    }

//Setters 

//To String to avoid printing the memory reference
    public String toString(){
        String s = name + ", " + idNumber + ", " + department + ", " + position;
        return s;
    }

}