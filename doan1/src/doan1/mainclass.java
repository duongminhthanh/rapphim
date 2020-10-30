package doan1;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connector co=new Connector();
		co.connectDB();
		co.getCustomer();
		co.getFilm();
		co.getCard();
		co.getTicket();
		co.getTheater();
		co.getStaff();
		co.getPhongchieu();
		co.getXuatchieu();
		co.insertCustomer();
		co.addTable();
		co.insertFilm();
		co.addFilm();
		co.insertCard();
		co.addCard();
		co.insertStaff();
		co.addStaff();
		co.insertTheater();
		co.addTheater();
		co.insertTicket();
		co.addTicket();
	}

}
  