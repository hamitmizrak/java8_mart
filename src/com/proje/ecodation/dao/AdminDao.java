package com.proje.ecodation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.proje.ecodation.common.IImplementation;
import com.proje.ecodation.dto.AdminDto;

public class AdminDao implements IImplementation<AdminDto> {

	@Override
	public void create(AdminDto adminDto) {
		try (Connection connection = getInterfaceConnection()) {
			connection.setAutoCommit(false); // transaction
			String sql = "insert admin7 (adi,soyadi,email,sifre) values(?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, adminDto.getAdi());
			preparedStatement.setString(2, adminDto.getSoyadi());
			preparedStatement.setString(3, adminDto.getEmail());
			preparedStatement.setString(4, adminDto.getSifre());
			int rowsEffected = preparedStatement.executeUpdate();
			if (rowsEffected > 0) {
				System.out.println("Ekleme Başarılı");
				connection.commit(); // transaction
			} else {
				System.out.println("Ekleme Başarısız");
				connection.rollback(); // transaction
				connection.setAutoCommit(true);// transaction
			}
		} catch (Exception e) {
			System.out.println("AdminDto Ekleme sırasında hata meydana geldi:::  " + AdminDto.class);
			e.printStackTrace();
			// connection.rollback();
		}

	}

	@Override
	public void update(AdminDto adminDto) {
		try (Connection connection = getInterfaceConnection()) {
			connection.setAutoCommit(false);
			String sql = "update admin7 set adi=?,soyadi=?,email=?,sifre=? where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, adminDto.getAdi());
			preparedStatement.setString(2, adminDto.getSoyadi());
			preparedStatement.setString(3, adminDto.getEmail());
			preparedStatement.setString(4, adminDto.getSifre());
			preparedStatement.setLong(5, adminDto.getAdminId());
			int rowsEffected = preparedStatement.executeUpdate();
			if (rowsEffected > 0) {
				System.out.println("Güncelleme Başarılı");
				connection.commit();
			} else {
				System.out.println("Güncelleme Başarısız");
				connection.rollback(); // transaction
				connection.setAutoCommit(true);// transaction
			}

		} catch (Exception e) {
			System.out.println("AdminDto Güncelleme sırasında hata meydana geldi:::  " + AdminDto.class);
			e.printStackTrace();
		}

	}

	@Override
	public void delete(long id) {
		try (Connection connection = getInterfaceConnection()) {
			connection.setAutoCommit(false); // transaction
			String sql = "delete from admin7  where admin_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, id);
			int rowsEffected = preparedStatement.executeUpdate();
			if (rowsEffected > 0) {
				System.out.println("Silme Başarılı");
				connection.commit(); // transaction
			} else {
				System.out.println("Silme Başarısız");
				connection.rollback(); // transaction
				connection.setAutoCommit(true);// transaction
			}
		} catch (Exception e) {
			System.out.println("AdminDto Silme sırasında hata meydana geldi:::  " + AdminDto.class);
			e.printStackTrace();
			// connection.rollback();
		}

	}

	@Override
	public ArrayList<AdminDto> list() {
		AdminDto adminDto;
		ArrayList<AdminDto> list = new ArrayList<AdminDto>();

		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from admin7";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				adminDto = new AdminDto();
				adminDto.setAdminId(resultSet.getLong("admin_id"));
				adminDto.setAdi(resultSet.getString("adi"));
				adminDto.setSoyadi(resultSet.getString("soyadi"));
				adminDto.setSifre(resultSet.getString("sifre"));
				adminDto.setEmail(resultSet.getString("email"));
				list.add(adminDto);
			}
		} catch (Exception e) {
			System.out.println("AdminDto listeleme sırasında hata meydana geldi:::  " + AdminDto.class);
			e.printStackTrace();
		}
		return list;
	}

}
