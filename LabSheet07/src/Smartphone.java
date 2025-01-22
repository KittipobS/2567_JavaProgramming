
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY = 521;
	
	public String getBrand () {
		return brand;
	}
	
	public String getModel () {
		return model;
	}
	
	public int getStorageCapacity () {
		return storageCapacity;
	}
	
	public void setBrand (String brand) {
		if (brand.length() > 1) {
			this.brand = brand;
		}else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	
	public void setModel (String model) {
		if (model.length() > 1) {
			this.model = model;
		}else {
			System.out.println("Error: Model must have at least 2 characters!");
		}
	}
	
	public void setStorageCapacity (int storageCapacity) {
		if (storageCapacity >= 1 && storageCapacity <= 512) {
			this.storageCapacity = storageCapacity;
		}else {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}
	}
	
	public void increaseStorage (int additionalStorage) {
		if (additionalStorage > 0 && (additionalStorage + storageCapacity) <= MAX_STORAGE_CAPACITY) {
			this.storageCapacity = storageCapacity + additionalStorage;
		}else if ((additionalStorage + storageCapacity) > MAX_STORAGE_CAPACITY) {
			System.out.println("Error: Storage capacity cannot exceed " + MAX_STORAGE_CAPACITY + " GB!");
		}else {
			System.out.println("Error: Additional storage must be positive!");
		}
	}
	
	public int getRemainingStorage (int usedStorage) {
		if (usedStorage < 0 || usedStorage > storageCapacity) {
			System.out.println("Error: Used storage must be between 0 and " + storageCapacity + " GB!");
		}
		
		return storageCapacity - usedStorage;
	}
	
	public void printDetails () {
		System.out.println("Smartphone Details:");
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Storage Capacity: " + storageCapacity);
		
	}
	
}
