package pe.edu.ulima.is2.lab2.Ejer3.corrected;

public class DigitalProduct extends Product implements Downloadable {

    private String downloadUrl;
    private long fileSize;

    public DigitalProduct(String name, double basePrice, String downloadUrl, long fileSize) {
        super(name, basePrice);
        this.downloadUrl = downloadUrl;
        this.fileSize = fileSize;
    }

    @Override
    public double calculatePrice() {
        return basePrice;
    }

    @Override
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public long getFileSize() {
        return fileSize;
    }
}

/*
    @Override
    public double calculatePrice() {
        return basePrice; // Sin impuestos físicos
    }

    @Override
    public double calculateShippingCost() {
        // VIOLACIÓN LSP: Los productos digitales no deberían tener costo de envío
        // pero la clase base obliga a implementar este método
        throw new UnsupportedOperationException("Los productos digitales no tienen costo de envío");
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return false;
    }
*/
