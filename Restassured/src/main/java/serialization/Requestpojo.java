package serialization;

public class Requestpojo {

		private String username;
		private String lastname;
		private String totalprice;
		private String depositpaid;
		private String bookingdates; // nestedpojo object
		private String additionalneeds;
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getTotalprice() {
			return totalprice;
		}
		public void setTotalprice(String totalprice) {
			this.totalprice = totalprice;
		}
		public String getDepositpaid() {
			return depositpaid;
		}
		public void setDepositpaid(String depositpaid) {
			this.depositpaid = depositpaid;
		}
		public String getBookingdates() {  // nested json object
			return bookingdates;
		}
		public void setBookingdates(String bookingdates) { // nested json object
			this.bookingdates = bookingdates;
		}
		public String getAdditionalneeds() {
			return additionalneeds;
		}
		public void setAdditionalneeds(String additionalneeds) {
			this.additionalneeds = additionalneeds;
		}
		
		
		
	}


