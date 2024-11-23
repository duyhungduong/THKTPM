package unit_tesing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import thuvien.tinhtoan.PhepTinh;

public class TestPhepToan {
	ReadExcelFile testdata = new ReadExcelFile("C:\\Users\\ADMIN\\OneDrive - ctu.edu.vn\\Documents\\CT243\\Thuc hanh kiem thu PM tu dong cho SV\\Thuc hanh kiem thu PM tu dong cho SV\\Bai tap them ve Data driven testing\\Baitap1\\Thu vien va Du lieu kiem thu\\TestData.xlsx");
//	ReadExcelFile testdata = new ReadExcelFile("../TestData.xlsx");

	public static final float delta = (float) 1e-15;

	@BeforeMethod
	public void BeforeTest() {
		System.out.println("Before testcase");
	}

	@AfterMethod
	public void AfterTest() {
		System.out.println("After testcase");
	}

	@Test(dataProvider = "congdata")
	public void TestCong(float a, float b, float expected) {

		Assert.assertEquals(PhepTinh.Op('+', a, b), expected, delta);
		System.out.println("Phep toan dung");
	}

	@Test(dataProvider = "trudata")
	public void TestTru(float a, float b, float expected) {
		Assert.assertEquals(PhepTinh.Op('-', a, b), expected, delta);
		System.out.println("Phep toan dung");
	}

	@Test(dataProvider="nhandata")
	public void TestNhan1(float a, float b, float result){
		
			Assert.assertEquals(PhepTinh.Op('*', a, b), result, delta);
		System.out.println("	Tinh toan dung.");
		
		
	}
	
//	@Test(dataProvider="nhandata")
//	public void TestNhan(float a, float b, float expected){
//		
//			Assert.assertEquals(nhan( a, b), expected, delta);
//		System.out.println("Tinh toan dung.");
//		
//		
//	}
	
	public static float nhan ( float a, float b) {
		return a*b;
	}

	@DataProvider(name = "congdata")
	public Object[][] CongData() {
		int rows = testdata.getRowCount(0);
		Object[][] pheptinh = new Object[rows][3];
		for (int i = 0; i < rows; i++) {
			pheptinh[i][0] = (float) testdata.getData(0, i, 0);
			pheptinh[i][1] = (float) testdata.getData(0, i, 1);
			pheptinh[i][2] = (float) testdata.getData(0, i, 2);
		}
		return pheptinh;
	}

	@DataProvider(name = "trudata")
	public Object[][] TruData() {
		int rows = testdata.getRowCount(1);
		Object[][] pheptinh = new Object[rows][3];
		for (int i = 0; i < rows; i++) {
			pheptinh[i][0] = (float) testdata.getData(1, i, 0);
			pheptinh[i][1] = (float) testdata.getData(1, i, 1);
			pheptinh[i][2] = (float) testdata.getData(1, i, 2);
		}
		return pheptinh;
	}

	@DataProvider(name="nhandata")
	public Object[][] NhanData(){
		int rows = testdata.getRowCount(2);
		Object[][] pheptinh = new Object[rows][3];
		for(int i=0; i<rows; i++)
		{
			pheptinh[i][0] = (float) testdata.getData(2, i, 0);
			pheptinh[i][1] = (float) testdata.getData(2, i, 1);
			pheptinh[i][2] = (float) testdata.getData(2, i, 2);
		}
		return pheptinh;
	}
}
