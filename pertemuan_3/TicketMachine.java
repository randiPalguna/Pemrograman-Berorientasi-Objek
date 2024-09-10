public class TicketMachine {
  // instqnce fields
  private int price;
  private int balance;
  private int total;

  // constructor with price as parameter
  public TicketMachine(int price) {
    this.balance = 0;
    this.total = 0;
    if (price <= 0) {
      System.out.println("Harga tiket harus lebih dari 0 rupiah");
    } else {
      this.price = price;
    }
  }

  // method to insert money
  public void insertMoney(int money) {
    if (money <= 0) {
      System.out.println("Uang yang dimasukkan harus lebih dari 0 rupiah");
      return;
    } else {
      this.balance += money;
    }      
  }

  // method to print ticket
  public void printTicket() {
    if (balance < price) {
      System.out.println("Uang yang dimasukkan kurang, tambahkan uang sebesar " 
        + (price - balance) + " rupiah lagi");
      return;
    } else {
      total += price;
      balance -= price;
      System.out.println("==================================");
      System.out.println("Tiket berhasil dicetak");
      System.out.println("Uang kembalian anda sebesar " + balance + " rupiah");
      // proceeds to return the change (or the remaining balance in the machine) and print the ticket ...
      System.out.println("==================================");
      balance = 0;   // empty the balance to 0
    }
  }

  public static void main(String[] args) {
    // make an object of TicketMachine class with ticket price of 5000 rupiah
    TicketMachine ticketMachine = new TicketMachine(5000);

    // user inserts money and prints/checks the ticket balance untill the ticket is printed
    ticketMachine.insertMoney(2000);
    ticketMachine.printTicket();

    ticketMachine.insertMoney(1000);
    ticketMachine.printTicket();

    ticketMachine.insertMoney(1000);
    ticketMachine.printTicket();

    ticketMachine.insertMoney(1500);
    ticketMachine.printTicket();
  }
}

