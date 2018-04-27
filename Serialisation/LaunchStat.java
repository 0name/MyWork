package Serialisation;

import java.io.Serializable;
import java.util.Date;

public class LaunchStat implements Serializable {
        private static final long serialVersionUID = -1026585361238078747L;  // так лучше не делать, число берется из ошибки
        private Date lastLaunch;
    private int launchCount;

    private String lastUser;

    public boolean isFirstLaunch(){
        return launchCount == 0 && lastLaunch == null; //проверяет щетчик
    }

    public void updateState(){
        launchCount++;
        lastLaunch = new Date();
        lastUser = System.getProperty("user name");
    }

    @Override
    public String toString(){
        return "LaunchStat{" +
                "LaunchCount=" + launchCount +
                ",lastLaunch=" + lastLaunch +
                ",lastUser=" + lastUser +
                "}";
    }
}
