

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class PassportDto implements Serializable{
	
	private String name;
	private String emailId;
	private Long phoneNo;
	private String password;
	private Date date;
	private String confirmPassword;
	private String officeLocation;
	private String panNumber;
	private Long aadharNumber;
	

}
