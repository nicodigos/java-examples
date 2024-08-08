public class Second {
    public static void main(String[] args) {
        Government gobierno = new Government("socialism", 1999, 100);
        gobierno.display();
        gobierno.corruption.Govern(gobierno.popularity);
        gobierno.display();
    }
}

class Government {
    String ideology;
    int start_date;
    int popularity;
    StolenMoney corruption;


    public Government(String ideology, 
                      int start_date,
                      int popularity) {
        this.ideology = ideology;
        this.start_date = start_date; 
        this.popularity = popularity;
        this.corruption = new StolenMoney();
    }

    public void display() {
        System.err.println("Government," + 
                            this.ideology + 
                            ". Start Date, " + 
                            this.start_date +
                            ". Corruption, " +
                            this.corruption.display());
    }
}

class StolenMoney {
    int money;

    public StolenMoney() {
        this.money = 0;
    }

    public void Govern(int popularity) {
        int limit = popularity * 1000;
        while (money < limit) {
            money++;
        }
    }

    public int display() {
        return money;
    }
}