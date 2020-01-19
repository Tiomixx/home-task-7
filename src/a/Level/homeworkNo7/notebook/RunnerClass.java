package a.Level.homeworkNo7.notebook;

public class RunnerClass {
    public static void main(String[] args) {
        NotebookForSale notebookForSale = new NotebookForSale("Dell Inspiron G3", 999.99, 16, "Intel Core i7-8750H (2.2 - 4.1 GHz)", 512,
                "15.6'' (1920x1080) Full HD", "DDR4 - 2666 MHz", "nVidia GeForce GTX 1050 Ti, 4GB", "SSD", "China", 2.53,
                "Black");

        notebookForSale.getSaleInfo();
    }
}