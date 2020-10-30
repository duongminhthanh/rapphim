package doan1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Connector {
	String connectUrl = "jdbc:mysql://localhost:3306/cgv?" + "user=root&password=123456&serverTimeZone=UTC";
    Connection conn = null;
    public void connectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("Load driver success");

            conn = DriverManager.getConnection(connectUrl);
            System.out.println("Get connection success");
        }catch(Exception ex) {
            System.out.println("Load driver failed: " + ex.getMessage());
        }
    }

public void getCustomer(){
    Statement st=null;
    ResultSet rs=null;
    String queryCustomer="select * from customer";
    try{
        st=conn.createStatement();
        rs= st.executeQuery(queryCustomer);
        System.out.println("resultset: "+rs.getMetaData().getTableName(1));
        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
            System.out.println("resultset: "+rs.getMetaData().getColumnName(i));
        }
        while (rs.next()){
        String full_name=rs.getString("fullname");
        int phone_number=rs.getInt("phonenumber");
        boolean card=rs.getBoolean("card");
            System.out.println("fullname: "+full_name+",phonenumber: "+phone_number+",card: "+card);
        }
    }catch (Exception ex){

    }
}

public void getTheater(){
    Statement st=null;
    ResultSet rs=null;
    String queryTheater="select * from theater";
    try {
        st=conn.createStatement();
        rs=st.executeQuery(queryTheater);
        System.out.println("resultset: "+rs.getMetaData().getTableName(1));
        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
            System.out.println("resultset: "+rs.getMetaData().getColumnName(i));
        }
        while (rs.next()){
            int id=rs.getInt("id");
            String location=rs.getString("location");
            String name=rs.getString("name");
            System.out.println("id: "+id+",name: "+name+",location: "+location);
        }
    }catch (Exception ex){

    }
}

public void getFilm(){
   Statement st=null;
   ResultSet rs=null;
   String queryFilm="select * from film";
   try{
       st=conn.createStatement();
       rs=st.executeQuery(queryFilm);
       System.out.println("resultset:"+rs.getMetaData().getTableName(1));
       for (int i=1;i<rs.getMetaData().getColumnCount();i++){
           System.out.println("resultset:"+rs.getMetaData().getColumnName(i));
       }
       while (rs.next()){
           int film_id=rs.getInt("film_id");
           String film_name=rs.getString("film_name");
           int film_duration=rs.getInt("film_duration");
           boolean film_sub=rs.getBoolean("film_sub");
           String film_type=rs.getString("film_type");
           int film_age_limit=rs.getInt("film_age_limit");
           String film_status=rs.getString("film_status");
           System.out.println("film_id:"+film_id+",film_name:"+film_name+",film_duration:"+film_duration+",film_sub:"+film_sub+"film_type:"+film_type+",film_age_limit:"+film_age_limit+",film_status:"+film_status);
       }
   }catch (Exception ex){}
}

public void getCard(){
    Statement st=null;
    ResultSet rs=null;
    String queryCard="select * from membershipcard";
    try{
        st=conn.createStatement();
        rs=st.executeQuery(queryCard);
        System.out.println("resultset:"+rs.getMetaData().getTableName(1));
        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
            System.out.println("resultset"+rs.getMetaData().getColumnName(i));
        }
        while (rs.next()){
            int id=rs.getInt("id");
            String categorize=rs.getString("catagorize");
            String customer_name=rs.getString("name_customer");
            int phone_number=rs.getInt("phonenumber");
            int point=rs.getInt("point");
            String bonus_point= rs.getString("bonuspoint");
            System.out.println("id:"+id+",catagorize:"+categorize+",name_customer:"+customer_name+",phonenumber:"+phone_number+",point:"+point+",bonuspoint:"+bonus_point);
        }
    }catch (Exception ex){}
}

public void getTicket(){
    Statement st=null;
    ResultSet rs=null;
    String queryTicket="select * from ticket";
    try{
        st=conn.createStatement();
        rs= st.executeQuery(queryTicket);
        System.out.println("resultset"+rs.getMetaData().getTableName(1));
        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
            System.out.println("resultset"+rs.getMetaData().getColumnName(i));
        }
        while(rs.next()){
            int id=rs.getInt("id");
            int amount=rs.getInt("amount");
            String type=rs.getString("type");
            String status=rs.getString("status");
            boolean food_and_drink=rs.getBoolean("foodanddrink");
            String vou_cher=rs.getString("voucher");
            int number_room=rs.getInt("numberroom");
            String seat=rs.getString("seat");
            System.out.println("id:"+id+",amount:"+amount+",type:"+type+",status:"+status+",foodanddrink:"+food_and_drink+",voucher"+vou_cher+",numberrom:"+number_room+",seat:"+seat);
        }
    }catch (Exception ex){
    	System.out.println("ticketex:"+ex.getMessage());
    }
  }

public void getStaff() {
	Statement st=null;
    ResultSet rs=null;
	String queryStaff="select * from staff";
	try {
		 st=conn.createStatement();
	        rs= st.executeQuery(queryStaff);
	        System.out.println("resultset"+rs.getMetaData().getTableName(1));
	        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
	            System.out.println("resultset"+rs.getMetaData().getColumnName(i));
	        }
	        while(rs.next()) {
	        	int id=rs.getInt("id");
	        	String fullname=rs.getString("fullname");
	        	String lastname=rs.getString("lastname");
	        	String birthday=rs.getString("birthday");
	        	String contractdate=rs.getString("contractdate");
	        	int phonenumber=rs.getInt("phonenumber");
	        	String address=rs.getString("address");
	        	String role=rs.getString("role");
	        	System.out.println("id:"+id+",fullname:"+fullname+",lastname:"+lastname+",birthday:"+birthday+",contractdate:"+contractdate+",phonenumber:"+phonenumber+",address:"+address+",role:"+role);
	        }
	}catch(Exception ex) {
		System.out.println("staffex:"+ex.getMessage());
	}
}

public void getPhongchieu() {
	Statement st=null;
    ResultSet rs=null;
	String queryPhongchieu="select * from phongchieu";
	try {
		 st=conn.createStatement();
	        rs= st.executeQuery(queryPhongchieu);
	        System.out.println("resultset"+rs.getMetaData().getTableName(1));
	        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
	            System.out.println("resultset"+rs.getMetaData().getColumnName(i));
	        }
	        while(rs.next()) {
	        	int id=rs.getInt("id");
	        	String tenphong=rs.getString("tenphong");
	        	int ghethuong=rs.getInt("ghethuong");
	        	int ghevip=rs.getInt("ghevip");
	        	int ghedoi=rs.getInt("ghedoi");
	        	int rap=rs.getInt("rap");
	        	System.out.println("id:"+id+",tenphong:"+tenphong+",ghethuong:"+ghethuong+",ghevip:"+ghevip+",ghedoi:"+ghedoi+",rap:"+rap);
	        }
	}catch(Exception ex){
		System.out.println("phongchieuex:"+ex.getMessage());
	}
}

public void getXuatchieu() {
	Statement st=null;
    ResultSet rs=null;
	String queryXuatchieu="select * from xuatchieu";
	try {
		st=conn.createStatement();
        rs= st.executeQuery(queryXuatchieu);
        System.out.println("resultset"+rs.getMetaData().getTableName(1));
        for (int i=1;i<rs.getMetaData().getColumnCount();i++){
            System.out.println("resultset"+rs.getMetaData().getColumnName(i));
        }
        while(rs.next()) {
        	int id=rs.getInt("id");
        	int phongid=rs.getInt("phongid");
        	int phimid=rs.getInt("phimid");
        	String giobatdau=rs.getString("giobatdau");
        	String gioketthuc=rs.getString("gioketthuc");
        	String ngaybatdau=rs.getString("ngaybatdau");
        	String ngayketthuc=rs.getString("ngayketthuc");
        	System.out.println("id:"+id+",phongid:"+phongid+",phimid:"+phimid+",giobatdau:"+giobatdau+",gioketthuc:"+gioketthuc+",ngaybatdau:"+ngaybatdau+",ngayketthuc:"+ngayketthuc);
        }
	}catch(Exception ex){
		System.out.println("xuatchieuex:"+ex.getMessage());
	}
}

public void insertCustomer() {
Statement statement = null;
	String querycustomer = "insert into customer values('nguyen van nam', 542 ,true)";
	try {
	statement = conn.createStatement();
	int result = statement.executeUpdate(querycustomer);
	System.out.println("Result: " + result);
	}catch(Exception ex){
	System.out.println("Load driver failed"+ex.getMessage());
	}
}

public void addTable() {
	String tableActor="create table if not exists customer("+"fullname varchar(255),"+"phonenumber int,"+"card boolean"+");";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(tableActor);
		System.out.println("create success"+ result);
		statement.executeUpdate(tableActor, statement.RETURN_GENERATED_KEYS);
		int newEmployeeId=-1;
		if (resultset.next()) {
		newEmployeeId=resultset.getInt(-1);
		}
		System.out.println("Insert employee success with id "+newEmployeeId);
		}catch(Exception ex){
		System.out.println("Exception: "+ex.getMessage());
		}
}

public void insertFilm() {
	String queryFilm="insert into film values(8,'deadpool 2',2,true,'sci-fi',18,'available')";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(queryFilm);
	}catch(Exception ex){
		System.out.println("Load driver failed"+ex.getMessage());
		}
}

public void addFilm() {
		String tableActor="create table if not exists film("+"film_id int,"+"film_name varchar(255),"+"film_duration int,"+"film_sub boolean,"+"film_type varchar(255),"+"film_age_limit int,"+"film_status varchar(255)); ";
		Statement statement = null;
		ResultSet resultset = null;
		try {
			statement =conn.createStatement();
			int result=statement.executeUpdate(tableActor);
			System.out.println("create success"+ result);
			statement.executeUpdate(tableActor, statement.RETURN_GENERATED_KEYS);
			int newfilmId=-1;
			if (resultset.next()) {
			newfilmId=resultset.getInt(-1);
			}
			System.out.println("Insert film success with id "+newfilmId);
			}catch(Exception ex){
			System.out.println("Exception: "+ex.getMessage());
			}
		
		
	}

public void insertCard() {
	String queryCard="insert into membershipcard values(07,'vip','vu ngoc hao',0245422434,200,'twenty_five')";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(queryCard);
	}catch(Exception ex){
		System.out.println("Load driver failed"+ex.getMessage());
		}
	}

public void addCard() {
	String tableActor="create table if not exist membershipcard("+"id int,"+"caragorize varchar(255),"+"name_customer varchar(255),"+"phonenumber int,"+"point int,"+"bonuspoint varchar(255)) ";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(tableActor);
		System.out.println("create success"+ result);
		statement.executeUpdate(tableActor, statement.RETURN_GENERATED_KEYS);
		int newcardId=-1;
		if (resultset.next()) {
		newcardId=resultset.getInt(-1);
		}
		System.out.println("Insert film success with id "+newcardId);
		}catch(Exception ex){
		System.out.println("Exception: "+ex.getMessage());
		}
	}

public void insertStaff() {
		String queryStaff="insert into staff values (7,'nguyen','thao van','20/12/1999','20/4/2019',0542115462,'456 xo viet nghe tinh','quan ly')";
		Statement statement = null;
		ResultSet resultset = null;
		try {
			statement =conn.createStatement();
			int result=statement.executeUpdate(queryStaff);
		}catch(Exception ex){
			System.out.println("Load driver failed"+ex.getMessage());
			}
		}

public void addStaff() {
		String tableActor="create table if not exist staff("+"id int,"+"fullname varchar(255),"+"lastname varchar(255),"+"birthday varchar(255),"+"contractdate varchar(255),"+"phonenumber int,"+"address varchar(255),"+"role varchar(255))";
		Statement statement = null;
		ResultSet resultset = null;
		try {
			statement =conn.createStatement();
			int result=statement.executeUpdate(tableActor);
			System.out.println("create success"+ result);
			statement.executeUpdate(tableActor, statement.RETURN_GENERATED_KEYS);
			int newstaffId=-1;
			if (resultset.next()) {
			newstaffId=resultset.getInt(-1);
			}
			System.out.println("Insert film success with id "+newstaffId);
			}catch(Exception ex){
			System.out.println("Exception: "+ex.getMessage());
			}
	}

public void insertTheater() {
	String queryTheater="insert into theater values(7,' 59 - 61 Pasteur, Quan 1','CGV Liberty Citypoint');";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(queryTheater);
	}catch(Exception ex){
		System.out.println("Load driver failed"+ex.getMessage());
		}
	}

public void addTheater() {
	String tableActor="create table if not exist theater("+" id int,"+" location varchar(255),"+" name varchar(255))";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(tableActor);
		System.out.println("create success"+ result);
		statement.executeUpdate(tableActor, statement.RETURN_GENERATED_KEYS);
		int newtheaterId=-1;
		if (resultset.next()) {
		newtheaterId=resultset.getInt(-1);
		}
		System.out.println("Insert film success with id "+newtheaterId);
		}catch(Exception ex){
		System.out.println("Exception: "+ex.getMessage());
		}
}
public void insertTicket(){
	String queryTicket="insert into ticket values(007,2,'3d','available',true,'twenty percent',10,'j');";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(queryTicket);
	}catch(Exception ex){
		System.out.println("Load driver failed"+ex.getMessage());
		}
}

public void addTicket() {
	String tableActor="create table if not exist tiket("+"id int,"+"amount int,"+"type varchar(255),"+"status varchar(255),"+"foodanddrink boolean,"+"voucher varchar(255),"+"numberroom int,"+"seat varchar(255))";
	Statement statement = null;
	ResultSet resultset = null;
	try {
		statement =conn.createStatement();
		int result=statement.executeUpdate(tableActor);
		System.out.println("create success"+ result);
		statement.executeUpdate(tableActor, statement.RETURN_GENERATED_KEYS);
		int newticketId=-1;
		if (resultset.next()) {
		newticketId=resultset.getInt(-1);
		}
		System.out.println("Insert film success with id "+newticketId);
		}catch(Exception ex){
		System.out.println("Exception: "+ex.getMessage());
		}
	}
  

}



