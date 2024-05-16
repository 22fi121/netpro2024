public class Renshu {

    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }
    
    public int sumUpToN(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public int sumFromPtoQ(int p, int q){
        int sum = 0;
        if( p <= q) {
        for(int i = p; i<=q; i++) {
            sum += i;
        }
    }
    if( p > q) {
        for(int i = q; i<=p; i++) {
            sum += i;
        }
    }
        return sum;
    }

    public int sumFromArrayIndex(int[] a, int index){
        int sum=0;
        if(index < a.length){
            for(int i = index; i<a.length;i++){
                sum += a[i];
            }
        }else{
            sum = -1;
        }
        return sum;
    }

    public int selectMaxValue(int[] a){
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public int selectMinValue(int[] a){
        int min = a[0];
        for(int i = 1; i<a.length; i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public int selectMaxIndex(int[] a){
        int maxIndex = 0;
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            if(max<a[i]){
                max = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int selectMinIndex(int[] a){
        int minIndex = 0;
        int min = a[0];
        for(int i = 1; i<a.length; i++){
            if(min>a[i]){
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public void swapArrayElements(int[] p,int i,int j){
        int save = p[i];
        p[i] = p[j];
        p[j] = save;
    }

    public boolean swapTwoArrays(int[] a, int[] b){
        if(a.length == b.length){
        for(int i = 0; i<a.length; i++){
        int save = a[i];
        a[i] = b[i];
        b[i] = save;
        }
        return true;
    }else{
        return false;
    }

    }



}
