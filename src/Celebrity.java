import java.util.Stack;

public class Celebrity {
    int[][] celeb;
    Celebrity(int[][] celeb) {
        this.celeb = celeb;
    }

    private boolean knows(int a, int b){
        if(celeb[a][b]==1){
            return true;
        }
        return false;
    }

    public int findCeleb(){
        Stack<Integer> stk = new Stack<>();

        int len = celeb.length;

        for (int i = 0; i < len; i++) {
            stk.push(i);
        }

        while (stk.size()>1){
            int a = stk.pop();
            int b = stk.pop();

            if(knows(a,b)){
                stk.push(b);
            }else {
                stk.push(a);
            }
        }

        int ans = stk.pop();

        boolean colCeleb= false;
        int colCount = 0;
        for(int i=0;i<len;i++){
            if(celeb[i][ans]==1){
                colCount++;
            }
        }
        if (colCount==len-1){
            colCeleb = true;
        }

        boolean rowCeleb= false;
        int rowCount = 0;
        for(int i=0;i<len;i++){
            if(celeb[ans][i]==0){
                rowCount++;
            }
        }
        if (rowCount==len){
            rowCeleb = true;
        }

        if(rowCeleb && colCeleb){
            return ans;
        }

        return -1;
    }
}
