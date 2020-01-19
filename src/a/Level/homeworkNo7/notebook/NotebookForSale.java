package a.Level.homeworkNo7.notebook;

import a.Level.homeworkNo7.computer.Computer;

public class NotebookForSale extends Computer {
    private String countryOfManufact;
    private Double weight;
    private String color;

    public NotebookForSale(String brandName, Double price, Integer RAM, String processor, Integer hardDiskSize, String displaySize, String computerMemoryType, String videocard, String hardDiskType, String countryOfManufact, Double weight, String color) {
        super(brandName, price, RAM, processor, hardDiskSize, displaySize, computerMemoryType, videocard, hardDiskType);
        this.countryOfManufact = countryOfManufact;
        this.weight = weight;
        this.color = color;
    }

    public void getSaleInfo() {
        System.out.println("Name: " + getBrandName() + ";");
        System.out.println("Price: " + getPrice() + "$;");
        System.out.println("Processor: " + getProcessor() + ";");
        System.out.println("Memory Type: " + getComputerMemoryType() + ";");
        System.out.println("RAM: " + getRAM() + " GB;");
        System.out.println("Display size: " + getDisplaySize() + ";");
        System.out.println("Weight: " + getWeight() + " KG;");
        System.out.println("Videocard: " + getVideocard() + ";");
        System.out.println("Hard disk: " + getHardDiskSize() + " GB;");
        System.out.println("Hard disk type: " + getHardDiskType() + ";");
        System.out.println("Color: " + getColor() + ";");
        System.out.println("Country: " + getCountryOfManufact() + ";");
    }

    public String getCountryOfManufact() {
        return countryOfManufact;
    }

    public void setCountryOfManufact(String countryOfManufact) {
        this.countryOfManufact = countryOfManufact;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}