package com.training.demo.services;
import java.sql.*;
import java.util.*;
import com.example.entity.*;
import com.example.training.services.Invoice;
import com.example.util.ConnectionFactory;

public class ProductService {
	
	private Connection con;

	public ProductService() {
		super();
		this.con =ConnectionFactory.getOracleConnection();
	}
	
	public int addProduct(Product product)
	{
		int rowAdded=0;
		String sql="insert into Jerisha_product values(?,?,?)";
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1,product.getProductId());
			pstmt.setString(2,product.getProductName());
			pstmt.setDouble(3,product.getPrice());
			rowAdded=pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	public int deleteById(int id)
	{
		int rowsDeleted=0;
		String sql="delete from Jerisha_product where product_id=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1,id);
			rowsDeleted=pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rowsDeleted;
		
	}
	
	public Optional<Product> findById(int id)
	{
		Optional<Product> obj=Optional.empty();
		
		String sql="select* from Jerisha_product where product_id=?";
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1,id);
              ResultSet rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				int productId =rs.getInt("product_id");
				String productName =rs.getString("product_name");
				double price=rs.getDouble("price");
				Product prod=new Product(productId,productName,price);
				obj=Optional.of(prod);
			
		}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
		
	}

	public List<Product> findAll()
	{
		List<Product> productList=new ArrayList<Product>();
		String sql="select*from Jerisha_product";
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			ResultSet rs=pstmt.executeQuery();
			
			while (rs.next())
			{
				int productId =rs.getInt("product_id");
				String productName =rs.getString("product_name");
				double price=rs.getDouble("price");
				Product prod=new Product(productId,productName,price);
				productList.add(prod);
			}
		} catch (Exception e) {
			
		}
		return productList;
		
	}
	
	public int updatePriceByName(String ProductName,double newPrice)
	{ int rowsUpdated=0;
	 String sql="update Jerisha_product set price=? where product_name=?";
	 try (PreparedStatement pstmt = con.prepareStatement(sql)){
		 pstmt.setDouble(1, newPrice);
		 pstmt.setString(2,ProductName);
		
		 
		 rowsUpdated=pstmt.executeUpdate();
		 
	 } catch (SQLException e) {
	
		e.printStackTrace();
	}
		return rowsUpdated;
		
	}
	
	public void usingTransaction(Product prd1,Product prd2)
	{
		String sql="insert into Jerisha_product values(?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			con.setAutoCommit(false);
			
		pstmt.setInt(1, prd1.getProductId());
		pstmt.setString(2,prd1.getProductName());
        pstmt.setDouble(3, prd1.getPrice());
        int rowsAdded=pstmt.executeUpdate();
        
        pstmt.setInt(1,prd2.getProductId());
        pstmt.setString(2,prd2.getProductName());
        pstmt.setDouble(3, prd2.getPrice());
        int rowsAdded1=pstmt.executeUpdate();
        if(prd2.getPrice()>prd1.getPrice())
        {
        	con.commit();
        }
        else
        {
        	con.rollback();
        }
        System.out.println("RowsAdded1 : "+rowsAdded1);
        System.out.println("Rows added: "+rowsAdded);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void usingTnxwthcatch(Product prd1,Invoice invoice1)
	{
		String sql1="insert into Jerisha_product values(?,?,?)";
		String sql2="insert into Jerisha_invoice values(?,?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql1);PreparedStatement pstmt1=con.prepareStatement(sql2)) 
		{
			con.setAutoCommit(false);
			
		pstmt.setInt(1, prd1.getProductId());
		pstmt.setString(2,prd1.getProductName());
        pstmt.setDouble(3, prd1.getPrice());
        int productAdded=pstmt.executeUpdate();
        
        pstmt1.setInt(1,invoice1.getInvoiceNumber());
        pstmt1.setString(2,invoice1.getCustomerName());
        pstmt1.setDouble(3, invoice1.getQuantity());
        pstmt1.setInt(4, invoice1.getProductRef());
 
     pstmt1.executeUpdate();
       // System.out.println("Rows added: "+productAdded);
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}


	
	

}
