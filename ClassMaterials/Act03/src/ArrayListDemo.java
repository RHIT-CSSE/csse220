import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        int[] nums = {10, 20, 15};
        ArrayList<Integer> numsList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            numsList.add(nums[i]);
        }
        System.out.println(nums);
        System.out.println(numsList);

        String[] leagues = {"MLS", "MLB", "NHL", "NFL", "NBA"};
        ArrayList<String> leaguesList = new ArrayList<>();
        for (String league : leagues) {
            leaguesList.add(league);
        }
        System.out.println(leagues);
        System.out.println(leaguesList);
        leaguesList.remove(2);
        leaguesList.add(3, "UFA");
        System.out.println(leaguesList);

    }

}
