import java.util.Date;

public class Reservation {
    private String guestName;
    private int numberOfGuests;
    private Date reservationDate;

    public Reservation(String guestName, int numberOfGuests, Date reservationDate) {
        try {
            if (numberOfGuests <= 0) {
                throw new IllegalArgumentException("Number of guests must be positive.");
            }
            this.numberOfGuests = numberOfGuests;
            
            if (guestName == null || guestName.isEmpty()) {
                throw new IllegalArgumentException("Guest name cannot be null or empty.");
            }
            this.guestName = guestName;
            
            if (reservationDate == null) {
                throw new NullPointerException("Reservation date cannot be null.");
            }
            this.reservationDate = reservationDate;
        } catch (IllegalArgumentException e) {
            System.out.println("Initialization Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Initialization Error: " + e.getMessage());
        }
    }

    public void printReservationDetails() {
        try {
            if (guestName == null || guestName.isEmpty()) {
                throw new IllegalArgumentException("Guest name cannot be null or empty.");
            }
            System.out.println("Guest Name: " + guestName);
            
            if (numberOfGuests <= 0) {
                throw new IllegalArgumentException("Number of guests must be positive.");
            }
            System.out.println("Number of Guests: " + numberOfGuests);
            
            if (reservationDate == null) {
                throw new NullPointerException("Reservation date cannot be null.");
            }
            System.out.println("Reservation Date: " + reservationDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Display Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Display Error: " + e.getMessage());
        }
    }


    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        try {
            if (guestName == null || guestName.isEmpty()) {
                throw new IllegalArgumentException("Guest name cannot be null or empty.");
            }
            this.guestName = guestName;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        try {
            if (numberOfGuests <= 0) {
                throw new IllegalArgumentException("Number of guests must be positive.");
            }
            this.numberOfGuests = numberOfGuests;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        try {
            if (reservationDate == null) {
                throw new NullPointerException("Reservation date cannot be null.");
            }
            this.reservationDate = reservationDate;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {

        Date reservationDate = new Date(1246646400000L); 
        Reservation reservation = new Reservation("Prathamesh Nagpure", 2, reservationDate);
        reservation.printReservationDetails();
    }
    
}
