package DSA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    private AirConditioner currentState;

    @BeforeEach
    public void setup(){
        currentState = new AirConditioner();
    }

    @Test
    public void testAirConditionerToTurnOn() {
        currentState.turnOn();
        assertTrue(currentState.isOn());
    }

    @Test
    public void testAirConditionerToTurnOff() {
        currentState.turnOn();
        currentState.turnOff();
        assertFalse(currentState.isOn());
    }

    @Test
    public void testAirConditionerTemperature() {
        currentState.turnOn();
        currentState.increaseTemperature();
        assertEquals( , currentState.increaseTemperature());
    }

}