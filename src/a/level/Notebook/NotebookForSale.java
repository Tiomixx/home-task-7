package a.level.Notebook;

import a.level.computer.Computer;

public class NotebookForSale extends Computer.ComputerBuilder {
    public static void main(String[] args) {
        Computer notebookForSale = new Computer.ComputerBuilder()
                .setBrandName("Lenovo")
                .setWeight(2.53)
                .setBrandName("Dell Inspiron G3")
                .setColor("Black")
                .setComputerMemoryType("DDR4 - 2666 MHz")
                .setCountryOfManufact("China")
                .setHardDiskSize("512 GB SSD")
                .setDisplaySize("15.6'' (1920x1080) Full HD")
                .setRAM("16 GB")
                .setProcessor("Intel Core i7-8750H (2.2 - 4.1 GHz)")
                .setPrice(1000.00)
                .setVideocard(" nVidia GeForce GTX 1050 Ti, 4GB")
                .build();
        System.out.println("Name: " + notebookForSale.getBrandName() + ";");
        System.out.println("Price: " + notebookForSale.getPrice() + "$;");
        System.out.println("Processor: " + notebookForSale.getProcessor() + ";");
        System.out.println("Memory Type: " + notebookForSale.getComputerMemoryType() + ";");
        System.out.println("RAM: " + notebookForSale.getRAM() + ";");
        System.out.println("Display size: " + notebookForSale.getDisplaySize() + ";");
        System.out.println("Weight: " + notebookForSale.getWeight() + " KG;");
        System.out.println("Videocard: " + notebookForSale.getVideocard() + ";");
        System.out.println("Hard disk: " + notebookForSale.getHardDiskSize() + ";");
        System.out.println("Color: " + notebookForSale.getColor() + ";");
        System.out.println("Country: " + notebookForSale.getCountryOfManufact() + ";");


    }
}
