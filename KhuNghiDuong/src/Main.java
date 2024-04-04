import Model.Employee;
import Model.Villa;
import View.Validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dob1 = dateFormat.parse("12/10/2012");
        Date dob2 = dateFormat.parse("12/10/2004");
        Employee employee1 = new Employee("NV-1234", "Dbrr", dob1, "Male", "123456789", "0965960010", "dakbuhlmao", "bodoi", "chutich", 120.0);
        Employee employee2 = new Employee("NV-123456", "dbrr", dob2, "Male", "1234567890", "09659600102", "dakbuhlmao", "bodoi", "chutich", 120.0);
        Validation val = new Validation();
        System.out.println(val.validateAge(employee1.getDob()));
    }
}