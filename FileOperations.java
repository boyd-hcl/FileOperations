package FileOperations;

import java.io.*;

public class FileOperations{
    private static File file;
    public static void setFile(String Activity){
        boolean fileSet = false;
        while(!fileSet){
            try{
                System.out.println("Please input the full file path of the file you would like to " + Activity);
                String input = System.console().readLine();
                file = new File(input);
                fileSet = true;

            }
            catch(Exception e){

            }
        }
    }
    public static void Append(){
        setFile("append to.");
        try{
            System.out.println("These are the current contents of the file.");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String output = br.readLine();
            while(output!=null){
                System.out.println(output);
                output = br.readLine();
            }
            br.close();
            System.out.println("Please input the line you would like to append to the file:");
            String input = System.console().readLine();
            br.close();
        }
        catch(Exception e){
            System.out.println("File is currently in use by a nother application. Please close the extrenal application and try again.");
        }
        System.out.println("Please input the line you wish to append to the file:");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(System.console().readLine());
        }
        catch(Exception e){
            
        }
    }
    public static void Read(){
        setFile("read from.");
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String output = br.readLine();
            while(output!=null){
                System.out.println(output);
                output = br.readLine();
            }
            br.close();
        }
        catch(Exception e){
            System.out.println("File is currently in use by another application. Please close the extrenal application and try again.");
        }
    }
    public static void Write(){
        setFile("write to. This will overwrite the existing contents of the file.");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            System.out.println("Please enter a single line you would like to write to the file and press enter to finish.");
            String input = System.console().readLine();
            bw.write(input);
        }
        catch(Exception e){
            System.out.println("File is already in use by another application. Please close in external application and try again.");
        }
    }
}