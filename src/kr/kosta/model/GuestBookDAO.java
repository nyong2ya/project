package kr.kosta.model;

import java.util.List;

import kr.kosta.controller.ListController;

public interface GuestBookDAO {

	public List listGuest(); //select
	public void insertGuest(GuestBookVO vo); //insert
	public void deleteGuest(int num); //delete
	
}
