public class BonusMilesService {
        public  int calculate(int cost) {
            int rubForAMiles = 20;
            int bonus_miles = (cost / rubForAMiles);
            return bonus_miles;
        }
}
