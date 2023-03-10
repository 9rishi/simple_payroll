package com.rishitha.payroll.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class UserData {
		String firstname;
		String lastname;
		int age;
}
