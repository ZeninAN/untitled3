public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int amountBonus = 1;
        int cost = price/bonus * amountBonus;
        return cost;
    }

}

