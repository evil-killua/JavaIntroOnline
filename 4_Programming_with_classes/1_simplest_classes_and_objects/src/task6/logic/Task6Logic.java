package task6.logic;

import task6.bean.Time;

public class Task6Logic {

    public Time changeHour(Time time, int hour) {
        if ((time.getHour() + hour) > 23 || (time.getHour() + hour) < 0) {
            time.setHour(0);
        } else {
            time.setHour(time.getHour() + hour);
        }
        return time;
    }

    public Time changeMin(Time time, int min) {
        if ((time.getMinute() + min) > 59 || (time.getMinute() + min) < 0) {
            time.setMinute(0);
        } else {
            time.setMinute(time.getMinute() + min);
        }

        return time;
    }

    public Time changeSec(Time time, int sec) {
        if ((time.getSecond() + sec) > 59 || (time.getSecond() + sec) < 0) {
            time.setSecond(0);
        } else {
            time.setSecond(time.getSecond() + sec);
        }
        return time;
    }

}
