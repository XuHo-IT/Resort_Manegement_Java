package Repository;

import Model.Facility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public interface FacilityRepository {
    void readFile();

    void writeFile();
}


