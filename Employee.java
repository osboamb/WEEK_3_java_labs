public class Employee { 
    private String name; 
    private int idNumber;
    private String department;
    private String position; 

//CONSTRUCTOR 1
    public Employee(String inName, int inIdNumber, String inDepartment, String inPosition) {
        name = inName;
        idNumber = inIdNumber;
        department = inDepartment;
        position = inPosition;
    }

//CONSTRUCTOR 2 
    public Employee(String inName, int inIdNumber) {
        name = inName;
        idNumber = inIdNumber;
        department = "";
        position = "";
    }

//CONSTRUCTOR 3 
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
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