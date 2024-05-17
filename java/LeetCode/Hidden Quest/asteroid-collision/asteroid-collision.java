class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int i : asteroids){
            boolean isExplode = false;

            while(!stack.isEmpty() && i < 0 && stack.peek() > 0){
                if(Math.abs(i) > stack.peek()){
                    stack.pop();
                }else if(Math.abs(i) == stack.peek()){
                    stack.pop();
                    isExplode = true;
                    break;
                }else{
                    isExplode = true;
                    break;
                }
            }
            
            if(!isExplode){
                stack.push(i);
            }
        }

        int[] result = new int[stack.size()];
        for(int i=0; i<stack.size(); i++){
            result[i] = stack.get(i);
        }

        return result;
    }
}