import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class MainComputerHardware {

    public static void main(String [] args)
    {
        try {

            //create reader
            BufferedReader in = new BufferedReader(new FileReader("ComputerHardware.txt"));

            //create array of object
            ComputerHardware[] comp = new ComputerHardware[3];

            String indata = null;
            int index = 0;
            while((indata = in.readLine())!= null)
            {
                StringTokenizer st = new StringTokenizer(indata, ";");
                String type = st.nextToken();
                String sNumber = st.nextToken();
                double price = Double.parseDouble(st.nextToken());
                int quantity = Integer.parseInt(st.nextToken());

                comp[index] = new ComputerHardware(type, sNumber, price, quantity);
                index++;
            }



       /* //coding to implement array of object
       //ask user to enter input and create object in array
        for(int i = 0; i<comp.length; i++)
        {
            //ask user to enter the input
            String type = JOptionPane.showInputDialog("Enter type");
            String serialNum = JOptionPane.showInputDialog("Enter serial number");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity"));

            //create object
            comp[i] = new ComputerHardware(type,serialNum,price,quantity);

        }
*/
            //display
            for (int i = 0; i < comp.length; i++) {
                System.out.println(comp[i]);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }
}
