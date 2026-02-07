class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int n = people.length;
        if(n == 1) return 1;
        int i = 0;
        int j = n-1;
        while(i <= j){
            int sum = people[i]+people[j];
            if(sum <= limit) i++;
            j--;
            boats++;
        }
        return boats;
    }
}