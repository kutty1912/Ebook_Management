 package com.DAO;

import java.sql.*;

import com.entity.Cart;

public class CartDAOImpl implements CartDao{
	
	private Connection conn;
	public CartDAOImpl(Connection conn)
	{
		this.conn=conn;
	}
	

	@Override
	public boolean addCart(Cart c) {
	boolean f=false;
	try {
		String sql="insert into cart(bid,uid,bookName,author,price,total_price) values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, c.getBid());
		ps.setInt(2, c.getUserId());
		ps.setString(3, c.getBookName());
		ps.setString(4, c.getAuthor());
		ps.setDouble(5, c.getPrice());
		ps.setDouble(6, c.getTotalPrice());
		
		int i=ps.executeUpdate();
		if(i==1)
		{
			f=true;
		}
		
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		return f;
	}
	

}
