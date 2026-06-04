class Solution {
    public int totalWaviness(int num1, int num2) {
        int waves = 0;

        for (int i = num1; i <= num2; i++) {
            String s = String.valueOf(i);

            if (s.length() < 3) continue;

            for (int j = 1; j < s.length() - 1; j++) {
                if (isPeak(s, j)) waves++;
                if (isValley(s, j)) waves++;
            }
        }

        return waves;
    }

    public boolean isPeak(String s, int i) {
        return s.charAt(i) > s.charAt(i - 1)
                && s.charAt(i) > s.charAt(i + 1);
    }

    public boolean isValley(String s, int i) {
        return s.charAt(i) < s.charAt(i - 1)
                && s.charAt(i) < s.charAt(i + 1);
    }
}