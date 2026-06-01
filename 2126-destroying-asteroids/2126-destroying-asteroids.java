class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curMass=mass;
        for(int i=0;i<asteroids.length;i++){
           if(curMass>=asteroids[i]) curMass+=asteroids[i];
           if(curMass<asteroids[i]) return false; 
        }
        return true;
    }
}