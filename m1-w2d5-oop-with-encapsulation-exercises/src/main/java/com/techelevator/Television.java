package com.techelevator;


//# Television
//
//        ### Data Members
//
//        | Attribute | Data Type | Get | Set | Description |
//        |----------|-----------|-----|-----|-------------|
//        | isOn | boolean | X | | Whether or not the TV is turned on.  |
//        | currentChannel | int | X |  | The value for the current channel. Channel levels go between 3 and 18. |
//        | currentVolume | int | X | | The current volume level. |
//
//
//        ### Constructors
//
//        The `Television` class does not need a constructor. It can use the **default constructor**.
//
//        A new TV is off by default. The channel is set to 3 and the volume level to 2.
//
//        ### Methods
//
//        void turnOff()
//        void turnOn()
//        void changeChannel(int newChannel)
//        void channelUp()
//        void channelDown()
//        void raiseVolume()
//        void lowerVolume()
//
//
//        **Notes**
//        - `turnOff()` turns off the tv
//        - `turnOn()` besides turning the tv on, also resets the channel to 3 and the volume level to 2
//        - `changeChannel(int newChannel)` changes the current channel (only if it is on) to the value of `newChannel` as long as it is between 3 and 18
//        - `channelUp()` increases the current channel by 1 (only if it is on). If the value goes past 18, then the current channel should be set to 3.
//        - `channelDown()` decreases the current channel by 1 (only if it is on). If the value goes below 3, then the current channel should be set to 18.
//        - `raiseVolume()` increases the volume by 1 (only if it is on). The limit is 10
//        - `lowerVolume()` decreases the volume by 1 (only if it is on). The limit is 0


public class Television {

    private boolean isOn;
    private int currentChannel = 3;
    private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff() {
        isOn = false;

    }

    public void turnOn() {
        isOn = true;

    }

    public void changeChannel(int newChannel) {
        if (isOn && newChannel >= 3 && newChannel <= 18)
            currentChannel = newChannel;
    }

    public void channelUp() {
        if (isOn) {
            if (currentChannel == 18)
                currentChannel = 3;
            else currentChannel++;
        }
    }

    public void channelDown() {
        if (isOn) {
            if (currentChannel == 3)
                currentChannel = 18;
            else currentChannel--;
        }
    }

    public void raiseVolume() {
        if (isOn && currentVolume <= 9)
            currentVolume++;
    }

    public void lowerVolume() {
        if (isOn && currentVolume >= 1)
            currentVolume--;
    }
}

