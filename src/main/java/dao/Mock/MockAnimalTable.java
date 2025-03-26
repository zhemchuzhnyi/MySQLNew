package dao.mock;

import dao.IAnimalTable;
import dto.Animal;

import java.util.List;

public class MockAnimalTable implements IAnimalTable {
    @Override
    public List<Animal> findAll() {
        return List.of(new Animal("Black", "Жужа", 5, 1, "Dog", 2));
    }

    @Override
    public Animal findById(Long searchId) {
        return new Animal("Black", "Жужа", 5, searchId, "Dog", 2);
    }
}
