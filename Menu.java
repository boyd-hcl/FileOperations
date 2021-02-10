package FileOperations;

public class Menu {
    //Displays the function list for the user to call.
    public void display(){
        System.out.println("Please select the operation you wish to perform.\n"
        + "(1) Read the contents of an existing file\n"
        + "(2) Write to a file (deletes the existing contents of a file.\n"
        + "(3) Append to an existing file");
    }
    //Calls the appropriate function based on the response. 
    //It asks for input again if the input is invalid
    public void processResponse(){
        boolean actionPerformed = false;
        while(!actionPerformed){
            try{
                int input = Integer.parseInt(System.console().readLine());
                switch(input){
                    case 1:
                    System.out.println("Read");
                    actionPerformed = true;
                    break;
                    case 2:
                    System.out.println("Write");
                    actionPerformed = true;
                    break;
                    case 3:
                    System.out,println("Append");
                    actionPerformed = true;
                    break;
                    default:
                    System.out.println("You have enetered an invalid input. \n"
                    + "Please imput the number corresponding to the function you would like to perform.");
                }
            }
            catch(Exception e){
                System.out.println("Not a valid menu option. Please input the number corresponding to your selection.");
            }
        }
    }
}
