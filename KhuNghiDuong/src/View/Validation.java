package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    Scanner sc = new Scanner(System.in);

    public Validation() {
    }

    public boolean validateEmployeeId(String employeeID) {
        return employeeID.matches("NV-\\d{4}");
    }

    public boolean validateCustomerId(String employeeID) {
        return employeeID.matches("KH-\\d{4}");
    }

    public boolean validateName(String name) {
        String[] nameParts = name.split(" ");
        for (String part : nameParts) {
            if (!Character.isUpperCase(part.charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public int inputInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }

    public double inputDouble(String mess, double min, double max) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                double number = Double.parseDouble(input);
                if (number < min || number > max) {
                    System.out.print("Please input between " + min + ", " + max + ": ");
                    continue;
                }
                return number;
            } catch (Exception e) {
                System.out.print("Please input an double number: ");
            }
        }
    }

    public String inputString(String mess, String regex) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.print("Please input match regex(" + regex + ").");
                continue;
            }
            return input;
        }
    }
    public boolean inputCustomerType(String mess, String regex) {
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.print("Please input matching regex(" + regex + ").");
                continue;
            }
            return true; // Input matches regex
        }
    }
        public boolean inputEmployeePosition(String mess, String regex) {
            System.out.print(mess);
            while (true) {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    System.out.print("Please input matching regex(" + regex + ").");
                    continue;
                }
                return true;
            }
            }




        public boolean validateAge(Date dob) {
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.setTime(dob);
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());
        int age = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dobCalendar.get(Calendar.MONTH) ||
                (today.get(Calendar.MONTH) == dobCalendar.get(Calendar.MONTH) &&
                        today.get(Calendar.DAY_OF_MONTH) < dobCalendar.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        return age >= 18;
    }

    public boolean validateCid(String cid) {
        return cid.matches("0\\d{9}") && cid.length() == 9 || cid.length() == 12;
    }


    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches("0\\d{9}");
    }

    public boolean validateSalary(double salary) {
        return salary > 0;
    }

    public boolean checkInputYN(String mess) {
        System.out.println(mess);
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }

            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public static Date ParseString(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("NV-yyyy");
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            return null;
        }
    }
}
