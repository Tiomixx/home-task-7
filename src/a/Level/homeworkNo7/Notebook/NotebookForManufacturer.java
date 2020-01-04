package a.Level.homeworkNo7.Notebook;

import a.Level.homeworkNo7.Computer.Computer;

public class NotebookForManufacturer extends Computer {
    public static void main(String[] args) {
        NotebookForManufacturer notebookForManufacturer = new NotebookForManufacturer();
        notebookForManufacturer.setGetKeyboardLanguage("Eng/Rus");
        notebookForManufacturer.setDisplaySupplier("LG");
        notebookForManufacturer.setDetailsCost("600 USD");
        notebookForManufacturer.setSerialNumber("135792468");
        notebookForManufacturer.setKeyboardSupplier("China");
        notebookForManufacturer.setMotherboardSupplier("MSI");

        System.out.println("Keyboard language: " + notebookForManufacturer.getGetKeyboardLanguage());
        System.out.println("Keyboard supplier: " + notebookForManufacturer.getKeyboardSupplier());
        System.out.println("Display supplier: " + notebookForManufacturer.getDisplaySupplier());
        System.out.println("Details cost: " + notebookForManufacturer.getDetailsCost());
        System.out.println("Serial number: " + notebookForManufacturer.getSerialNumber());
        System.out.println("Motherboard supplier: " + notebookForManufacturer.getMotherboardSupplier());


    }
}
