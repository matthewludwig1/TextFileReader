/*
  Matthew Ludwig
  1 April 2019
  This program reads text files.
 */

package textfilereader;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
import java.io.*;
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            String fileName;
            fileName = JOptionPane.showInputDialog("Please enter a file name(case sensitive): ");
            BufferedReader readFile = new BufferedReader(new FileReader(fileName));
            String line = "";
            String output = "";
            while((line = readFile.readLine()) != null){//EOF
            System.out.println(line);
            }
          }
        catch (FileNotFoundException excp) { 
            System.out.println(excp + "\n" + "Enter a new file");
        }
        catch (NullPointerException x) {  // exit key
            System.out.println(x + " Program terminated.");
        }
        
    
    }
}