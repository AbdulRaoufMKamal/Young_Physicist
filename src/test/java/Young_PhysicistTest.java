import org.junit.Test;

import static org.junit.Assert.*;

public class Young_PhysicistTest {

    @Test
    public void equilibrium() {
        Young_Physicist obj = new Young_Physicist();
        assertEquals("YES",obj.equilibrium(0,0,0));
        assertEquals("NO",obj.equilibrium(-3,-2,1));
        assertEquals("NO",obj.equilibrium(1,-2,-10));
        assertEquals("NO",obj.equilibrium(-12,-10,-3));
        assertEquals("NO",obj.equilibrium(0,100,0));
        assertEquals("NO",obj.equilibrium(65,0,0));
        assertEquals("NO",obj.equilibrium(10,98,-12));
        assertEquals("NO",obj.equilibrium(-1,5,-9));
        assertEquals("NO",obj.equilibrium(0,0,9));
        assertEquals("NO",obj.equilibrium(2,-1,10));
        assertEquals("NO",obj.equilibrium(1,1,1));
        assertEquals("NO",obj.equilibrium(-10,0,0));
        assertEquals("NO",obj.equilibrium(0,0,-19));
        assertEquals("NO",obj.equilibrium(0,-1,0));


    }
}