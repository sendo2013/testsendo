package Mysql;



interface DBPool {
	public boolean getHandler();
	public boolean returnHandler(MysqlDBHandler returnHandler);
	public boolean close();
}


interface CommonDBHandler {
	public boolean createDB(String createDBName);
	public boolean selectDB(String selectDBName);
	public boolean dropDB(String dropDBName);
	public boolean delete(String deleteKey);
}

interface MysqlDBHandler extends CommonDBHandler {
	public boolean insertDB();
	public String selectDB();
}


class MysqlPool implements DBPool {
	
	public boolean getHandler(){
		return true;
	}
	
	
	public boolean returnHandler(MysqlDBHandler returnHandler){
		return true;
	}
	public boolean close(){
		return true;
	}
}

class MysqlHandler implements MysqlDBHandler {
	public boolean createDB(String createDBName){
		return true;
	}
	public boolean selectDB(String selectDBName){
		return true;
	}
	public boolean dropDB(String dropDBName){
		return true;
	}
	public boolean delete(String deleteKey){
		return true;
	}
	
	public boolean insertDB(){
		return true;
	}
	public String selectDB(){
		String sql = "";
		return sql;
	}
}

public class Mysql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
