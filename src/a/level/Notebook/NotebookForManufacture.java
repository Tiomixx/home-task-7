package a.level.Notebook;

import a.level.computer.Computer;

public class NotebookForManufacture extends Computer.ComputerBuilder {
    public static void main(String[] args) {
        Computer notebookForManufacture = new Computer.ComputerBuilder()
                .setGetKeyboardLanguage("Eng/Rus")
                .setDisplaySupplier("LG")
                .setDetailsCost("600 USD")
                .setSerialNumber("135792468")
                .setKeyboardSupplier("China")
                .setMotherboardSupplier("MSI")
                .build();

        System.out.println("Keyboard language: " + notebookForManufacture.getGetKeyboardLanguage());
        System.out.println("Keyboard supplier: " + notebookForManufacture.getKeyboardSupplier());
        System.out.println("Display supplier: " + notebookForManufacture.getDisplaySupplier());
        System.out.println("Details cost: " + notebookForManufacture.getDetailsCost());
        System.out.println("Serial number: " + notebookForManufacture.getSerialNumber());
        System.out.println("Motherboard supplier: " + notebookForManufacture.getMotherboardSupplier());
    }


}
