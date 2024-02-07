class Solution {
    public String interpret(String command) {
        command = command.replace("()","o");
        command = command.replace("(al)","al");
        // or we can do this in one line
        return command;
    }
}
