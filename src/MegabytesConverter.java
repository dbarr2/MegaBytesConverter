public class MegabytesConverter {

    //Write main method for test cases and so that the JVM knows where to look to execute code
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500); // Expected output ==> "2500 KB = 2 MB nad 452 KB"
        printMegaBytesAndKiloBytes(-5); // Expected output ==> "Invalid Value"
        printMegaBytesAndKiloBytes(-1024); // Expected output ==> " Invalid Value"
        printMegaBytesAndKiloBytes(5000); // Expected output ==> "5000 KB = 4 MB and 904 KB"

    }

    //Convert kilobytes to megabytes and the remaining kilobytes
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return; //Exit the function if an invalid value is given
        }

        int convertToMegabytes = kiloBytes / 1024; // Retrieve the megabytes conversion within the kilobytes
        int remainingKiloBytes = kiloBytes % 1024; // Get the remaining kilobytes within the megabytes

        System.out.println(kiloBytes + " KB = " + convertToMegabytes + " MB and " +
                remainingKiloBytes + " KB");

    }

}
