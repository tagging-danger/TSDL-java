import java.time.LocalDateTime;
import java.time.ZoneId;

public class Reservation {
    private String guestName;
    private int numberOfGuests;
    private LocalDateTime reservationDate;

    public Reservation(String guestName, int numberOfGuests, LocalDateTime reservationDate) {
        try {
            if (numberOfGuests <= 0) {
                throw new IllegalArgumentException("Number of guests must be positive.");
            }
            if (reservationDate == null) {
                throw new NullPointerException("Reservation date cannot be null.");
            }
            this.guestName = guestName;
            this.numberOfGuests = numberOfGuests;
            this.reservationDate = reservationDate;
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printReservationDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Number of Guests: " + numberOfGuests);
        System.out.println("Reservation Date: " + reservationDate);
    }

    
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
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

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
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

        LocalDateTime currentDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        Reservation reservation = new Reservation("Prathamesh Nagpure", 2, currentDateTime);
        reservation.printReservationDetails();
    }
}
