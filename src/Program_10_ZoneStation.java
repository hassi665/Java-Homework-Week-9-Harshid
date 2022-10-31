/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program_10_ZoneStation {
    public static void main(String[] args) {
        System.out.println("List Of Zone 1 Tube Stations Name:" +
                "\n" + "(Aldgate"
                + " , " + "Bank"
                + " , " + "Cannon Street"
                + " , " + "Hyde Park"
                + " , " + "Oxford Circus)" + "\n");

        System.out.println("Enter Station Name From Above List");
        Scanner sc = new Scanner(System.in);
        String stationName = sc.nextLine();

        //convert name to lower case and send to method
        LinePass(stationName.toLowerCase());
    }

    private static void LinePass(String stationName) {

        //fill arraylist for data
        ArrayList<String> aldgate_line = new ArrayList<>();
        aldgate_line.add("Hammersmith line");
        aldgate_line.add("Elizabeth line");
        aldgate_line.add("City line");

        ArrayList<String> bank_line = new ArrayList<>();
        bank_line.add("Northern line");
        bank_line.add("Waterloo line");
        bank_line.add("City line");

        ArrayList<String> cannon_line = new ArrayList<>();
        cannon_line.add("District line");
        cannon_line.add(" Circle line");

        ArrayList<String> hyde_line = new ArrayList<>();
        hyde_line.add("Central Line");
        hyde_line.add("Piccadilly Line");

        ArrayList<String> oxford_line = new ArrayList<>();
        oxford_line.add("Bakerloo line");
        oxford_line.add("Victoria line");
        oxford_line.add("Central");

        switch (stationName) {
            case "aldgate":
                for (int i = 0; i < aldgate_line.size(); i++) {
                    System.out.println(aldgate_line.get(i));
                }
                break;

            case "bank":
                for (int i = 0; i < bank_line.size(); i++) {
                    System.out.println(bank_line.get(i));
                }
                break;

            case "cannon street":
                for (int i = 0; i < cannon_line.size(); i++) {
                    System.out.println(cannon_line.get(i));
                }
                break;

            case "hyde park":
                for (int i = 0; i < hyde_line.size(); i++) {
                    System.out.println(hyde_line.get(i));
                }
                break;

            case "oxford circus":
                for (int i = 0; i < oxford_line.size(); i++) {
                    System.out.println(oxford_line.get(i));
                }
                break;

            //if right station name not selected
            default:
                System.out.println("Please enter valid station name from list");
        }
    }
}