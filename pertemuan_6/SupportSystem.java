class SupportSystem {
  InputReader inputStr = new InputReader();
  Responder respondStr = new Responder();

  public void startSupport() {
    System.out.println("Welcome to the Sin'dorei Technical Support System.");
    System.out.println();
    System.out.println("Please tell us about your problem.");
    System.out.println("We will assist you with any problem you might have.");
    System.out.println("Please type 'bye' to exit our system.");

    String message = "";
    while (!message.equals("bye")) {
      message = inputStr.input();
      respondStr.respond(message);
    }
  }

  public static void main(String[] args) {
    SupportSystem system = new SupportSystem();
    system.startSupport();
  }
}
