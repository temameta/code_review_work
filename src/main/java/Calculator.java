public class Calculator {
    public int add(int a, int b){
        return  a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        //2x + 3 = 7 → x = 2
        //x = (7-3)/2 → 2
        return div(dif(7,3),2);
    }
}
