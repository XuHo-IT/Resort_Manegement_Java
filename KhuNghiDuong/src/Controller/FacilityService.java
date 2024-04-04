package Controller;

import Model.Facility;
import Model.House;
import Model.Room;
import Model.Villa;
import View.Validation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FacilityService {
    private Map<Facility, Integer> facilityUsageMap;
    private ArrayList<Facility> list;

    public void FacilityRepository() {
        this.facilityUsageMap = new LinkedHashMap<>();
        this.list = new ArrayList<>();
    }

    public void readFile(){
    String filePath = "D:\\\\IdeaProjects\\\\LAB\\\\LAB_Bank\\\\fileCard.txt";
        try (
    BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            double usableArea = Double.parseDouble(tokens[2]);
            double rentalCost = Double.parseDouble(tokens[3]);
            int maximumPeople = Integer.parseInt(tokens[4]);
            int floorNumber = Integer.parseInt(tokens[8]);
            switch (tokens[5]) {
                case ("Villa") -> {
                    double poolArea = Double.parseDouble(tokens[7]);
                    Villa villa = new Villa(tokens[0], tokens[1], usableArea, rentalCost, maximumPeople, tokens[5], tokens[6], poolArea, floorNumber) {
                    };
                    this.list.add(villa);
                }
                case ("House") -> {
                    House house = new House(tokens[0], tokens[1], usableArea, rentalCost, maximumPeople, tokens[5], tokens[6], floorNumber);
                    this.list.add(house);
                }
                case ("Room") -> {
                    Room room = new Room(tokens[0], tokens[1], usableArea, rentalCost, maximumPeople, tokens[5], tokens[6]);
                    this.list.add(room);
                }
            }
        }
    } catch (
    IOException e) {
        e.printStackTrace();
    }
    }

    public void addNew(){
        Scanner sc = new Scanner(System.in);
        Validation validation = new Validation();
        System.out.println("Choose type of Room");
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        int choice = validation.inputInt("Enter choice:",1,4);
        switch (choice){
            case 1:
                Villa villa= new Villa();
                this.list.add(villa.addNew());
                break;
            case 2:
                House house= new House();
                this.list.add(house.addNew());
                break;
            case 3:
                Room room= new Room();
                this.list.add(room.addNew());
                break;
            default:
                return;
        }
    }
}
