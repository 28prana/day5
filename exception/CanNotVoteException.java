package com.cg.batch3.day5.exception;

public class CanNotVoteException {
	

	// user-defined exception / custom exception 

	public class CanNotVoteException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		CanNotVoteException() {
			super();
		}

		CanNotVoteException(String message) {
			super(message);
		}
	}
}
