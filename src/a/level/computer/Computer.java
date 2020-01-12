package a.level.computer;

public class Computer {
    private String brandName;
    private Double price;
    private String color;
    private String RAM;
    private String processor;
    private String hardDiskSize;
    private String displaySize;
    private String computerMemoryType;
    private String videocard;
    private Double weight;
    private String countryOfManufact;
    private String displaySupplier;
    private String keyboardSupplier;
    private String getKeyboardLanguage;
    private String motherboardSupplier;
    private String serialNumber;
    private String detailsCost;


    public String getBrandName() {
        return brandName;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getRAM() {
        return RAM;
    }

    public String getProcessor() {
        return processor;
    }

    public String getHardDiskSize() {
        return hardDiskSize;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public String getComputerMemoryType() {
        return computerMemoryType;
    }

    public String getVideocard() {
        return videocard;
    }

    public Double getWeight() {
        return weight;
    }

    public String getCountryOfManufact() {
        return countryOfManufact;
    }

    public String getDisplaySupplier() {
        return displaySupplier;
    }

    public String getKeyboardSupplier() {
        return keyboardSupplier;
    }

    public String getGetKeyboardLanguage() {
        return getKeyboardLanguage;
    }

    public String getMotherboardSupplier() {
        return motherboardSupplier;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getDetailsCost() {
        return detailsCost;
    }

    private Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.color = builder.color;
        this.brandName = builder.brandName;
        this.countryOfManufact = builder.countryOfManufact;
        this.price = builder.price;
        this.processor = builder.processor;
        this.hardDiskSize = builder.hardDiskSize;
        this.displaySize = builder.displaySize;
        this.computerMemoryType = builder.computerMemoryType;
        this.videocard = builder.videocard;
        this.weight = builder.weight;
        this.displaySupplier = builder.displaySupplier;
        this.keyboardSupplier = builder.keyboardSupplier;
        this.getKeyboardLanguage = builder.getKeyboardLanguage;
        this.motherboardSupplier = builder.motherboardSupplier;
        this.serialNumber = builder.serialNumber;
        this.detailsCost = builder.detailsCost;
    }

    //Builder Class
    public static class ComputerBuilder {

        private String brandName;
        private Double price;
        private String color;
        private String RAM;
        private String processor;
        private String hardDiskSize;
        private String displaySize;
        private String computerMemoryType;
        private String videocard;
        private Double weight;
        private String countryOfManufact;
        private String displaySupplier;
        private String keyboardSupplier;
        private String getKeyboardLanguage;
        private String motherboardSupplier;
        private String serialNumber;
        private String detailsCost;

        public ComputerBuilder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        public ComputerBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public ComputerBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setHardDiskSize(String hardDiskSize) {
            this.hardDiskSize = hardDiskSize;
            return this;
        }

        public ComputerBuilder setDisplaySize(String displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        public ComputerBuilder setComputerMemoryType(String computerMemoryType) {
            this.computerMemoryType = computerMemoryType;
            return this;
        }

        public ComputerBuilder setVideocard(String videocard) {
            this.videocard = videocard;
            return this;
        }

        public ComputerBuilder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public ComputerBuilder setCountryOfManufact(String countryOfManufact) {
            this.countryOfManufact = countryOfManufact;
            return this;
        }

        public ComputerBuilder setDisplaySupplier(String displaySupplier) {
            this.displaySupplier = displaySupplier;
            return this;
        }

        public ComputerBuilder setKeyboardSupplier(String keyboardSupplier) {
            this.keyboardSupplier = keyboardSupplier;
            return this;
        }

        public ComputerBuilder setGetKeyboardLanguage(String getKeyboardLanguage) {
            this.getKeyboardLanguage = getKeyboardLanguage;
            return this;
        }

        public ComputerBuilder setMotherboardSupplier(String motherboardSupplier) {
            this.motherboardSupplier = motherboardSupplier;
            return this;
        }

        public ComputerBuilder setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public ComputerBuilder setDetailsCost(String detailsCost) {
            this.detailsCost = detailsCost;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}