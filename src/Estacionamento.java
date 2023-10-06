import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Estacionamento {
    /**
     * Instance variables
     */

    /**
     * Entry time in string format
     */
    private Date entryTime;
    /**
     * Exit time in string format
     */
    private Date exitTime;
    /**
     * Price for each 15 minutes of parking
     */
    private double pricePer15Min;
    /**
     * Total amount paid for parking
     */
    private double totalPaid;
    /**
     * For writing data to a file
     */
    private FileWriter file;

    /**
     * Constructor for the Estacionamento class
     * @param pricePer15Min
     */
    public Estacionamento(double pricePer15Min) {
        this.pricePer15Min = pricePer15Min;
        this.totalPaid = 0;
        try {
            /**
             * Initialize the FileWriter to write data to the "estacionamento.txt" file
             */
            this.file = new FileWriter("estacionamento.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to calculate payment based on entry and exit times
     * @param entryTime
     * @param exitTime
     */
        public void calculatePayment(Date entryTime, Date exitTime) {
        /**
         * Calculate time difference in minutes
         */
        long parkingTime = (exitTime.getTime() - entryTime.getTime());

        /**
         * Calculate the amount to be paid based on parking time
         */
        double amount = (parkingTime / 15.0) * pricePer15Min;
        totalPaid += amount;

        /**
         * Write the amount to be paid to the file
         */
        try {
            file.write("Amount to pay: " + amount + "€\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to close the file after the operation
     */
    public void closeFile() {
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to get the total amount paid for parking
     * @return
     */
    public double getTotalPaid() {
        return totalPaid;
    }
}
