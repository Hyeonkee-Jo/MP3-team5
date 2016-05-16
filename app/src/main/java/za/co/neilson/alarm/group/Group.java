package za.co.neilson.alarm.group;

import android.widget.Toast;

import java.util.List;

import za.co.neilson.alarm.Alarm;
import za.co.neilson.alarm.AlarmActivity;

/**
 * Created by 14 on 5/3/2016.
 */
public class Group {
    Alarm alarm;
    List<User> users;
    User superUser;
    String code;
    boolean stopedAlarm;

    public Group(Alarm alarm, User superUser) {
        this.alarm = alarm;
        this.superUser = superUser;
        this.code = "a";
    }

    public String getCode() { return code; }

}
