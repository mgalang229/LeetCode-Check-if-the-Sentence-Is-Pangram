class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] visited = new boolean[26];
        Arrays.fill(visited, false);
        for (int i = 0; i < sentence.length(); i++) {
            visited[sentence.charAt(i)-'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
}
