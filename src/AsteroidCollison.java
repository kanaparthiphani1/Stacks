import java.util.Stack;

public class AsteroidCollison {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!stk.empty() && (asteroids[i]<0) && stk.peek()>0){
                if(Math.abs(asteroids[i]) > stk.peek()){
                    stk.pop();
                }else if(Math.abs(asteroids[i]) == stk.peek()){
                    stk.pop();
                    asteroids[i] =0;
                }else{
                    asteroids[i] =0;
                }
            }

            if(asteroids[i]!=0){
                stk.push(asteroids[i]);
            }


        }

        int[] sol = new int[stk.size()];
        for(int i=0;i<sol.length;i++){
            sol[sol.length-i-1] = stk.pop();
        }

        return sol;
    }
}
