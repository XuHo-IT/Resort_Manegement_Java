//package Controller;
//
//import Model.*;
//import View.Validation;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.Scanner;
//
//public class CustomerService {
//    private ArrayList<Person> list;
//
//    public void FacilityRepository() {
//        this.list = new ArrayList<>();
//    }
//    public void readFile(){
//        String filePath = "D:\\\\IdeaProjects\\\\LAB\\\\LAB_Bank\\\\fileCard.txt";
//        try (
//                BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            while ((line = br.readLine()) != null) {
//                String[] tokens = line.split(",");
//                double usableArea = Double.parseDouble(tokens[2]);
//                double rentalCost = Double.parseDouble(tokens[3]);
//                int maximumPeople = Integer.parseInt(tokens[4]);
//                int floorNumber = Integer.parseInt(tokens[8]);
//                switch (tokens[5]) {
//                    case ("Villa") -> {
//                        double poolArea = Double.parseDouble(tokens[7]);
//                        Villa villa = new Villa(tokens[0], tokens[1], usableArea, rentalCost, maximumPeople, tokens[5], tokens[6], poolArea, floorNumber) {
//                        };
//                        this.list.add(villa);
//                    }
//                    case ("House") -> {
//                        House house = new House(tokens[0], tokens[1], usableArea, rentalCost, maximumPeople, tokens[5], tokens[6], floorNumber);
//                        this.list.add(house);
//                    }
//                    case ("Room") -> {
//                        Room room = new Room(tokens[0], tokens[1], usableArea, rentalCost, maximumPeople, tokens[5], tokens[6]);
//                        this.list.add(room);
//                    }
//                }
//            }
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addNew(){
//        Validation val = new Validation();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose type of Person");
//        System.out.println("1.Add New Employee");
//        System.out.println("2.Add new Customer");
//        int choice = val.inputInt("Enter choice; ",1,3);
//        switch (choice){
//            case 1:
//                Employee employee = new Employee();
//                this.list.add(employee.addNew());
//                break;
//            case 2:
//                Customer customer = new Customer();
//                this.list.add(customer.addNew());
//                break;
//            default:
//               return;
//        }
//    }
//
//}
