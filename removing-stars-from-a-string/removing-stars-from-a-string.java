class Solution {
    public String removeStars(String s) {
        String[] split = s.split("");
        Stack<String> stack = new Stack<>();

        for(String elel : split){
            if(elel.equals("*")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(elel);
            }
        }
        
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < stack.size(); i++){
            stringBuilder.append(stack.get(i));
        }

        return stringBuilder.toString();
    }
}