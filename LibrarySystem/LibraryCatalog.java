package LibrarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<ReadingMaterial> catalog;

    public LibraryCatalog() {
        catalog = new ArrayList<>();
    }

    public void addReadingMaterial(ReadingMaterial material) {
        catalog.add(material);
    }

    public void printCatalog() {
        for (ReadingMaterial material : catalog) {
            System.out.println(material.getDescription());
        }
    }

    public ReadingMaterial searchByTitle(String title) {
        for (ReadingMaterial material : catalog) {
            if (material.getTitle().equalsIgnoreCase(title)) {
                return material;
            }
        }
        return null; // not found
    }
}
