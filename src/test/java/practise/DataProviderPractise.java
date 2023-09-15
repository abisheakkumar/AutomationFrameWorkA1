package practise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractise {
	@Test(dataProvider="getData")
	public void addProductToCart(String name,String model,int amount)
	{
		System.out.println(name+" "+model+" "+amount);
	}
	
	
	@Test(dataProvider="getInfo")
	public void addDataInfo(String name,String model)
	{
		System.out.println(name+" "+model);
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[4][3];
		
		data[0][0]="Samsung";
		data[0][1]="A83";
		data[0][2]=150000;
		
		data[1][0]="Samsung";
		data[1][1]="A83";
		data[1][2]=150000;
		
		data[2][0]="Samsung";
		data[2][1]="A83";
		data[2][2]=150000;
		
		data[3][0]="Samsung";
		data[3][1]="A83";
		data[3][2]=150000;
		
		return data;
		
		
		
	}
	
	@DataProvider
	public Object[][] getInfo()
	{
		Object[][] data=new Object[2][2];
		
		data[0][0]="Samsung";
		data[0][1]="A83";
		
		data[1][0]="Samsung";
		data[1][1]="A83";
		
		return data;
	}
}
