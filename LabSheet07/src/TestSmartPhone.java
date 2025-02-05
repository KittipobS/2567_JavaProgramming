
public class TestSmartPhone {

	public static void main(String[] args) {
		// สร้างออบเจ็กต์ SmartPhone
		Smartphone phone = new Smartphone();
		// ต้งัค่าเริ่มตน้ ให้กบั สมาร์ทโฟน
		System.out.println("กำลังตั้งค่าข้อ มูลสมาร์ทโฟนเริ่มต้น ...");
		phone.setBrand("SmartMobile"); // กา หนดแบรนด์
		phone.setModel("W1000"); // กา หนดรุ่น
		phone.setStorageCapacity(256); // กา หนดความจุเริ่มตน้
		// แสดงรายละเอียดสมาร์ทโฟน
		System.out.println("\nข้อ มูลสมาร์ทโฟนเบื้องต้น :");
		phone.printDetails();
		// เพิ่มความจุดว้ยค่า valid
		System.out.println("\nเพิ่มความจุหน่วยความจำ 100 GB...");
		phone.increaseStorage(100); // เพิ่มความจุสา เร็จ
		// เพิ่มความจุดว้ยค่า invalid (เกินขีดจา กดั)
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ 200 GB...");
		phone.increaseStorage(200); // ไม่สา เร็จ: เกินขีดจา กดั
		// เพิ่มความจุดว้ยค่า invalid (ค่าติดลบ)
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ -50 GB...");
		phone.increaseStorage(-50); // ไม่สา เร็จ:ค่าติดลบ
		// คา นวณพ้ืนที่หน่วยความจา ที่เหลือ(valid used storage)
		System.out.println("\nคำนวณพื้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 120 GB...");
		int remainingStorage = phone.getRemainingStorage(120); // ค านวณส าเร็จ
		if (remainingStorage != -1) {
		System.out.println("พื้นที่ที่เหลือ: " + remainingStorage + " GB");
		}
		// คา นวณพ้ืนที่หน่วยความจา ที่เหลือ(invalid used storage)
		System.out.println("\nคำนวณพื้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 500 GB...");
		phone.getRemainingStorage(500); // ไม่สา เร็จ: เกินความจุ
		// ทดสอบการต้งัค่าที่ไม่ถูกตอ้ง (brand และ model)
		System.out.println("\nตั้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกต้อง...");
		phone.setBrand(""); // ไม่สา เร็จ:แบรนดส์ ้ันเกินไป
		phone.setModel("A"); // ไม่สา เร็จ:รุ่นส้ันเกินไป
		// ทดสอบการต้งัค่าความจุที่ไม่ถูกตอ้ง
		System.out.println("\nตั้งค่าความจุหน่วยความจำที่ไม่ถูกต้อง...");
		phone.setStorageCapacity(600); // ไม่สา เร็จ: เกินขีดจา กดั
		// แสดงรายละเอียดสมาร์ทโฟนหลงัการต้งัค่าต่างๆ
		System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
		phone.printDetails();
		
	}

}
