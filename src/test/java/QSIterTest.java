import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QSIterTestSwap{
    @Test
    void should(){
        int[] a = {5,3,5,8,10,20,-10,50,1,2,2,3,5};
        int[] b = {5,5,3,8,10,20,-10,50,1,2,2,3,5};
        QSIter.swap(a,1,2);
        assertArrayEquals(b,a);
    }
}
class QSIterTestSort {
    @Test
    void should(){
        int[] a = {5,3,5,8,10,20,-10,50,1,2,2,3,5};
        int[] b = {-10,1,2,2,3,3,5,5,5,8,10,20,50};
        QSIter.sort(a,0,a.length-1);
        assertArrayEquals(b,a);
    }

}

