class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        HashMap<Character,Integer> mp=new HashMap<>();
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        int ans=0;
        for(int i=str.length()-1;i>=0;i--){
            if(i<str.length()-1 && mp.get(str.charAt(i))<mp.get(str.charAt(i+1)))
                ans-=mp.get(str.charAt(i));
            else
                ans+=mp.get(str.charAt(i));
        }
        return ans;
    }
}