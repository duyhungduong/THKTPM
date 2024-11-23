package unit_testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



// import thuvien.ketquahoctap.DanhGia;

public class TestDanhGia {
	
	@BeforeMethod
	public void BeforeTest() {
		System.out.println("Before testcase");
	}

	@AfterMethod
	public void AfterTest() {
		System.out.println("After testcase");
	}
	
	@Test(dataProvider = "testdiemchu")
	public void TestDiemChu(double diemSo, String diemChu) {
		System.out.println(diemSo+" "+diemChu);
//		Assert.assertEquals(DanhGia.diemChu(diemSo), diemChu);
//		System.out.println("Diem chu dung");
	}
	
	@Test(dataProvider = "testxephang")
	public void TestXepHang(double diemSo, String xepHang) {
		System.out.println(diemSo+" "+xepHang);
//		Assert.assertEquals(DanhGia.xepHangTN(diemSo), xepHang);
//		System.out.println("Xep hang dung");
	}
	
	@DataProvider(name = "testxephang")
	public Object[][] TestDataXepHang() {
		ReadExcelFile config = new ReadExcelFile("D:\\CT243_DDHUng\\Selenium\\THKTPM\\TestData1.xlsx");

		int rows = config.getRowCount(1);

		Object[][] credentials = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			credentials[i][0] = config.getNumericData(1, i, 0);
			credentials[i][1] = config.getStringData(1, i, 1);
		}

		return credentials;
	}
	
	
	@DataProvider(name = "testdiemchu")
	public Object[][] TestDataDiemChu() {
		ReadExcelFile config = new ReadExcelFile("D:\\CT243_DDHUng\\Selenium\\THKTPM\\TestData1.xlsx");

		int rows = config.getRowCount(0);

		Object[][] credentials = new Object[rows][2];

		for (int i = 0; i < rows; i++) {
			credentials[i][0] = config.getNumericData(0, i, 0);
			credentials[i][1] = config.getStringData(0, i, 1);
		}

		return credentials;
	}
}
