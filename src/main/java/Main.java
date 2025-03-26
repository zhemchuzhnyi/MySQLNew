import dao.AbsTable;
import dao.AnimalTable;
import dto.Animal;
import utils.ConnectionManager;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        AnimalTable table = new AnimalTable();
        System.out.println(table.findAll());
    }
}
