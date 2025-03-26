package factory;

import dao.AnimalTable;
import dao.mock.MockAnimalTable;

public class TablesFactory {
    public static AnimalTable getAnimalTable(){
        return new AnimalTable();
    }

    public static MockAnimalTable getMockAnimalTable(){
        return new MockAnimalTable();
    }
}
