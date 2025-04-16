package dataProvider;

import org.testng.annotations.DataProvider;

public class AssignmentDS {
	@DataProvider
	public String[][] dataSender(){
		String[][] datas= {{"Neha","Gupta","abhis1234@gmail.com","abhis@1234","abhis@1234"},{"Gupta","Neha","abhia@1234","abhis1234@gmail.com","abhis@1234"},
				{"Neha","abhis@1234","abhis1234@gmail.com","abhis@1234","Neha"},{"Gupta","abhis1234@gmail.com","Neha","abhis@1234","abhis@1234"}};
		return datas;
		}
	@DataProvider
	public void register() {
		String[][] datas= {{},{},{},{}};
	}
	}

