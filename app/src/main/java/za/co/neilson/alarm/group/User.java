package za.co.neilson.alarm.group;

import java.io.Serializable;
import java.util.List;

import za.co.neilson.alarm.Alarm;

/**
 * Created by 14 on 5/3/2016.
 */
public class User implements Serializable{
    String id;
    String pw;
    List<Alarm> alarms;
    boolean isSuperUser;
    boolean isGameComplete;


    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
        this.isSuperUser = false;
    }

    public void addAlarm(Alarm alarm) { alarms.add(alarm); }

    public void deleteAlarm(Alarm alarm) { alarms.remove(alarm); }

    public String getId() {
        return id;
    }

    public String getPw() { return pw; }

}
