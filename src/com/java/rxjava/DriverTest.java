package com.java.rxjava;

interface Driver{//�������ݿ���������ӿ�Driver
	void connect();
}

class MySql implements Driver{

	@Override
	public void connect() {
		System.out.println("MySql ���ݿ����ӳɹ�!");
	}
}

class SqlServer implements Driver{
	@Override
	public void connect(){
		System.out.println("SqlServer���ݿ����ӳɹ�!");
	}
}
class DB2 implements Driver{
	@Override
	public void connect(){
		System.out.println("DB2���ݿ����ӳɹ�!");
	}
}
class Oracle implements Driver{
	@Override
	public void connect(){
		System.out.println("Oracle���ݿ����ӳɹ�!");
	}
}

public class DriverTest{
	public static void main(String[] args) {
		String str=args[0];
		Driver d=getConnect(str);
		if(d!=null){
			d.connect();
		}
	}
	
	public static Driver getConnect(String str){
		if(str!=null&&str.equals("oracle")){
			return new Oracle();
		}
		if(str!=null&&str.equals("db2")){
			return new DB2();
		}
		if(str!=null&&str.equals("sqlserver")){
			return new SqlServer();
		}
		if(str!=null&&str.equals("mysql")){
			return new MySql();
		}
		return null;
	}
}







