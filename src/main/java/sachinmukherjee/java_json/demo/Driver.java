package sachinmukherjee.java_json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/convert to java pojo
			Student theStudent = 
					mapper.readValue( new File("data/sample-high.json"), Student.class);
			
			//print first name and last name
			System.out.println(theStudent.getFirstName());
			System.out.println(theStudent.getLastName());
			
			Address tempAddress = theStudent.getAddress();
			System.out.println(tempAddress.getStreet()
							  +" "+
							  tempAddress.getCity()
							  +" "+
							  tempAddress.getState()
							  +" "+
							  tempAddress.getCountry()
					);
			
			for(String languages:theStudent.getLanguages()) {
				System.out.println(languages);
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
