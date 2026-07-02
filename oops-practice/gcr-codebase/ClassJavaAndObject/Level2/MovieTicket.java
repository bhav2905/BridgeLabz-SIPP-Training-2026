import java.util.Scanner;

public class MovieTicket {

    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName,
                       int seatNumber,
                       double price) {

        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicket() {

        System.out.println("Movie : " + movieName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        MovieTicket ticket =
                new MovieTicket(movie, seat, price);

        ticket.displayTicket();
    }
}