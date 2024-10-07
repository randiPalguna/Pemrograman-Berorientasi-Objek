class Responder {
  public void respond(String respond) {
    if (!respond.equals("bye")) {
      System.out.println("That sounds interesting. Tell me more...");
    } else {
      System.out.println("Thank you for your time. Please feel free " + 
      "to reach out if you require further assistance. Have a pleasant day.");
    }
  }
}
