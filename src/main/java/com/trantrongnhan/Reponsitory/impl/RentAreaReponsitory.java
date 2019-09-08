package com.trantrongnhan.Reponsitory.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.trantrongnhan.Entity.RentAreaEntity;
import com.trantrongnhan.Reponsitory.IRentAreaReponsitory;

public class RentAreaReponsitory extends AbstractReponsitory<RentAreaEntity> implements IRentAreaReponsitory{

	@Override
	public Integer save(RentAreaEntity renAreaEntity) {
		return insert(renAreaEntity);
	}

	@Override
	public void deleteByBuildingId(Integer id) {
		StringBuilder sql=new StringBuilder("delete from rentarea where buildingid=?");
		Connection conn=getConnection();
		PreparedStatement statement=null;
		try {
			if(conn!=null) {
				conn.setAutoCommit(false);
				statement=conn.prepareStatement(sql.toString());
				if(statement!=null) {
					statement.setObject(1, id);
					if(statement.executeUpdate()>0) {
						conn.commit();
						System.out.println(sql.toString());
					}
				}
				if(statement!=null) {
					statement.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
