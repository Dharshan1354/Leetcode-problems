class Solution {
    public String sortVowels(String s) {
        HashSet <Character> vowels = new HashSet<>(
            Arrays.asList('A','E','I','O','U','a','e','i','o','u')
        );

        ArrayList<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(vowels.contains(ch))
                list.add(ch);
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char ch:s.toCharArray()){
            if(vowels.contains(ch))
                sb.append(list.get(index++));
            else
                sb.append(ch);
        }
        return sb.toString();
    }
}