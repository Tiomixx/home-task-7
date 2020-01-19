package a.Level.homeworkNo7.computer;

public class Computer {

    private String brandName;
    private Double price;
    private Integer RAM;
    private String processor;
    private Integer hardDiskSize;
    private String displaySize;
    private String computerMemoryType;
    private String videocard;
    private String hardDiskType;

    public Computer(String brandName, Double price, Integer RAM, String processor, Integer hardDiskSize, String displaySize, String computerMemoryType, String videocard, String hardDiskType) {
        this.brandName = brandName;
        this.price = price;
        this.RAM = RAM;
        this.processor = processor;
        this.hardDiskSize = hardDiskSize;
        this.displaySize = displaySize;
        this.computerMemoryType = computerMemoryType;
        this.videocard = videocard;
        this.hardDiskType = hardDiskType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(Integer hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getComputerMemoryType() {
        return computerMemoryType;
    }

    public void setComputerMemoryType(String computerMemoryType) {
        this.computerMemoryType = computerMemoryType;
    }

    public String getVideocard() {
        return videocard;
    }

    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String getHardDiskType() {
        return hardDiskType;
    }

    public void setHardDiskType(String hardDiskType) {
        this.hardDiskType = hardDiskType;
    }
}