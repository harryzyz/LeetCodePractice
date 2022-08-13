public class No1672RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(accounts));
        int[][] accounts2 = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(accounts2));
        int[][] accounts3 = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println(maximumWealth(accounts3));
    }

    public static int maximumWealth(int[][] accounts) {
        int answer = 0;
        for (int i = 0; i < accounts.length; i++) {
            int totalWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                totalWealth += accounts[i][j];
            }
            if (answer < totalWealth) {
                answer = totalWealth;
            }
        }
        return answer;
    }
}
