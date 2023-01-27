public class Main {
    public static void main(String[] args) {
        PersonslAccount personslAccount = new PersonslAccount("Mark", "12","3", 1984, "marks@gmail.com", "0683543691", "Volnovah", 77.3, 120.0, 5000);
        personslAccount.printAccountInfo();
        PersonslAccount personslAccount1 = new PersonslAccount("Albert", "30", "5", 1979, "al.bert@gmail.com", "0984103748", "Panakov", 81.0, 110.0, 10000);
        personslAccount1.printAccountInfo();
        PersonslAccount personslAccount2 = new PersonslAccount("Vlad", "01", "10", 1997, "vladov@gmail.com", "0955139785", "Novakov", 79.3, 130.0, 8000);
        personslAccount2.printAccountInfo();
        PersonslAccount personslAccount3 = new PersonslAccount("Honza", "10", "12", 1993, "panhonza@gmail.com", "0675673234", "Homonicky", 80.5, 120.0, 11000);
        personslAccount3.printAccountInfo();
        PersonslAccount personslAccount4 = new PersonslAccount("Martin", "18", "8",1987, "mart@gmail.com", "0988679182", "Morak", 87.9, 130.0, 4000);
        personslAccount4.printAccountInfo();
    }
}