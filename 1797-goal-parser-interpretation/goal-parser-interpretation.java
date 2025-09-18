class Solution {
    public String interpret(String command) {
        String r=command.replace("()","o").replace("(al)","al");
        return r;
    }
}