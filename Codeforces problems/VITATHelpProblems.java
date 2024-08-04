public class VITATHelpProblems {
    public static void main(String[] args) {
        System.out.println(findMin("29162","10524"));
    }

    private static int findMin (String s , String t){
        int countSwapsInS = 0,countSwapsInT = 0;
        if(s.charAt(0) > t.charAt(0)){
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i) > t.charAt(i)) countSwapsInS++;
                if(t.charAt(i) > s.charAt(i)) countSwapsInT++;
            }
            return Math.min(countSwapsInS, countSwapsInT + 1);
        } else if (t.charAt(0) > s.charAt(0)) {
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i) > t.charAt(i)) countSwapsInS++;
                if(t.charAt(i) > s.charAt(i)) countSwapsInT++;
            }
            return Math.min(countSwapsInS+1, countSwapsInT);
        }
        else{
            for (int i = 1; i < s.length(); i++) {
                if(s.charAt(i) > t.charAt(i)) countSwapsInS++;
                if(t.charAt(i) > s.charAt(i)) countSwapsInT++;
            }
            return Math.min(countSwapsInS, countSwapsInT);
        }
    }
}
