package a.Level.homeworkNo7.Notebook;

import a.Level.homeworkNo7.Computer.Computer;

public class NotebookForSale extends Computer {
    public static void main(String[] args) {
        NotebookForSale notebookForSale = new NotebookForSale();
        notebookForSale.setWeight(2.53);
        notebookForSale.setBrandName("Dell Inspiron G3");
        notebookForSale.setColor("Black");
        notebookForSale.setComputerMemoryType("DDR4 - 2666 MHz");
        notebookForSale.setCountryOfManufact("China");
        notebookForSale.setHardDiskSize("512 GB SSD");
        notebookForSale.setDisplaySize("15.6'' (1920x1080) Full HD");
        notebookForSale.setRAM("16 GB");
        notebookForSale.setProcessor("Intel Core i7-8750H (2.2 - 4.1 GHz)");
        notebookForSale.setPrice(1000.00);
        notebookForSale.setVideocard(" nVidia GeForce GTX 1050 Ti, 4GB");

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
