package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
    public static void main(String[] args) throws Exception {
        List<Employee> list = new ArrayList<>();
        String path = "/home/junior/files/employee.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] employeeSplitted = employeeCsv.split(",");

                list.add(new Employee(employeeSplitted[0], Double.parseDouble(employeeSplitted[1])));

                employeeCsv = br.readLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}
