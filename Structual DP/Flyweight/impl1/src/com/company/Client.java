package com.company;

import com.company.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4065"));
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1202");
		System.out.println(msg2.getText(null));
	}

}
